package sec07_StringŬ����.exam02_method;

/*���ڿ� ��ġ(replace())
 * 	ù��° �Ű���(String)�� ã�� �ι�° �Ű���(String)���� ��ġ�� ���ο� ���ڿ��� ����
 */
public class StringReplaceExample {
	public static void main(String[] args) {
		String oldStr = "�ڹٸ� ��ü�������Դϴ�. �ڹٴ� ǳ���� API�� �����մϴ�.";
		String newStr = oldStr.replace("�ڹ�", "java"); 
		System.out.println(oldStr + "\n" + newStr);
	}
}