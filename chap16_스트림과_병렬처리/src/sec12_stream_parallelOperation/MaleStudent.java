package sec12_stream_parallelOperation;

import java.util.ArrayList;
import java.util.List;

public class MaleStudent {
	private List<Student> list;
	
	//������
	public MaleStudent() {
		list = new ArrayList<Student>();
		System.out.println("[" + Thread.currentThread().getName() + "] MaleStudent()");
	}
	
	//�����۾��� ���Ǵ� �޼ҵ�
	public void accumulate(Student student) {
		list.add(student);
		System.out.println("[" + Thread.currentThread().getName() + "] accumulate()");
	}
	
	//����ó���� ���Ǵ� �޼ҵ� (�����ϴµ� ����::���߿� �ٽ� ����)
	public void combine(MaleStudent other) {
		list.addAll(other.getList());
		System.out.println("[" + Thread.currentThread().getName() + "] combine()");
	}
	
	public List<Student> getList() {
		return list;
	}
}