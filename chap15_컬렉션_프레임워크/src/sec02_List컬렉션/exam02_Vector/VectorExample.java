package sec02_List�÷���.exam02_Vector;

import java.util.List;
import java.util.Vector;

public class VectorExample {
	public static void main(String[] args) {
		List<Board> list = new Vector<>();
		//��Ƽ������ ȯ���� ��, Ȯ���� ���� ����
		//���� ���� �����尡 ���ÿ� �۾��� �Ϸ��� �� ���, 
		//Synchronized�� ����ȭ�� Vector�� �޼ҵ��� ����,
		//�����ϰ� list�� ó���� �� �ִ�.
		list.add(new Board("����1", "����1", "�۾���1"));
		list.add(new Board("����2", "����2", "�۾���2"));
		list.add(new Board("����3", "����3", "�۾���3"));
		list.add(new Board("����4", "����4", "�۾���4"));
		list.add(new Board("����5", "����5", "�۾���5"));

		list.remove(2);
		list.remove(3);
		
		for(Board board: list) {
			System.out.println(board.getTitle() + "\t" + board.getContent() + "\t" + board.getAuthor());
		}
	}
}