package sec08_UDP네트워킹.exam01_udp;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetSocketAddress;

public class UdpSendExample{
	public static void main(String[] args) throws Exception {
		DatagramSocket ds = new DatagramSocket(); //예외 발생 가능
		
		System.out.println("[발신 시작]");
		//3번에 걸쳐서 데이터를 보내기
			for(int i=1; i<=3; i++) {
				String data = "메세지 " + i;
				byte[] byteArr = data.getBytes("UTF-8");
				
				DatagramPacket dp = new DatagramPacket(
					byteArr, byteArr.length, new InetSocketAddress("localhost", 5001)
				);
				ds.send(dp);
				System.out.println("[보낸 바이트 수]: " + byteArr.length + "bytes");
			}
		System.out.println("[발신 종료]");
		
		ds.close();
	}
}