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
		/*아래의 코드는 compare(o1,o2)는 기본적으로 같은 연산을 하고, 같은 결과를 반환한다. 
		 * if(score<o.getScore()) return -1;
		 * else if(score==o.getScore()) return 0;
		 * else return 1;
		 * */
		return Integer.compare(score,  o.getScore());	
				//score가 o.getScore()보다 작으면 음수, 같으면 0, 크면 양수를 리턴한다.
	}
}