package sec05_검색기능을강화한컬렉션.exam03_Comparable_Comparator;

import java.util.Iterator;
import java.util.TreeSet;

public class ComparatorExample {
	public static void main(String[] args) {
		System.out.println("[내림차순 정렬 Comparator 제공]");
		/*TreeSet을 생성시에 Comparator를 제공해주면, ClassCastException을 해결할 수 있다.*/
		TreeSet<Fruit> treeSet = new TreeSet<>(new DescendingComparator());
		
		treeSet.add(new Fruit("포도", 3000));
		treeSet.add(new Fruit("수박", 10000));
		treeSet.add(new Fruit("딸기", 6000));
	
		
		Iterator<Fruit> iterator = treeSet.iterator();
		while(iterator.hasNext()) {
			Fruit fruit = iterator.next();
			System.out.println(fruit.name + ": " + fruit.price);
		}
		
		System.out.println("\n[오름차순 정렬 Comparator 제공]");
		TreeSet<Fruit> treeSet2 = new TreeSet<>(new AscendingComparator());
		
		treeSet2.add(new Fruit("포도", 3000));
		treeSet2.add(new Fruit("수박", 10000));
		treeSet2.add(new Fruit("딸기", 6000));
	
		
		Iterator<Fruit> iterator2 = treeSet2.iterator();
		while(iterator2.hasNext()) {
			Fruit fruit = iterator2.next();
			System.out.println(fruit.name + ": " + fruit.price);
		}
	}
}