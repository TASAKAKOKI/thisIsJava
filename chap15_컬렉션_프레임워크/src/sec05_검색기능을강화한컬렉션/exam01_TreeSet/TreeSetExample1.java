package sec05_검색기능을강화한컬렉션.exam01_TreeSet;

//import java.util.Iterator;
import java.util.TreeSet;
/*TreeSet을 이용한 단일 객체 검색*/
public class TreeSetExample1 {
	public static void main(String[] args) {
		//TreeSet은 이진트리(BinaryTree)를 기반으로 한 Set컬렉션
		TreeSet<Integer> treeSet = new TreeSet<>();
		/*TreeSet의 주요 메소드에는
		 *특정 객체를 찾는 메소드: first(), last(), lower(), higher(), floor(), ceiling()
		 *정렬 메소드: descendingIterator(), descendingSet()
		 *범위 검색 메소드: headSet(), tailSet(), subSet()
		 *등이 있다.
		*/
		treeSet.add(new Integer(87)); // java9부터는 deprecated되었다.
		treeSet.add(98); // 자동박싱이뤄짐
		treeSet.add(75);
		treeSet.add(95);
		treeSet.add(80);
		
		Integer score = null;
		
		score = treeSet.first(); //이진 트리의 가장 왼쪽(가장 작은) 객체를 리턴
		System.out.println("가장 낮은 점수: " + score);
		score = treeSet.last(); //이진 트리의 가장 오른쪽(가장 높은) 객체를 리턴
		System.out.println("가장 높은 점수: " + score + "\n");
		
		score = treeSet.lower(95); // 주어진 객체보다 바로 낮은 객체(왼쪽노드)를 리턴
		System.out.println("95 바로 아래의 점수: " + score);
		score = treeSet.higher(85); // 주어진 객체보다 바로 높은 객체(오른쪽노드)를 리턴
		System.out.println("85 바로 위의 점수: " + score + "\n");
		
		score = treeSet.floor(95); // 주어진 객체를 포함하여 바로 낮은 객체(왼쪽노드 혹은 주어진 객체)를 리턴
		System.out.println("95이거나 바로 아래의 점수: " + score);
		score = treeSet.ceiling(85); // 주어진 객체를 포함하여 바로 높은 객체(오른쪽노드 혹은 주어진 객체)를 리턴
		System.out.println("85이거나 바로 위의 점수: " + score + "\n");		
		
		/*
		while(!treeSet.isEmpty()) {
			// poolFirst(): treeSet에서 제일 왼쪽 자식 노드(가장 낮은 값) 반환하고, 그 객체를 삭제한다.
			// iterator와 다른 점은 바로 삭제한다는 점이다.
			score = treeSet.pollFirst(); 
			System.out.println(score + "(남은 객체 수: " + treeSet.size() + ")");
		}
		System.out.print("\n");	*/
		
		while(!treeSet.isEmpty()) {
			// poolLasst(): treeSet에서 제일 오른쪽 자식 노드(가장 높은 값) 반환하고, 그 객체를 삭제한다.
			// iterator와 다른 점은 바로 삭제한다는 점이다.
			score = treeSet.pollLast(); 
			System.out.println(score + "(남은 객체 수: " + treeSet.size() + ")");
		}
		/*
		Iterator<Integer> iterator = treeSet.iterator();
		while(iterator.hasNext()) {
			int i = iterator.next();
			//iterator.remove(); //이 구문이 iterator에서 객체를 제거해준다.
			System.out.println(i + "(남은 객체 수: " + treeSet.size() + ")");
		}
		*/
	}
}