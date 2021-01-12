package sec06_스레드_상태_제어.exam05_wait_notify_notifyAll2;

public class ConsummerThread extends Thread{
	private DataBox dataBox;
	
	public ConsummerThread(DataBox dataBox) {
		this.setName("ConsummerThread");
		this.dataBox = dataBox;
	}
	
	@Override
	public void run() {
		for(int i=1; i<=3; i++) {
			String data = dataBox.getData();
			System.out.println("ConsummerThread가 [" +data +"] 를 사용합니다.");
		}
	}
}
