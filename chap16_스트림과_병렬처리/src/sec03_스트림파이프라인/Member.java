package sec03_스트림파이프라인;

public class Member {
	public static int MALE = 0;
	public static int FEMALE = 1;
	
	public String name;
	private int sex;
	private int age;
	
	public Member(String name, int sex, int age) {
		this.name = name;
		this.sex = sex;
		this.age = age;
	}

	public int getSex() { return sex; }
	public int getAge() { return age; }
}