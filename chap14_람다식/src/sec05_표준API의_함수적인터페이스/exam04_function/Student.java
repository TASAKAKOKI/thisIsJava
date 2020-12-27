package sec05_표준API의_함수적인터페이스.exam04_function;

public class Student {
	private String name;
	private int mathScore;
	private int engScore;

	public Student(String name, int mathScore, int engScore) {
		this.name = name;
		this.mathScore = mathScore;
		this.engScore = engScore;
	}
	public String getName() {
		return name;
	}
	public int getmathScore() {
		return mathScore;
	}
	public int getengScore() {
		return engScore;
	}
}
