package sec08_StringTokenizerŬ����;

import java.util.StringTokenizer;

public class StringTokenizerExample {
	public static void main(String[] args) {
		String text = "ȫ�浿/�̼�ȫ/�ڸ��";
		StringTokenizer st = new StringTokenizer(text,"/");
		//StringTokenizer��ü�� �����ϱ� ���ؼ��� java.util.StringTokenizer ��Ű���� import���־�� �Ѵ�.
		int countTokens = st.countTokens();
		System.out.println("�� ��ū ��: " + countTokens);
		while(st.hasMoreTokens()) {
			String name = st.nextToken();
			System.out.println(name + "���� ��ū ��: " + st.countTokens());
		}
	}
}