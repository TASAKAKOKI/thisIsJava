package sec06_������_����_����.exam05_wait_notify_notifyAll2;

public class WaitNotifyExample {
	public static void main(String[] args) {
		DataBox dataBox = new DataBox();
		
		ProducerThread producerThread = new ProducerThread(dataBox);
		ConsummerThread consummerThread = new ConsummerThread(dataBox);
		
		producerThread.start();
		consummerThread.start();
	}
}