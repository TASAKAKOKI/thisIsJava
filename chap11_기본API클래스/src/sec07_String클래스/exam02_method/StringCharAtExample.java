package sec07_String클래스.exam02_method;

public class StringCharAtExample {
	public static void main(String[] args) {
		String ssn = "010624-3230123";
		char sex = ssn.charAt(7); //7번째자리의 숫자는 sex를 의미
		switch(sex) {
			case '1':
			case '3':
				System.out.println("남자 입니다.");
				break;
			case '2':
			case '4':
				System.out.println("여자 입니다.");
				break;
		}
	}
}