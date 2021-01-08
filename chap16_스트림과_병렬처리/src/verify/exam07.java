package verify;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//List�� ����Ǿ� �ִ� Member ��ҿ��� ������ "������"�� ����� ������ List�� �����Ͻÿ�.
public class exam07 {
	public static void main(String[] args) {
		List<Member1> list = Arrays.asList(
			new Member1("ȫ�浿", "������"),
			new Member1("�����", "�����̳�"),
			new Member1("���ڹ�", "������"),
			new Member1("���̼�", "�̿��")
		);
		
		List<Member1> developers = list.stream()
			//�ڵ��ۼ�
			.filter(m->m.getJob()=="������") //job�ʵ尡 "�������� ��ҵ鸸 ���͸�
			//.filter(m->m.getJob().equals("������")�� ���� �ۼ��Ͽ��� ����
			.collect(Collectors.toList()); //���͸��� ��ҵ��� ���������μ� �����Ͽ�, ���ο� List�� ��ȯ
		
		developers.stream().forEach(m->System.out.println(m.getName()));
	}
}

class Member1 {
	private String name;
	private String job;
	
	public Member1(String name, String job) {
		this.name = name;
		this.job = job;
	}
	
	public String getName() {return name;}
	public String getJob() {return job;}
}