package sec04.exam02_parent_method_call;

public class SupersonicAirplane extends Airplane{
	//static final�� �̿��Ͽ� ����� 2�� ������ �ش�.
	//����� �������� ����Ǿ����Ƿ�, ��ü�� �����ϱ� ������ Ŭ������ ���ؼ��� ������ �� �ִ�.
	public static final int NORMAL = 1;
	public static final	int SUPERSONIC = 2;
	
	public int flymode = NORMAL;
	
	@Override
	public void fly() {
		// TODO Auto-generated method stub
		if(flymode == SUPERSONIC) {
			System.out.println("������ �����մϴ�.");
		} else {
			//�θ� Ŭ������ ���� .fly()�� ȣ�����ش�.
			super.fly();			
		}
	}
	
}
