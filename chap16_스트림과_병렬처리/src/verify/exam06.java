package verify;

import java.util.Arrays;
import java.util.List;
/* List�� ����Ǿ� �ִ� Member ����� ��� ���̸� ����Ͻÿ�.
 */
public class exam06 {
	public static void main(String[] args) {
		List<Member> list = Arrays.asList(
			new Member("ȫ�浿",30),
			new Member("�ſ��",40),
			new Member("���ڹ�",26)
		);
		
		double avg = list.stream()//Member��ü���� ��ҷ� �ϴ� ��Ʈ�� ����
			//�ڵ��ۼ�
			.mapToInt(m->m.getAge()) //Member��ҵ��� intŸ�� ��ҷη� ��ȯ
			//.mapToInt(Member::getAge)�� ���� �޼ҵ� �������� �Ű������� �־ �����ϴ�.
			.average()
			.getAsDouble();
		
		System.out.println("��� ����: " + avg);
	}
}

class Member {
	private String name;
	private int age;
	
	public Member(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public String getName() {return name;}
	public int getAge() {return age;}
}