package verify.exam08;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetExample {
	public static void main(String[] args) {
		Set<Student> set = new HashSet<>();
		
		set.add(new Student(1,"ȫ�浿"));
		set.add(new Student(2,"���ڹ�"));
		set.add(new Student(1,"���ο�")); //�й�(key��)�� �����Ƿ� ������� ����
		
		Iterator<Student> iterator =  set.iterator();
		while(iterator.hasNext()) {
			Student student = iterator.next();
			System.out.println(student.studentNum + ":" + student.name);
		}
	}
}