package sec08_StringTokenizerŬ����;

public class StringSplitExample {
	public static void main(String[] args) {
		String text = "ȫ�浿&�̼�ȫ,�ڸ��-���ڹ�-�ָ�ȣ";
		String[] names = text.split("&|,|-");
		for(String name : names) {
			System.out.println(name);
		}
	}
}