package verify.exam08;

import java.util.StringTokenizer;

public class SplitExample {
	public static void main(String[] args) {
		String str = "���̵�,�̸�,�н�����";
		
		//��� 1 split()�޼ҵ带 �̿��Ͽ� ���ڿ� �и��ϱ�.
		String[] strs = str.split(",");
		for(String string : strs) {
			System.out.println(string);			
		}
		System.out.println();
		
		//��� 2 StringTokenizer�� �̿��Ͽ� ���ڿ� �и��ϱ�.
		StringTokenizer st = new StringTokenizer(str,",");
		while(st.hasMoreTokens()) {
			//���1: StringTokenizer(���ڿ�)������ �̿��,
			String token = st.nextToken();
			System.out.println(token);
			//���2: StringTokenizer(���ڿ�,������)������ �̿��,
			//System.out.println(st.nextToken(","));
		}
	}
}