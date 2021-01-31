package sec07_TCP네트워킹.exam03_chatting;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.Socket;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class ClientExample extends Application{
	Socket socket;
	
	void startClient() {
		//연결 시작 코드
		//서버와 연결이 되기 전까지 blocking이 되기 때문에, JavaFX Application Thread가 요청을 처리하도록 하지 않는 것이 좋다.
		//스레드 익명객체 생성하여 Run()메소드 재정의 해준다.
			Thread thread = new Thread() {
				@Override
				public void run() {
					try {
						socket = new Socket();
						socket.connect(new InetSocketAddress("localhost", 5001)); //IP주소 혹은 Port번호가 다를 경우 예외 발생
						Platform.runLater( () -> {
							displayText("[연결 완료: " + socket.getRemoteSocketAddress() + ": " + Thread.currentThread().getName() + "]");
							btnConn.setText("STOP");
							btnSend.setDisable(false);
						});
					} catch (IOException e) {
						//5001번에서 서버가 실행중이지 않은 경우,
						Platform.runLater( () -> {
							displayText("[서버 통신 안 됨]");
							if(!socket.isClosed()) { stopClient(); }
						});
						return; //run()메소드 종료 시킴
					}
					//연결이 성공하면(예외가 발생하지 않으면 데이터를 받기 처리
						receive();
				}
			};
			thread.start();
	}
	void stopClient() {
		//연결 끊기 코드
		try {
			Platform.runLater( () -> {
				displayText("[연결 끊음]");
				btnConn.setText("START");
				btnSend.setDisable(true);
			});
			if(socket != null && !socket.isClosed()) {
				socket.close();
			}	
		}	catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace(); //예외 발생가능!
		}
	}
	void receive() {
		//데이터 받기 코드
		//항상 서버의 데이터를 받아와야 하므로, 무한루프로 작성
			while(true) {
				try {
					byte[] byteArr = new byte[100];
					InputStream is = socket.getInputStream(); //예외 발생 가능
					
					//예외 발생 가능: 서버가 데이터를 보내기 전까지 read()는 blocking되어 있다.
						int readByteCount = is.read(byteArr);	//서버가 데이터를 보내면 비로소 읽은 데이터를 저장하고 읽은 바이트 수를 리턴한다.
																//서버가 socket을 정상적으로 종료하면 -1을 리턴
																//서버가 비정상적으로 종료하게 되면 IOException 예외 발생
					//서버가 정상적으로 socket을 종료하면 강제적으로 IOException 발생시킴
						if(readByteCount == -1) {
							throw new IOException();
						}
					//정상적으로 데이터를 읽었을 경우에만 아래의 코드들이 실행됨
						String data = new String(byteArr, 0, readByteCount, "UTF-8");
						
						Platform.runLater( () -> displayText("[받기 완료]" + data));
				}  catch(Exception e) {
					Platform.runLater( ()-> displayText("[서버 통신 완됨]"));
					stopClient();
					break; //서버와 통신이 안되는 경우, 더이상 데이터를 받기 위해 기다리지 않아도 되도록 break문으로 while문 탈출시킨다.
				}
			}
	}
	void send(String data) {
		//데이터 전송 코드
		//데이터를 보내는 데 시간이 오래 걸리면 UI가 멈춰있게 되므로, 가능한 JavaFX Application Thread가 실행하지 않도록 하는 것이 좋다.
		//따라서 스레드를 생성해주고 run()을 재정의 해준다.
			Thread thread = new Thread() {
				@Override
				public void run() {
					try {
						byte[] byteArr = data.getBytes("UTF-8");
						OutputStream os = socket.getOutputStream(); //예외 발생 가능
						os.write(byteArr); //서버가 통신 안되는 경우 예외 발생 가능
						os.flush();
						
						Platform.runLater( () -> displayText("[보내기 완료]"));
					} catch (Exception e) {
						Platform.runLater( () -> displayText("[서버 통신 안됨"));
						stopClient();
					}
				}
			};
			thread.start();
	}
	
	//JavaFX UI생성 코드/////////////// 
	TextArea txtDisplay;
	TextField txtInput;
	Button btnConn, btnSend;
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		BorderPane root = new BorderPane();
		root.setPrefSize(500.0, 300.0);

		txtDisplay = new TextArea();
		txtDisplay.setEditable(false);
		BorderPane.setMargin(txtDisplay, new Insets(0,0,2,0));
		root.setCenter(txtDisplay);
		
		BorderPane bottom = new BorderPane();
			txtInput = new TextField();
			txtInput.setPrefSize(60.0, 30.0);
			BorderPane.setMargin(txtInput,  new Insets(0,1,1,1));
			
			btnConn = new Button("START");
			btnConn.setPrefSize(60.0, 30.0);
			btnConn.setOnAction(e -> {
				if(btnConn.getText().equals("START")) {
					startClient();
				} else if(btnConn.getText().equals("STOP")) {
					stopClient();
				}
			});
			
			btnSend = new Button("SEND");
			btnSend.setPrefSize(60.0, 30.0);
			btnSend.setDisable(true);
			btnSend.setOnAction(e -> { send(txtInput.getText()); });
			
			bottom.setCenter(txtInput);
			bottom.setLeft(btnConn);
			bottom.setRight(btnSend);
		root.setBottom(bottom);

		Scene scene = new Scene(root);
		scene.getStylesheets().add(getClass().getResource("app.css").toString());
		primaryStage.setScene(scene);
		primaryStage.setTitle("chattingClient");
		primaryStage.setOnCloseRequest(e -> stopClient());
		primaryStage.show();
	}
	
	void displayText(String text) {
		txtDisplay.appendText(text + "\n");
	}

	public static void main(String[] args) {
		launch(args);
	}
}