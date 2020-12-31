package sec05_검색기능을강화한컬렉션.exam01_TreeSet;
/*TreeSet을 이용한 정렬*/
import java.util.NavigableSet;
import java.util.TreeSet;

public class TreeSetExample2 {
	public static void main(String[] args) {
		TreeSet<Integer> treeSet = new TreeSet<>();

		treeSet.add(87); 
		treeSet.add(98);
		treeSet.add(75);
		treeSet.add(95);
		treeSet.add(80);
		
		/*
		 * descendingIterator()는 내림차순으로 정렬된 Iterator<T> 를 반환하고,
		 * descendingSet()은 내림차순으로 정렬된 NavigableSet<T>를 반환한다.
		 * */
		NavigableSet<Integer> descendingSet = treeSet.descendingSet();
		for(Integer score: descendingSet) {
			System.out.print(score + " ");
		}
		System.out.println();
	
		//내림차순으로 정렬한 Set을 다시 내림차순으로 정렬하면, 오름차순으로 정렬된다. 
		//즉, descendingSet은 순서를 뒤바꾼다는 것
		NavigableSet<Integer> ascendingSet = descendingSet.descendingSet();
		for(Integer score: ascendingSet) {
			System.out.print(score + " ");
		}
		System.out.println();
	}
}