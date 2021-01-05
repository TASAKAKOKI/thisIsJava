package sec06_stream_sorting;

public class Student implements Comparable<Student>{
	private String name;
	private int score;
	
	public Student(String name, int score) {
		this.name = name;
		this.score = score;
	}
	
	public String getName() {return name;}
	public int getScore() {return score;}

	@Override
	public int compareTo(Student o) {
		/*�Ʒ��� �ڵ�� compare(o1,o2)�� �⺻������ ���� ������ �ϰ�, ���� ����� ��ȯ�Ѵ�. 
		 * if(score<o.getScore()) return -1;
		 * else if(score==o.getScore()) return 0;
		 * else return 1;
		 * */
		return Integer.compare(score,  o.getScore());	
				//score�� o.getScore()���� ������ ����, ������ 0, ũ�� ����� �����Ѵ�.
	}
}