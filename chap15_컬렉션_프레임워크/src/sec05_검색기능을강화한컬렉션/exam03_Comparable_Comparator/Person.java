package sec05_검색기능을강화한컬렉션.exam03_Comparable_Comparator;

/*방법1: 사용자 정의 클래스가 Comparable을 구현*/
public class Person implements Comparable<Person> {
	public String name;
	public int age;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	/*상속한 Comparable인터페이스의 compareTo메소드를 재정의 해준다.*/
	@Override
	public int compareTo(Person p) {
		if(age < p.age) return -1;
		else if(age == p.age) return 0;
		else return 1;
	}
}
