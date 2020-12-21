package sec06_스레드_상태_제어.exam05_;

public class ProducerThread extends Thread{
	private DataBox dataBox;
	
	public ProducerThread(DataBox dataBox) {
		this.setName("ProducerThread");
		this.dataBox = dataBox;
	}
	
	@Override
	public void run() {
		for(int i=1; i<=3; i++) {
			String data = "Data=" +i;
			dataBox.setData(data);
		}
	}
}
