package sec07_StringŬ����.exam02_method;

/*���ڿ�ã��(indexOf)
 * 	�Ű������� �־��� ���ڿ��� ���۵Ǵ� �ε����� ����
 * 	���� ���ԵǾ� ���� ������ -1�� ����
 * 	Ư�� ���ڿ��� ���ԵǾ� �ִ��� ���ο� ���� ���� �ڵ带 �޸��� �� ���� ���
 *
 */
public class StringIndexOfExample {
	public static void main(String[] args) {
		String subject = "�ڹ� ���α׷���";
		
		int location = subject.indexOf("���α׷���"); //indexOf(String str)�� �Ű������� �־��� ���ڿ��� �����ϴ� ��ġ�� �ε��� ���� ��ȯ�Ѵ�.(������ -1)
		System.out.println(location);
		
		if(subject.indexOf("�ڹ�")!=-1) {
			System.out.println("�ڹٿ� ���õ� å�̱���");
		} else {
			System.out.println("�ڹٿ� ������ ���� å�̱���");
		}
	}
}