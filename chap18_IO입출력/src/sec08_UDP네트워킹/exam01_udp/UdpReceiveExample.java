package sec08_UDP��Ʈ��ŷ.exam01_udp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class UdpReceiveExample {
	public static void main(String[] args) throws Exception {
		DatagramSocket ds = new DatagramSocket(5001); //���� �߻� ����
		
		//�����͸� ���� ���� ������ �� �����带 �����Ͽ� �޴� ���� ó���� �ִ� ���� ����.
			Thread thread = new Thread() {
				@Override
				public void run() {
					System.out.println("[���� ����]");
					try {
						while(true) {
							//�����͸� ���� ��Ŷ�� ����
							DatagramPacket dp = new DatagramPacket(new byte[100], 100);
							ds.receive(dp); //���� �߻� ����
							
							String data = new String(dp.getData(), 0, dp.getLength(), "UTF-8");
							System.out.println("[���� ����: " + dp.getSocketAddress() + "]" + data);
						}
					} catch (IOException e) {
						System.out.println("[���� ����]");
					} 
				}
			};
			thread.start();
			
			Thread.sleep(10000); //10�ʵ��� main�����尡 ��� �ߴٰ� datagramSocket��ü�� �ݾ��ش�.
								 //receive()�޼ҵ忡�� ���ܰ� �߻��Ͽ�, while���� ���������� �ȴ�.
			ds.close();
	}
}