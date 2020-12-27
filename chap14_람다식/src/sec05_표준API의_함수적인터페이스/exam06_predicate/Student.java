package sec05_표준API의_함수적인터페이스.exam06_predicate;

public class Student {
	private String name;
	private String sex;
	private int score;
	
	public Student(String name, String sex, int score) {
		this.name = name;
		this.sex = sex;
		this.score = score;
	}

	public String getName() {return name;}
	public String getSex() {return sex;}
	public int getScore() {return score;}
}
