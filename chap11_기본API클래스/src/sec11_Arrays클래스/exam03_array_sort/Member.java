package sec11_Arrays클래스.exam03_array_sort;

//Sort()를 사용하려면, 클래스가 Comparable 인터페이스를 구현해야 한다.
public class Member implements Comparable<Member>{
	public String name;
	public Member(String  name) {
		this.name = name;
	}
	
	/*compareTo(Object o)는 int값을 리턴한다. 
	 * 현재 Member가 매개값의 조사하고자 하는 값이 같다면 0,
	 * 현재 Member가 매개값의 조사하고자 하는 값보다 크다면 양수,
	 * 현재 Member가 매개값의 조사하고자 하는 값보다 작다면 음수를 리턴해준다.
	*/
	@Override
	public int compareTo(Member o) {
		//string객체.compareTo(String 비교할string) String클래스의 메소드로서, 문자와 문자를 비교해서 앞파벳순서상 같으면 0 앞의 문자가 더 앞서면 양수, 더 뒤에 오는 문자면 음수를 리턴한다.
		return name.compareTo(o.name);
	}
}