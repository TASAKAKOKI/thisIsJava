package verify.exam07;

public class FindAndReplaceExample {
	public static void main(String[] args) {
		String str = "��� ���α׷��� �ڹ� ���� ���ߵ� �� �ִ�.";
		int index = str.indexOf("�ڹ�"); //String�� �޼ҵ� (����Ÿ��:int) .indexOf(���ڿ�)�� ���
		if(index == -1) {
			System.out.println("�ڹ� ���ڿ��� ���ԵǾ� ���� �ʽ��ϴ�.");
		} else {
			System.out.println("�ڹ� ���ڿ��� ���ԵǾ� �ֽ��ϴ�.");
			str = str.replace("�ڹ�", "Java"); //String�� �޼ҵ� (����Ÿ��:String) .replace(oldStr,newStr)�� ���
			System.out.println(" --> " + str);
			
		}
	}
}