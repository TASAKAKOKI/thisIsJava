package sec05_�˻��������ȭ���÷���.exam03_Comparable_Comparator;

import java.util.Iterator;
import java.util.TreeSet;

public class ComparatorExample {
	public static void main(String[] args) {
		System.out.println("[�������� ���� Comparator ����]");
		/*TreeSet�� �����ÿ� Comparator�� �������ָ�, ClassCastException�� �ذ��� �� �ִ�.*/
		TreeSet<Fruit> treeSet = new TreeSet<>(new DescendingComparator());
		
		treeSet.add(new Fruit("����", 3000));
		treeSet.add(new Fruit("����", 10000));
		treeSet.add(new Fruit("����", 6000));
	
		
		Iterator<Fruit> iterator = treeSet.iterator();
		while(iterator.hasNext()) {
			Fruit fruit = iterator.next();
			System.out.println(fruit.name + ": " + fruit.price);
		}
		
		System.out.println("\n[�������� ���� Comparator ����]");
		TreeSet<Fruit> treeSet2 = new TreeSet<>(new AscendingComparator());
		
		treeSet2.add(new Fruit("����", 3000));
		treeSet2.add(new Fruit("����", 10000));
		treeSet2.add(new Fruit("����", 6000));
	
		
		Iterator<Fruit> iterator2 = treeSet2.iterator();
		while(iterator2.hasNext()) {
			Fruit fruit = iterator2.next();
			System.out.println(fruit.name + ": " + fruit.price);
		}
	}
}