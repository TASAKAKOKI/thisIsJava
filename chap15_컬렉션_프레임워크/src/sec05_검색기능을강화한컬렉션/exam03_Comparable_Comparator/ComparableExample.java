package sec05_검색기능을강화한컬렉션.exam03_Comparable_Comparator;

import java.util.Iterator;
import java.util.TreeSet;

public class ComparableExample {
	public static void main(String[] args) {
		TreeSet<Person> treeSet = new TreeSet<>();
		
		treeSet.add(new Person("홍길동", 34));
		treeSet.add(new Person("김자바", 25));
		treeSet.add(new Person("파이썬", 31));
		
		Iterator<Person> iterator = treeSet.iterator();
		while(iterator.hasNext()) {
			Person person = iterator.next();
			System.out.println(person.name + " - " + person.age);
		}
		
	}
}