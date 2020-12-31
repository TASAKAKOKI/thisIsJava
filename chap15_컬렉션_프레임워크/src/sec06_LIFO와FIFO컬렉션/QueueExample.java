package sec06_LIFO��FIFO�÷���;

import java.util.LinkedList;
import java.util.Queue;

/*FIFO �ڷᱸ���� ������ QueueŬ����: ���� ���� �ڷḦ ���� ��ȯ�Ѵ�.*/
public class QueueExample {
	public static void main(String[] args) {
		Queue<Message> messageQueue = new LinkedList<>();
		
		messageQueue.offer(new Message("sendMail", "ȫ�浿"));
		messageQueue.offer(new Message("sendSNS", "���ڹ�"));
		messageQueue.offer(new Message("sendKakaoTalk", "�Ӳ���"));
	
		while(!messageQueue.isEmpty()) {
			Message message = messageQueue.poll();
			System.out.println(message.to + "�Կ��� " + message.media + "��(��) �����ϴ�.");
		}
	}
}