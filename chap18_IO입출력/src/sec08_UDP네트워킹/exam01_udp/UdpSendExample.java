package sec08_UDP��Ʈ��ŷ.exam01_udp;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetSocketAddress;

public class UdpSendExample{
	public static void main(String[] args) throws Exception {
		DatagramSocket ds = new DatagramSocket(); //���� �߻� ����
		
		System.out.println("[�߽� ����]");
		//3���� ���ļ� �����͸� ������
			for(int i=1; i<=3; i++) {
				String data = "�޼��� " + i;
				byte[] byteArr = data.getBytes("UTF-8");
				
				DatagramPacket dp = new DatagramPacket(
					byteArr, byteArr.length, new InetSocketAddress("localhost", 5001)
				);
				ds.send(dp);
				System.out.println("[���� ����Ʈ ��]: " + byteArr.length + "bytes");
			}
		System.out.println("[�߽� ����]");
		
		ds.close();
	}
}