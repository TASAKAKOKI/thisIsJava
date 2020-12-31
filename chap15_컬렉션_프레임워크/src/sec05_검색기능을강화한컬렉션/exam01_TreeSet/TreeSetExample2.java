package sec05_�˻��������ȭ���÷���.exam01_TreeSet;
/*TreeSet�� �̿��� ����*/
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
		 * descendingIterator()�� ������������ ���ĵ� Iterator<T> �� ��ȯ�ϰ�,
		 * descendingSet()�� ������������ ���ĵ� NavigableSet<T>�� ��ȯ�Ѵ�.
		 * */
		NavigableSet<Integer> descendingSet = treeSet.descendingSet();
		for(Integer score: descendingSet) {
			System.out.print(score + " ");
		}
		System.out.println();
	
		//������������ ������ Set�� �ٽ� ������������ �����ϸ�, ������������ ���ĵȴ�. 
		//��, descendingSet�� ������ �ڹٲ۴ٴ� ��
		NavigableSet<Integer> ascendingSet = descendingSet.descendingSet();
		for(Integer score: ascendingSet) {
			System.out.print(score + " ");
		}
		System.out.println();
	}
}