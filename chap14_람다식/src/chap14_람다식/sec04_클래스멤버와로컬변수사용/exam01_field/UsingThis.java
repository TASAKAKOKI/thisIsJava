package chap14_���ٽ�.sec04_Ŭ��������ͷ��ú������.exam01_field;

public class UsingThis {
	public int outterField = 10;
	
	class Inner {
		int innerField = 20;
		
		void method() {
			//���ٽ� 
			MyFunctionalInterface fi = () -> {
				//���� �ʵ� ���� �̸��� Field�� ���Ҵٸ�, 
				//�ٱ� Ŭ������ ��Ʈ������ �����ϱ� ���ؼ���, ��Ŭ���� �̸�.this.�ʵ庯���̸� ���� ������ �� �ִ�.
				System.out.println("outterField: " + outterField);
				System.out.println("outterField: " + UsingThis.this.outterField + "\n");
				
				System.out.println("innerField: " + innerField);
				System.out.println("innerField: " + this.innerField);
			
			};
			
			fi.method();
		}
	}
}