package sec03.exam03_localClass_access;

public class Outter {
	//�ڹ�7����
	/*java7�������� final�� �ٿ� �־�߸� ����Ŭ���� ���ο��� �ܺ� Ŭ������ �Ű����̳� ���ú����� �����Ͽ� ����� �� �ִ�.
	�����ؾ� �ϴ� ������, �ܺ�Ŭ������ �޼ҵ尡 ���ᰡ �Ǿ ����Ŭ������ ����ؼ� �������� ���Ƽ� ����Ǿ�� �ϱ⶧���̴�.*/
	public void method1(final int arg) {
		final int localVar = 1;
		/*arg = 1;
		localVar = 10; final�� ���� �Ǿ����Ƿ�, �ʱ�ȭ �� �� ����.
		*/
		class Inner {
			void method() {
				int result = arg + localVar;
			}
		}
	}
	//�ڹ�8����
	/*java8���ʹ� finalŰ���带 �ٿ����� �ʾƵ�, finalƯ���� ���� �Ǿ� ����� �� �ִ�.
	�ٸ�, final�� ���� ���, ���� Ŭ������ ���ú��������� ����ǰ�,
	final�� ������ ���� ��쿡��, ���� Ŭ������ �ʵ念���� ���簡 �̷�����.*/
	public void method21(int arg) {
		int localVar = 1;
		/*arg = 1;
		localVar = 10; ���� Ŭ�������� ������ ���Ǿ����Ƿ�, finalƯ���� ���� �Ǿ� �ʱ�ȭ �� �� ����.
		*/
		class Inner {
			void method() {
				int result = arg + localVar;
			}
		}
	}
}