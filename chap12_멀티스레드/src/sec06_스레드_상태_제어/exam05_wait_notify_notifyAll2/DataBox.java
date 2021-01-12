package sec06_������_����_����.exam05_wait_notify_notifyAll2;

public class DataBox { //�ش�Ŭ������ ������ü ������ �Ѵ�.
	private String data;

	public synchronized String getData() { //����ȭ ó���� ���־�� wait()�� notify()�� ����� �� �ִ�.
		if(this.data == null) {
			try {
				wait();
			} catch(InterruptedException e) {}
		}
		String returnValue = this.data;
		System.out.println("ConsummerThread�� ���� ������: " + returnValue);
		data = null;
		notify();
		return returnValue;
	}

	public synchronized void setData(String data) { //����ȭ ó���� ���־�� wait()�� notify()�� ����� �� �ִ�.
		if(this.data != null) {
			try {
				wait();
			} catch(InterruptedException e) {}
		}
		this.data = data;
		System.out.println("ProducerThread�� ������ ������: " + data);
		notify();
	}
}