package verify.exam06;

public class Child extends Parent{
	private String name;
	
	public Child() {
		//super()�� �� �� ����. �ֳ��ϸ�, this()�ڽĻ����ڿ� super()�θ� �����ڴ� ��� ù�ٿ� ȣ��Ǿ�� �ϹǷ�, ���� ��Ͽ� ���� �� ���� �����̴�.
		this("ȫ�浿");
		System.out.println("Child() call");
	}
	
	public Child(String name) {
		//super();�� �����Ǿ� ����.
		this.name = name;
		System.out.println("Child(String name) call");
	}
}