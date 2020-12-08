package sec05.exam01_;

public class Anonymous {
	//�ʵ� �ʱⰪ���� �͸��ڽİ�ü ����
	Person parentField = new Person() {
		/*�͸�ü ���� �޼ҵ�� �͸�ü �����Ͼȿ����� ���� �� �ִ�.
		work()�޼ҵ�� ������ ��ü�� wake()�޼ҵ带 ȣ���Ͽ� �� �ȿ��� ȣ��� �޼ҵ�θ� ȣ���� �� �ִ�.
		*/
		void work() {
			System.out.println("�͸�ü �ʵ�_�͸�ü�� �޼ҵ�ȣ��: ����մϴ�.");
		}
		@Override
		public void wake() {
			System.out.println("�͸�ü �ʵ�_Person()��ü�� �⺻�޼ҵ� ȣ��: 8�ÿ� �Ͼ�ڽ��ϴ�..");
			work();
			System.out.println("----------------------------------");
		}
	};
	
	void method1() {
		//���� ���������� �͸��ڽİ�ü ����
		Person parentLocalValue = new Person() {
			/*����������, �͸�ü ���� �޼ҵ�� ���������� �͸�ü�� ���ԵǾ, �͸�ü ������ �ȿ����� ���, ȣ�� �����ϴ�.
			*/
			void walk() {
				System.out.println("�͸�ü ���ú���_�͸�ü�� �޼ҵ�ȣ��: �Ƚ��ϴ�.");
			}
			@Override
			public void wake() {
				System.out.println("�͸�ü ���ú���_Person()��ü�� �⺻�޼ҵ� ȣ��: 6�ÿ� �Ͼ���!");
				walk();
				System.out.println("----------------------------------");
			}
		};
		//���� ���� ���
		parentLocalValue.wake();
	}
	
	//�޼ҵ��� �Ű������� person��ü�� �� �� �ִµ�, �̶����� ���� �͸�ü�� �����Ͽ� �Ű������� �� �� �ִ�.
	void method2(Person person) {
		person.wake();
	}
}