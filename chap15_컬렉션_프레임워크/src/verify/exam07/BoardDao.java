package verify.exam07;

import java.util.Arrays;
import java.util.List;

public class BoardDao {
	/* ��� 1 - �ƿ� �ʵ尪���� List<Board>�� �ʱ�ȭ �������ش�.*/
	private List<Board> BoardList = Arrays.asList(
			new Board("����1", "����1"),
			new Board("����2", "����2"),
			new Board("����3", "����3")
			);

	public List<Board> getBoardList() {
		/*��� 2 - �޼ҵ忡�� List�� �����Ͽ�, element���� add ���ش�.
		 * List<Board> list = new ArrayList<Board>();
		 * list.add("����1","����1");
		 * list.add("����2","����2");
		 * list.add("����3","����3");
		 * */
		return BoardList;
	}
}