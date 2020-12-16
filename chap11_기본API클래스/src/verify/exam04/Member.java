package verify.exam04;

public class Member {
	private String id;
	private String name;
	
	@Override
	public String toString() {
		String message = id + ": " + name;
		return message;
	}

	public Member(String id, String name) {
		this.id = id;
		this.name = name;
	}
}