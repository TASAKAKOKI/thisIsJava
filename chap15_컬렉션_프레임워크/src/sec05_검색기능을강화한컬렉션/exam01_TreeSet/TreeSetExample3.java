package sec05_�˻��������ȭ���÷���.exam01_TreeSet;

import java.util.NavigableSet;
import java.util.TreeSet;

/*TreeSet�� �̿��� �����˻�*/
public class TreeSetExample3 {
	public static void main(String[] args) {
		TreeSet<String> treeSet = new TreeSet<>();
		
		treeSet.add("apple");
		treeSet.add("forever");
		treeSet.add("description");
		treeSet.add("zoo");
		treeSet.add("ever");
		treeSet.add("base");
		treeSet.add("guess");
		treeSet.add("failure");
		treeSet.add("cherry");
		treeSet.add("high");
		treeSet.add("yoga");
		treeSet.add("tiger");
		treeSet.add("lime");
		treeSet.add("orange");
		treeSet.add("quiz");
		treeSet.add("jazz");
		treeSet.add("mango");
		
		System.out.println();
		NavigableSet<String> subSet = treeSet.subSet("c", true, "h", false);
		for(String element : subSet) {
			System.out.println(element);
		}
	}
}