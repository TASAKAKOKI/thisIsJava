package sec06_스레드_상태_제어.exam;

public class WaitNotifyExample {
	public static void main(String[] args) {
		DataBox dataBox = new DataBox();
		
		ProducerThread producerThread = new ProducerThread(dataBox);
		ConsummerThread consummerThread = new ConsummerThread(dataBox);
		
		producerThread.start();
		consummerThread.start();
	}
}