package sec08_UDP네트워킹.exam01_udp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class UdpReceiveExample {
	public static void main(String[] args) throws Exception {
		DatagramSocket ds = new DatagramSocket(5001); //예외 발생 가능
		
		//데이터를 받을 때는 가능한 한 스레드를 생성하여 받는 것을 처리해 주는 것이 좋다.
			Thread thread = new Thread() {
				@Override
				public void run() {
					System.out.println("[수신 시작]");
					try {
						while(true) {
							//데이터를 받은 패킷을 생성
							DatagramPacket dp = new DatagramPacket(new byte[100], 100);
							ds.receive(dp); //예외 발생 가능
							
							String data = new String(dp.getData(), 0, dp.getLength(), "UTF-8");
							System.out.println("[받은 내용: " + dp.getSocketAddress() + "]" + data);
						}
					} catch (IOException e) {
						System.out.println("[수신 종료]");
					} 
				}
			};
			thread.start();
			
			Thread.sleep(10000); //10초동안 main스레드가 대기 했다가 datagramSocket객체를 닫아준다.
								 //receive()메소드에서 예외가 발생하여, while문을 빠져나오게 된다.
			ds.close();
	}
}