package sec16_java_time패키지.exam0_;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeFormatExample {
	public static void main(String[] args) {
		//날짜 시간 객체를 문자열로 포맷할 때, ofPattern()에 매개값으로 줄 형식은 java.time.format.DateTimeFormatter 클래스 문서에 정의되어 있는 문자 들을 이용하여 나타낼 수 있다.
		DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy년 M월 d일 a h시 m분");
		//이때, 주의하기! _ LocalDate객체를 생성하게 되면, 위에서 DateTimeFormatter에 날짜 문자열만 제공해야 한다.
		LocalDateTime now = LocalDateTime.now();
		
		//날짜시각객체.format(dateTimeFormatter객체)를 호출하면, 포맷팅된 문자열이 반환된다.
		String strNow = now.format(dateTimeFormatter);
		System.out.println(strNow);
	}
}