package sec09_StringBuffer_StringBuilderŬ����;

public class StringBuilderExample {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder(); //�⺻ ũ���� StringBuilder��ü ����
		sb.append(true);
		sb.append(" ");
		sb.append(0.1);
		sb.append(" ");
		sb.append("c");
		sb.append(" ");
		sb.append(100);
		sb.append(" ");
		sb.append("java 8");
		System.out.println(sb);
		
		sb.insert(4, "4"); //�ε��� 4�� ��ġ�� �־��� ���ڸ� ���� : �̶�, ���� ���ڿ����� �� ĭ�� �ڷ� �з�����.
		System.out.println(sb);
		

		sb.setCharAt(7, '7'); //�ε��� 7�� ��ġ�� ���ڸ� �־��� ���ڷ� ����
		System.out.println(sb);
		
		sb.replace(9, 15, "replace"); //�ε��� 9~15������ ���ڸ� replace�� ��ü
		System.out.println(sb);
		
		sb.delete(1, 2); //�ε��� 1~2�� ���ڸ� ����
		System.out.println(sb);
		
		sb.insert(22, " �� ���� ��: ");
		System.out.println(sb);

		sb.insert(31, sb.length()+2);
		System.out.println(sb);
		
		int length = sb.length();
		System.out.println("�� ���� ��: " + length);
		
		String result = sb.toString();//�� �޼ҵ�� �Ƹ� deprecated�� �� ����. toString()�޼ҵ带 �θ��� �ʾƵ�, System.out.println()������ �ڵ� Ÿ�Ժ�ȯ�� �̷����� ���ΰ�?
	}
}