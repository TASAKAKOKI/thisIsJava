package sec07_TCP��Ʈ��ŷ.exam03_chatting;

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
		//���� ���� �ڵ�
		//������ ������ �Ǳ� ������ blocking�� �Ǳ� ������, JavaFX Application Thread�� ��û�� ó���ϵ��� ���� �ʴ� ���� ����.
		//������ �͸�ü �����Ͽ� Run()�޼ҵ� ������ ���ش�.
			Thread thread = new Thread() {
				@Override
				public void run() {
					try {
						socket = new Socket();
						socket.connect(new InetSocketAddress("localhost", 5001)); //IP�ּ� Ȥ�� Port��ȣ�� �ٸ� ��� ���� �߻�
						Platform.runLater( () -> {
							displayText("[���� �Ϸ�: " + socket.getRemoteSocketAddress() + ": " + Thread.currentThread().getName() + "]");
							btnConn.setText("STOP");
							btnSend.setDisable(false);
						});
					} catch (IOException e) {
						//5001������ ������ ���������� ���� ���,
						Platform.runLater( () -> {
							displayText("[���� ��� �� ��]");
							if(!socket.isClosed()) { stopClient(); }
						});
						return; //run()�޼ҵ� ���� ��Ŵ
					}
					//������ �����ϸ�(���ܰ� �߻����� ������ �����͸� �ޱ� ó��
						receive();
				}
			};
			thread.start();
	}
	void stopClient() {
		//���� ���� �ڵ�
		try {
			Platform.runLater( () -> {
				displayText("[���� ����]");
				btnConn.setText("START");
				btnSend.setDisable(true);
			});
			if(socket != null && !socket.isClosed()) {
				socket.close();
			}	
		}	catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace(); //���� �߻�����!
		}
	}
	void receive() {
		//������ �ޱ� �ڵ�
		//�׻� ������ �����͸� �޾ƿ;� �ϹǷ�, ���ѷ����� �ۼ�
			while(true) {
				try {
					byte[] byteArr = new byte[100];
					InputStream is = socket.getInputStream(); //���� �߻� ����
					
					//���� �߻� ����: ������ �����͸� ������ ������ read()�� blocking�Ǿ� �ִ�.
						int readByteCount = is.read(byteArr);	//������ �����͸� ������ ��μ� ���� �����͸� �����ϰ� ���� ����Ʈ ���� �����Ѵ�.
																//������ socket�� ���������� �����ϸ� -1�� ����
																//������ ������������ �����ϰ� �Ǹ� IOException ���� �߻�
					//������ ���������� socket�� �����ϸ� ���������� IOException �߻���Ŵ
						if(readByteCount == -1) {
							throw new IOException();
						}
					//���������� �����͸� �о��� ��쿡�� �Ʒ��� �ڵ���� �����
						String data = new String(byteArr, 0, readByteCount, "UTF-8");
						
						Platform.runLater( () -> displayText("[�ޱ� �Ϸ�]" + data));
				}  catch(Exception e) {
					Platform.runLater( ()-> displayText("[���� ��� �ϵ�]"));
					stopClient();
					break; //������ ����� �ȵǴ� ���, ���̻� �����͸� �ޱ� ���� ��ٸ��� �ʾƵ� �ǵ��� break������ while�� Ż���Ų��.
				}
			}
	}
	void send(String data) {
		//������ ���� �ڵ�
		//�����͸� ������ �� �ð��� ���� �ɸ��� UI�� �����ְ� �ǹǷ�, ������ JavaFX Application Thread�� �������� �ʵ��� �ϴ� ���� ����.
		//���� �����带 �������ְ� run()�� ������ ���ش�.
			Thread thread = new Thread() {
				@Override
				public void run() {
					try {
						byte[] byteArr = data.getBytes("UTF-8");
						OutputStream os = socket.getOutputStream(); //���� �߻� ����
						os.write(byteArr); //������ ��� �ȵǴ� ��� ���� �߻� ����
						os.flush();
						
						Platform.runLater( () -> displayText("[������ �Ϸ�]"));
					} catch (Exception e) {
						Platform.runLater( () -> displayText("[���� ��� �ȵ�"));
						stopClient();
					}
				}
			};
			thread.start();
	}
	
	//JavaFX UI���� �ڵ�/////////////// 
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