package verify.exam07;

import java.util.Arrays;
import java.util.List;

public class BoardDao {
	/* 방법 1 - 아예 필드값으로 List<Board>를 초기화 선언해준다.*/
	private List<Board> BoardList = Arrays.asList(
			new Board("제목1", "내용1"),
			new Board("제목2", "내용2"),
			new Board("제목3", "내용3")
			);

	public List<Board> getBoardList() {
		/*방법 2 - 메소드에서 List를 생성하여, element들을 add 해준다.
		 * List<Board> list = new ArrayList<Board>();
		 * list.add("제목1","내용1");
		 * list.add("제목2","내용2");
		 * list.add("제목3","내용3");
		 * */
		return BoardList;
	}
}