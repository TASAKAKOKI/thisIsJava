package sec05_�˻��������ȭ���÷���.exam03_Comparable_Comparator;

import java.util.Iterator;
import java.util.TreeSet;

public class ComparableExample {
	public static void main(String[] args) {
		TreeSet<Person> treeSet = new TreeSet<>();
		
		treeSet.add(new Person("ȫ�浿", 34));
		treeSet.add(new Person("���ڹ�", 25));
		treeSet.add(new Person("���̽�", 31));
		
		Iterator<Person> iterator = treeSet.iterator();
		while(iterator.hasNext()) {
			Person person = iterator.next();
			System.out.println(person.name + " - " + person.age);
		}
		
	}
}