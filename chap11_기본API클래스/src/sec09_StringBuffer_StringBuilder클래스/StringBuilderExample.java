package sec09_StringBuffer_StringBuilder클래스;

public class StringBuilderExample {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder(); //기본 크기의 StringBuilder객체 생성
		sb.append(true);
		sb.append(" ");
		sb.append(0.1);
		sb.append(" ");
		sb.append("c");
		sb.append(" ");
		sb.append(100);
		sb.append(" ");
		sb.append("java 8");
		System.out.println(sb);
		
		sb.insert(4, "4"); //인덱스 4의 위치에 주어진 문자를 삽입 : 이때, 뒤의 문자열들은 한 칸씩 뒤로 밀려난다.
		System.out.println(sb);
		

		sb.setCharAt(7, '7'); //인덱스 7의 위치의 문자를 주어진 문자로 지정
		System.out.println(sb);
		
		sb.replace(9, 15, "replace"); //인덱스 9~15사이의 문자를 replace로 대체
		System.out.println(sb);
		
		sb.delete(1, 2); //인덱스 1~2의 문자를 삭제
		System.out.println(sb);
		
		sb.insert(22, " 총 문자 수: ");
		System.out.println(sb);

		sb.insert(31, sb.length()+2);
		System.out.println(sb);
		
		int length = sb.length();
		System.out.println("총 문자 수: " + length);
		
		String result = sb.toString();//이 메소드는 아마 deprecated된 것 같다. toString()메소드를 부르지 않아도, System.out.println()에서는 자동 타입변환이 이뤄지는 것인가?
	}
}