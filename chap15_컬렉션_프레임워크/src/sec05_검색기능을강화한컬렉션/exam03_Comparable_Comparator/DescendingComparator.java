package sec05_검색기능을강화한컬렉션.exam03_Comparable_Comparator;

import java.util.Comparator;

/*Comparator 인터페이스를 정의하여, TreeSet, TreeMap 생성이 구현객체를 만들어 준다.*/
public class DescendingComparator implements Comparator<Fruit> {
	@Override
	public int compare(Fruit o1, Fruit o2) {
		if(o1.price < o2.price) return 1;
		else if(o1.price == o2.price) return 0;
		else return -1;
	}
}