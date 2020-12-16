package verify.exam09;

public class StringBuilderExample {
	public static void main(String[] args) {
		//������ �ڵ���� 100���� String��ü�� ����� ������ ȿ�������� �ʴ�.
		//String ��ü�� ������ �Ұ��ϴٴ� Ư���� �ֱ� �����̴�.
		String str = "";
		for(int i = 0; i <= 100; i++) {
			str += i;
		}
		System.out.println(str);
		
		//�̸� ����, StringBuilder(java.lang.StringBuilder)Ŭ������ �̿��ϸ� ����.
		//StringBuilder�� ������ ��ü �ϳ����� ��� ���游 �� ���̴�.
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i <= 100; i++) {
			sb.append(i);
		}
		System.out.println(sb);
	}
}