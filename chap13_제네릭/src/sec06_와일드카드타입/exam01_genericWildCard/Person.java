package sec06_���ϵ�ī��Ÿ��.exam01_genericWildCard;

public class Person {
	private String name;
	
	public Person(String name) {
		this.name = name;
	}
	
	public String getName() {return name;}
	
	@Override
	public String toString() {
		return name;
	}
}