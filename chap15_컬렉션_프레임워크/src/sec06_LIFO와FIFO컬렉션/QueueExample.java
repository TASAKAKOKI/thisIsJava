package sec06_LIFO와FIFO컬렉션;

import java.util.LinkedList;
import java.util.Queue;

/*FIFO 자료구조를 구현한 Queue클래스: 먼저 넣은 자료를 먼저 반환한다.*/
public class QueueExample {
	public static void main(String[] args) {
		Queue<Message> messageQueue = new LinkedList<>();
		
		messageQueue.offer(new Message("sendMail", "홍길동"));
		messageQueue.offer(new Message("sendSNS", "김자바"));
		messageQueue.offer(new Message("sendKakaoTalk", "임꺽정"));
	
		while(!messageQueue.isEmpty()) {
			Message message = messageQueue.poll();
			System.out.println(message.to + "님에게 " + message.media + "을(를) 보냅니다.");
		}
	}
}