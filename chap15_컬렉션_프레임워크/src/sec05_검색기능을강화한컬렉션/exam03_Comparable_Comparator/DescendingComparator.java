package sec05_�˻��������ȭ���÷���.exam03_Comparable_Comparator;

import java.util.Comparator;

/*Comparator �������̽��� �����Ͽ�, TreeSet, TreeMap ������ ������ü�� ����� �ش�.*/
public class DescendingComparator implements Comparator<Fruit> {
	@Override
	public int compare(Fruit o1, Fruit o2) {
		if(o1.price < o2.price) return 1;
		else if(o1.price == o2.price) return 0;
		else return -1;
	}
}