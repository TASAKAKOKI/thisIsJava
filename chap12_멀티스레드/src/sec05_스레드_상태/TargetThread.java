package sec05_������_����;

public class TargetThread extends Thread{
	@Override
	public void run() {
		for(long i = 0; i < 1000000000; i++) {}
				
		try {
			Thread.sleep(1500);//�����带 1.5�ʰ�(1500ms) TIMED_WAITING���·� ��ȯ��Ű��, �� ȣ���� ���ܰ� �߻��� �� �����Ƿ� try catch������ ó�����ش�.
		} catch(Exception e) {
			
		}
		for(long i = 0; i < 1000000000; i++) {}
	}
}