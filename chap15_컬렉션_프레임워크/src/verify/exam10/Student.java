package verify.exam10;

public class Student implements Comparable<Student>{
	public String id;
	public int score;
	
	public Student(String id, int score) {
		this.id = id;
		this.score = score;
	}
	
	@Override
	public int compareTo(Student s) {
		if(s.score == score) return 0;
		else if(s.score > score) return -1; //객체 자신의 score가 비교대상의 score보다 작으면 음수
		else return 1; // 객체 자신의 score가 비교대상의 score보다 크면 양수
	}
}