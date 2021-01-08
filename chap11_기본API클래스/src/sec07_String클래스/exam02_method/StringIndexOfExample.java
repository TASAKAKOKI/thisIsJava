package sec07_String클래스.exam02_method;

/*문자열찾기(indexOf)
 * 	매개값으로 주어진 문자열이 시작되는 인덱스를 리턴
 * 	만약 포함되어 있지 않으면 -1을 리턴
 * 	특정 문자열이 포함되어 있는지 여부에 따라 실행 코드를 달리할 때 자주 사용
 *
 */
public class StringIndexOfExample {
	public static void main(String[] args) {
		String subject = "자바 프로그래밍";
		
		int location = subject.indexOf("프로그래밍"); //indexOf(String str)는 매개값으로 주어진 문자열이 시작하는 위치의 인덱스 값을 반환한다.(없으면 -1)
		System.out.println(location);
		
		if(subject.indexOf("자바")!=-1) {
			System.out.println("자바와 관련된 책이군요");
		} else {
			System.out.println("자바와 관련이 없는 책이군요");
		}
	}
}