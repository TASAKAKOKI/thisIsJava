package sec07_TCP��Ʈ��ŷ.exam03_chatting;

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
	List<Client> connections = new Vector<Client>();//�����忡 ������ VertorŬ����
	
	void startServer() {
		//���� ���� �ڵ�(���� ���۽� ȣ��Ǵ¸޼ҵ�)
		executorService = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors()); //�ھ��� �� ��ŭ �����带 ���� ������Ǯ ����
		
		try {
			serverSocket = new ServerSocket();
			serverSocket.bind(new InetSocketAddress("localhost", 5001));
		} catch(Exception e) {
			if(!serverSocket.isClosed()) {
				stopServer();
			}
			return;
		}
		
		//���� ������ ���� �۾� ��ü ����
		Runnable runnable = new Runnable() {
			@Override
			public void run() {
				//�� �۾��� UI ����  �۾��̹Ƿ�, Java Application Thread���� �����ϵ��� ���ش�.
				Platform.runLater( ()-> {
					displayText("[���� ����]");
					btnStartStop.setText("Stop");
				});
				
				//������ ���� �����۾��� ��������� �����ϵ��� �ϴ� �ڵ�
				while(true) {
					try {
						Socket socket = serverSocket.accept(); //accept()�� Ŭ���̾�Ʈ�� ���� ��û�� �� ������ block�Ǿ��ٰ�, �����û�� �Ǹ� ��ſ� Socket�� ��ȯ
						String message ="[���� ����: " + socket.getRemoteSocketAddress() + ": " + Thread.currentThread().getName() + "]";
						
						Platform.runLater( () -> {
							displayText(message);
						});
						
						Client client = new Client(socket);
						connections.add(client);
						Platform.runLater( () -> {
							displayText("[���� ����: " + connections.size() + "]");
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
		//���� ���� �ڵ�(���� ����� ȣ��Ǵ� �޼ҵ�)
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
				displayText("[���� ����]");
				btnStartStop.setText("Start");
			});
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	class Client {
		//������ ��� �ڵ�(����� Ŭ���̾�Ʈ�� ǥ���ϴµ�, ������ ��� �ڵ带 �����Ѵ�.)
		Socket socket;
		Client(Socket socket) {
			this.socket = socket;
			receive();//�׻� Ŭ���̾�Ʈ���� ���� �����͸� ���� �� �ֵ��� �ϱ� ���ؼ� ������ receive() �޼ҵ� ȣ��
		}
		void receive() {
			//client���� ���� �����͸� �׻� ���� �غ� �ؾ� �ϹǷ�, ������ �����忡�� client�� ���� �� �ֵ��� ���־�� ��.
			//����, ������Ǯ�� �б� �۾���ü(Runnable)�� sumbit�Ѵ�.
			Runnable runnable = new Runnable() {
				@Override
				public void run() {
					try {
						//��� Ŭ���̾�Ʈ�� ������ �����͸� �޾ƾ� �ϹǷ� ���ѷ����� ����
						//Ŭ���̾�Ʈ�� �������� Ȥ�� ���������� ������ ���, catch���� �ɷ� ���ѷ����� ����ȴ�.
						while(true) {
							byte[] byteArr = new byte[100];
							InputStream inputStream = socket.getInputStream();
							
							//client�� ������������ ���ᰡ �Ǹ� read()�����, IOException�߻� ����
								int readByteCount = inputStream.read(byteArr);
						
							//Ŭ���̾�Ʈ�� ���������� ����Ǿ��� ��, ���������� ���ܹ߻����� ���ѷ����� ��������.
							//client�� ���������� ���ᰡ �Ǹ� read()�����, -1�� ���ϵȴ�
							//��, Client�� Socket�� �ݾ����Ƿ� �Ʒ��� �ڵ带 �����ϸ� �� �ȴ�.
								if(readByteCount == -1) {
									throw new IOException();
								}
					
							//Ŭ���̾�Ʈ�� ���������� ��û�� �ϰ� �ִ� ���, ����Ǵ� �ڵ��
								String message = "[��û ó��: " + socket.getRemoteSocketAddress() + ": " +Thread.currentThread().getName() + "]";
								Platform.runLater( () -> displayText(message));
								
								String data = new String(byteArr, 0, readByteCount, "UTF-8");
								
								for(Client client : connections) {
									client.send(data);
								}
						}
					} catch (Exception e) {
						try {
							connections.remove(Client.this); //���ܸ� �߻���Ų ���� client�� �������־�� �Ѵ�.
							//���⿡ this�� �ָ� runnable��ü�� ����Ű�� �ȴ�. 
							String message = "[Ŭ���̾�Ʈ ��� �ȵ�: " + socket.getRemoteSocketAddress() + ": " + Thread.currentThread().getName() + "]";
							Platform.runLater( () -> displayText(message));
							socket.close();	//���� ó�� �ʿ�
						} catch (IOException e1) {}						
					}
				}
			};
			executorService.submit(runnable); //������ Ǯ ������ �����尡 runnable�� ����
		}
		void send(String data) {
			//�켱 Runnable��ü�� ����
				Runnable runnable = new Runnable() {
					@Override
					public void run() {
						try {
							byte[] byteArr = data.getBytes("UTF-8");
							OutputStream os = socket.getOutputStream();
							os.write(byteArr);
							os.flush();
							
						} catch (Exception e) {
							//getBytes() / getOuputStream() / write()��� ���� �߻� ���� : client�� ����� �� �Ǵ� ���.
							try {
								String message = "[Ŭ���̾�Ʈ ��� �ȵ�: " + socket.getRemoteSocketAddress() + ": " + Thread.currentThread().getName() + "]";
								Platform.runLater( () -> displayText(message));
								connections.remove(Client.this);
								socket.close();//���� �߻� ����
							} catch (IOException e1) {
								e1.printStackTrace();
							}
						}
					}
				};
			//runnable��ü�� ������Ǯ���� ó���� �� �ֵ��� submit()��
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