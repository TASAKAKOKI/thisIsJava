package sec05.exam04_;

public class Anonymous {
	private int field;

	/* field�� privateŰ���尡 �پ��ֱ� ������, ��ӹ��� ��ü������ ��� ������ �� �ִ�.
	 * ������, �Ʒ� method�� �Ű������� �־���, arg1, arg2�� ���ú����� ����� var1, var2�� method()�� ������ ������,
	 * ���� �޸𸮿��� �����ȴ�. �׷���, ���޸𸮿� �����ϴ� Calculator ���� ��ü�� ���̻� ������ ����� �� ���µ�, 
	 * �̸� ���� ������ �� �ڵ����� Calculator ��ü �ȿ� ����ȴ�.
	*/
	public void method(final int arg1, int arg2) {
		final int var1 = 0;
		int var2 = 0;
		
		field = 10;
		
		//arg1 = 20; (X): arg1�� final Ű���尡 �پ�����, ���� �������̽����� ���Ǿ����Ƿ� �ʱ�ȭ �� �� ����.
		//arg2 = 20; (X): arg2�� �������̽����� ���Ǿ����Ƿ� �ʱ�ȭ �� �� ����.		
	
		//var1 = 30; (X): var1�� final Ű���尡 �پ�����, ���� �������̽����� ���Ǿ����Ƿ� �ʱ�ȭ �� �� ����.
		//var2 = 30; (X): var2��  �������̽����� ���Ǿ����Ƿ� �ʱ�ȭ �� �� ����.
		
		Calculator calc = new Calculator() {
			@Override
			public int sum() {
				int result = field+arg1+arg2+var1+var2;
				return result;
			}
		};
		System.out.println(calc.sum());
	}
}