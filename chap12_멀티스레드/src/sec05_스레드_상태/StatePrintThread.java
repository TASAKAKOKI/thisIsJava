package sec05_������_����;

public class StatePrintThread extends Thread{
	/*Thread.State ���Ż��  Enum Constant
		 *NEW:������ ��ü�� ������ ����, ���� start()�޼ҵ尡 ȣ����� ���� ����
		 *RUNNABLE: ���� ���·� �������� �� �� �ִ� ����
		 *BLOCKED: ��������� �ϴ� ��ü�� ���� Ǯ�� �� ����(����ȭ�� ���� ������) ��ٸ��� ����
		 *WAITING: �ٸ� �����尡 ������¸� ������ ������ ��ٸ��� ����
		 *TIMED_WAITING: �־��� �ð� ���� ��ٸ��»��� (e.g, sleep(int))
		 *TERMINATED: ������ ��ģ ����
		 *������� �ѹ� ��������� ����Ǹ�, ���̻� ��� �Ұ�, �ٽ� ����ϰ� �ʹٸ� ������ؾ��Ѵ�.
	*/
	private Thread targetThread;
	
	public StatePrintThread(Thread targetThread) {
		this.targetThread = targetThread;
	}
	@Override
	public void run() {
		while(true) {
			Thread.State state = targetThread.getState(); //�ش� �������� ���¸� ��ȯ(���Ż��Ÿ��::Thread.State)
			System.out.println("Ÿ�� �������� ����: " + state);
			if(state == Thread.State.NEW) {
				targetThread.start();
			}
			if(state == Thread.State.TERMINATED) {
				break;
			}
			try {
				Thread.sleep(500);
			} catch(Exception e) {}
		}
	}
}