package sec07_StringŬ����.exam02_method;

/*���ڿ� �յ� ���� �߶󳻱�(trim())
 * 	�߰��� ������ �߶��� ����
 * 		String oldStr = "   �ڹ� ���α׷���   ";
 * 		String newStr = oldStr.trim();
 * 		System.out.println(oldStr + "\n" + newStr);
 */
public class StringTrimExample {
	public static void main(String[] args) {
		String oldStr = "   �ڹ� ���α׷���   ";
		String newStr = oldStr.trim();
		System.out.println(oldStr + "\n" + newStr);

		String tel1 = " 02";
		String tel2 = "-123   ";
		String tel3 = "   -1234    ";
		
		String tel = tel1.trim() + tel2.trim() + tel3.trim();
		System.out.println(tel);
		
	}
}