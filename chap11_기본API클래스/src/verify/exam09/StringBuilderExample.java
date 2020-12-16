package verify.exam09;

public class StringBuilderExample {
	public static void main(String[] args) {
		//다음의 코드들은 100개의 String객체를 만들기 때문에 효율적이지 않다.
		//String 객체는 수정이 불가하다는 특성이 있기 때문이다.
		String str = "";
		for(int i = 0; i <= 100; i++) {
			str += i;
		}
		System.out.println(str);
		
		//이를 위해, StringBuilder(java.lang.StringBuilder)클래스를 이용하면 좋다.
		//StringBuilder는 기존의 객체 하나에서 계속 변경만 할 뿐이다.
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i <= 100; i++) {
			sb.append(i);
		}
		System.out.println(sb);
	}
}