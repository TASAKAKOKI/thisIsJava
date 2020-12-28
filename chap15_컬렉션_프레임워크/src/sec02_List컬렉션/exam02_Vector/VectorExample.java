package sec02_List컬렉션.exam02_Vector;

import java.util.List;
import java.util.Vector;

public class VectorExample {
	public static void main(String[] args) {
		List<Board> list = new Vector<>();
		//멀티스레드 환경일 때, 확인이 좀더 쉬움
		//여러 개의 스레드가 동시에 작업을 하려고 할 경우, 
		//Synchronized로 동기화된 Vector의 메소드들로 인해,
		//안전하게 list를 처리할 수 있다.
		list.add(new Board("제목1", "내용1", "글쓴이1"));
		list.add(new Board("제목2", "내용2", "글쓴이2"));
		list.add(new Board("제목3", "내용3", "글쓴이3"));
		list.add(new Board("제목4", "내용4", "글쓴이4"));
		list.add(new Board("제목5", "내용5", "글쓴이5"));

		list.remove(2);
		list.remove(3);
		
		for(Board board: list) {
			System.out.println(board.getTitle() + "\t" + board.getContent() + "\t" + board.getAuthor());
		}
	}
}