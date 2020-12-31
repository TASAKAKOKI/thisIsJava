package sec05_�˻��������ȭ���÷���.exam01_TreeSet;

//import java.util.Iterator;
import java.util.TreeSet;
/*TreeSet�� �̿��� ���� ��ü �˻�*/
public class TreeSetExample1 {
	public static void main(String[] args) {
		//TreeSet�� ����Ʈ��(BinaryTree)�� ������� �� Set�÷���
		TreeSet<Integer> treeSet = new TreeSet<>();
		/*TreeSet�� �ֿ� �޼ҵ忡��
		 *Ư�� ��ü�� ã�� �޼ҵ�: first(), last(), lower(), higher(), floor(), ceiling()
		 *���� �޼ҵ�: descendingIterator(), descendingSet()
		 *���� �˻� �޼ҵ�: headSet(), tailSet(), subSet()
		 *���� �ִ�.
		*/
		treeSet.add(new Integer(87)); // java9���ʹ� deprecated�Ǿ���.
		treeSet.add(98); // �ڵ��ڽ��̷���
		treeSet.add(75);
		treeSet.add(95);
		treeSet.add(80);
		
		Integer score = null;
		
		score = treeSet.first(); //���� Ʈ���� ���� ����(���� ����) ��ü�� ����
		System.out.println("���� ���� ����: " + score);
		score = treeSet.last(); //���� Ʈ���� ���� ������(���� ����) ��ü�� ����
		System.out.println("���� ���� ����: " + score + "\n");
		
		score = treeSet.lower(95); // �־��� ��ü���� �ٷ� ���� ��ü(���ʳ��)�� ����
		System.out.println("95 �ٷ� �Ʒ��� ����: " + score);
		score = treeSet.higher(85); // �־��� ��ü���� �ٷ� ���� ��ü(�����ʳ��)�� ����
		System.out.println("85 �ٷ� ���� ����: " + score + "\n");
		
		score = treeSet.floor(95); // �־��� ��ü�� �����Ͽ� �ٷ� ���� ��ü(���ʳ�� Ȥ�� �־��� ��ü)�� ����
		System.out.println("95�̰ų� �ٷ� �Ʒ��� ����: " + score);
		score = treeSet.ceiling(85); // �־��� ��ü�� �����Ͽ� �ٷ� ���� ��ü(�����ʳ�� Ȥ�� �־��� ��ü)�� ����
		System.out.println("85�̰ų� �ٷ� ���� ����: " + score + "\n");		
		
		/*
		while(!treeSet.isEmpty()) {
			// poolFirst(): treeSet���� ���� ���� �ڽ� ���(���� ���� ��) ��ȯ�ϰ�, �� ��ü�� �����Ѵ�.
			// iterator�� �ٸ� ���� �ٷ� �����Ѵٴ� ���̴�.
			score = treeSet.pollFirst(); 
			System.out.println(score + "(���� ��ü ��: " + treeSet.size() + ")");
		}
		System.out.print("\n");	*/
		
		while(!treeSet.isEmpty()) {
			// poolLasst(): treeSet���� ���� ������ �ڽ� ���(���� ���� ��) ��ȯ�ϰ�, �� ��ü�� �����Ѵ�.
			// iterator�� �ٸ� ���� �ٷ� �����Ѵٴ� ���̴�.
			score = treeSet.pollLast(); 
			System.out.println(score + "(���� ��ü ��: " + treeSet.size() + ")");
		}
		/*
		Iterator<Integer> iterator = treeSet.iterator();
		while(iterator.hasNext()) {
			int i = iterator.next();
			//iterator.remove(); //�� ������ iterator���� ��ü�� �������ش�.
			System.out.println(i + "(���� ��ü ��: " + treeSet.size() + ")");
		}
		*/
	}
}