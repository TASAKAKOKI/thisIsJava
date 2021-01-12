package sec06_스레드_상태_제어.exam05_wait_notify_notifyAll2;

public class DataBox { //해당클래스는 공유객체 역할을 한다.
	private String data;

	public synchronized String getData() { //동기화 처리를 해주어야 wait()과 notify()를 사용할 수 있다.
		if(this.data == null) {
			try {
				wait();
			} catch(InterruptedException e) {}
		}
		String returnValue = this.data;
		System.out.println("ConsummerThread가 읽은 데이터: " + returnValue);
		data = null;
		notify();
		return returnValue;
	}

	public synchronized void setData(String data) { //동기화 처리를 해주어야 wait()과 notify()를 사용할 수 있다.
		if(this.data != null) {
			try {
				wait();
			} catch(InterruptedException e) {}
		}
		this.data = data;
		System.out.println("ProducerThread가 생성한 데이터: " + data);
		notify();
	}
}