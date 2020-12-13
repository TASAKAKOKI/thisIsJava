package sec03.exam01_equals;

public class Member {
	//��� Ŭ������ �ֻ��� Ŭ������ Object�� �޼ҵ� equals�� �������Ͽ�, Member��ü�� id���� ���� ���ٸ�, true�� ��ȯ�ϵ��� �Ѵ�.
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