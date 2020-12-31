package sec05_�˻��������ȭ���÷���.exam03_Comparable_Comparator;

/*���1: ����� ���� Ŭ������ Comparable�� ����*/
public class Person implements Comparable<Person> {
	public String name;
	public int age;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	/*����� Comparable�������̽��� compareTo�޼ҵ带 ������ ���ش�.*/
	@Override
	public int compareTo(Person p) {
		if(age < p.age) return -1;
		else if(age == p.age) return 0;
		else return 1;
	}
}
