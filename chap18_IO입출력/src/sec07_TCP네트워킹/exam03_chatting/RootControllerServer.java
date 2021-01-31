package sec07_TCP네트워킹.exam03_chatting;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.URL;
import java.util.Iterator;
import java.util.List;
import java.util.ResourceBundle;
import java.util.Vector;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;

public class RootControllerServer implements Initializable {
	@FXML TextArea txtDisplay;
	@FXML Button btnStartStop;
	
	ExecutorService executorService;
	ServerSocket serverSocket;
	List<Client> connections = new Vector<Client>();//스레드에 안전한 Vertor클래스
	
	void startServer() {
		//서버 시작 코드(서버 시작시 호출되는메소드)
		executorService = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors()); //코어의 수 만큼 스레드를 갖는 스레드풀 생성
		
		try {
			serverSocket = new ServerSocket();
			serverSocket.bind(new InetSocketAddress("localhost", 5001));
		} catch(Exception e) {
			if(!serverSocket.isClosed()) {
				stopServer();
			}
			return;
		}
		
		//연결 수락을 위한 작업 객체 생성
		Runnable runnable = new Runnable() {
			@Override
			public void run() {
				//이 작업은 UI 변경  작업이므로, Java Application Thread에서 실행하도록 해준다.
				Platform.runLater( ()-> {
					displayText("[서버 시작]");
					btnStartStop.setText("Stop");
				});
				
				//서버에 연결 수락작업을 계속적으로 실행하도록 하는 코드
				while(true) {
					try {
						Socket socket = serverSocket.accept(); //accept()는 클라이언트가 연결 요청을 할 때까지 block되었다가, 연결요청이 되면 통신용 Socket을 반환
						String message ="[연결 수락: " + socket.getRemoteSocketAddress() + ": " + Thread.currentThread().getName() + "]";
						
						Platform.runLater( () -> {
							displayText(message);
						});
						
						Client client = new Client(socket);
						connections.add(client);
						Platform.runLater( () -> {
							displayText("[연결 개수: " + connections.size() + "]");
						});
					} catch(IOException e) {
						if(!serverSocket.isClosed()) {
							stopServer();
						}
						break;
					}
				}
			}
		};
		executorService.submit(runnable);
	}
	
	void stopServer() {
		//서버 종료 코드(서버 종료시 호출되는 메소드)
		try {
			Iterator<Client> iterator = connections.iterator();
			while(iterator.hasNext()) {
				Client client = iterator.next();
				client.socket.close();
				iterator.remove();
			}
			if(serverSocket != null && !serverSocket.isClosed()) {
				serverSocket.close();
			}
			if(executorService != null && !executorService.isShutdown()) {
				executorService.shutdown();
			}
			Platform.runLater( () -> {
				displayText("[서버 멈춤]");
				btnStartStop.setText("Start");
			});
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	class Client {
		//데이터 통신 코드(연결된 클라이언트를 표현하는데, 데이터 통신 코드를 포함한다.)
		Socket socket;
		Client(Socket socket) {
			this.socket = socket;
			receive();//항상 클라이언트에서 보낸 데이터를 받을 수 있도록 하기 위해서 생성시 receive() 메소드 호출
		}
		void receive() {
			//client에서 보낸 데이터를 항상 받을 준비를 해야 하므로, 별도의 스레드에서 client를 받을 수 있도록 해주어야 함.
			//따라서, 스레드풀에 읽기 작업객체(Runnable)을 sumbit한다.
			Runnable runnable = new Runnable() {
				@Override
				public void run() {
					try {
						//계속 클라이언트가 보내는 데이터를 받아야 하므로 무한루프를 생성
						//클라이언트가 비정상적 혹은 정상적으로 종료한 경우, catch문에 걸려 무한루프가 종료된다.
						while(true) {
							byte[] byteArr = new byte[100];
							InputStream inputStream = socket.getInputStream();
							
							//client가 비정상적으로 종료가 되면 read()실행시, IOException발생 가능
								int readByteCount = inputStream.read(byteArr);
						
							//클라이언트가 정상적으로 종료되었을 시, 강제적으로 예외발생시켜 무한루프를 빠져나감.
							//client가 정상적으로 종료가 되면 read()실행시, -1이 리턴된다
							//즉, Client가 Socket을 닫았으므로 아래의 코드를 실행하면 안 된다.
								if(readByteCount == -1) {
									throw new IOException();
								}
					
							//클라이언트가 정상적으로 요청을 하고 있는 경우, 실행되는 코드들
								String message = "[요청 처리: " + socket.getRemoteSocketAddress() + ": " +Thread.currentThread().getName() + "]";
								Platform.runLater( () -> displayText(message));
								
								String data = new String(byteArr, 0, readByteCount, "UTF-8");
								
								for(Client client : connections) {
									client.send(data);
								}
						}
					} catch (Exception e) {
						try {
							connections.remove(Client.this); //예외를 발생시킨 현재 client를 제거해주어야 한다.
							//여기에 this만 주면 runnable객체를 가리키게 된다. 
							String message = "[클라이언트 통신 안됨: " + socket.getRemoteSocketAddress() + ": " + Thread.currentThread().getName() + "]";
							Platform.runLater( () -> displayText(message));
							socket.close();	//예외 처리 필요
						} catch (IOException e1) {}						
					}
				}
			};
			executorService.submit(runnable); //스레드 풀 내부의 스레드가 runnable을 실행
		}
		void send(String data) {
			//우선 Runnable객체를 생성
				Runnable runnable = new Runnable() {
					@Override
					public void run() {
						try {
							byte[] byteArr = data.getBytes("UTF-8");
							OutputStream os = socket.getOutputStream();
							os.write(byteArr);
							os.flush();
							
						} catch (Exception e) {
							//getBytes() / getOuputStream() / write()등에서 예외 발생 가능 : client와 통신이 안 되는 경우.
							try {
								String message = "[클라이언트 통신 안됨: " + socket.getRemoteSocketAddress() + ": " + Thread.currentThread().getName() + "]";
								Platform.runLater( () -> displayText(message));
								connections.remove(Client.this);
								socket.close();//예외 발생 가능
							} catch (IOException e1) {
								e1.printStackTrace();
							}
						}
					}
				};
			//runnable객체를 스레드풀에서 처리할 수 있도록 submit()함
				executorService.submit(runnable);
		}
	}
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		
	}
	
	public void handleBtnStartStopAction(ActionEvent event) {
		if(btnStartStop.getText().equals("Start")) {
			startServer();
		} else if(btnStartStop.getText().equals("Stop")) {
			stopServer();
		}
	}
	
	void displayText(String text) {
		txtDisplay.appendText(text + "\n");
	}
}