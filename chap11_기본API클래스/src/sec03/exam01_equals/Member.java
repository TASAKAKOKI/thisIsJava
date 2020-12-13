package sec03.exam01_equals;

public class Member {
	//모든 클래스의 최상위 클래스인 Object의 메소드 equals를 재정의하여, Member객체의 id값이 서로 같다면, true를 반환하도록 한다.
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Member) {
			Member m = (Member) obj;
			if(id.equals(m.id)) {
				return true;
			}
		}
		return false;
	}

	public String id;
	
	public Member(String id) {
		this.id = id;
	}
}