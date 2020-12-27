package chap14_람다식.sec05_표준API의함수적인터페이스.exam07_andThen_compose;

public class Member {
	private	String name;
	private String id;
	private Address address;
	
	public Member(String name, String id, Address address) {
		this.name = name;
		this.id = id;
		this.address = address;
	}
	public String getName() {return name;}
	public String getId() {return id;}
	public Address getAddress() {return address;}
}