package sec11_ArraysŬ����.exam03_array_sort;

//Sort()�� ����Ϸ���, Ŭ������ Comparable �������̽��� �����ؾ� �Ѵ�.
public class Member implements Comparable<Member>{
	public String name;
	public Member(String  name) {
		this.name = name;
	}
	
	/*compareTo(Object o)�� int���� �����Ѵ�. 
	 * ���� Member�� �Ű����� �����ϰ��� �ϴ� ���� ���ٸ� 0,
	 * ���� Member�� �Ű����� �����ϰ��� �ϴ� ������ ũ�ٸ� ���,
	 * ���� Member�� �Ű����� �����ϰ��� �ϴ� ������ �۴ٸ� ������ �������ش�.
	*/
	@Override
	public int compareTo(Member o) {
		//string��ü.compareTo(String ����string) StringŬ������ �޼ҵ�μ�, ���ڿ� ���ڸ� ���ؼ� ���ĺ������� ������ 0 ���� ���ڰ� �� �ռ��� ���, �� �ڿ� ���� ���ڸ� ������ �����Ѵ�.
		return name.compareTo(o.name);
	}
}