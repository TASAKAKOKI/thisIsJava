package sec16_java_time패키지.exam0_;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateTimeParsingExample {
	public static void main(String[] args) {
		DateTimeFormatter formatter;
		LocalDate localDate;
		
		//공통 정적 메소드인 .parse(문자열)을 이용하여, 파싱.
		localDate = LocalDate.parse("2024-05-21");
		System.out.println(localDate);
		
		//formatter를 DateTimeFormatter의 상수 ISO_LOCAL_DATE를 이용하여 대입해주고, 공통 정적 메소드인 .parse(문자열,포맷터)를 이용하여 파싱
		formatter = DateTimeFormatter.ISO_LOCAL_DATE;
		localDate = LocalDate.parse("2024-05-21", formatter);
		System.out.println(localDate);
		
		//formatter를 DateTimeFormatter의 정적 메소드 ofPattern(문자열)을 이용하여 대입해주고, 공통 정적 메소드인 .parse(문자열,포맷터)를 이용하여 파싱
		formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd");
		localDate = LocalDate.parse("2024/05/21", formatter);//yyyy/MM/dd형식으로 주어진 문자열(매개값)을 LocalDate객체로 만들어준다. (LocalDate객체의 기본 형 = "yyyy-MM-dd")
		System.out.println(localDate);
		
		//formatter를 DateTimeFormatter의 정적 메소드 ofPattern(문자열)을 이용하여 대입해주고, 공통 정적 메소드인 .parse(문자열,포맷터)를 이용하여 파싱
		formatter = DateTimeFormatter.ofPattern("yyyy.MM.dd");
		localDate = LocalDate.parse("2024.05.21", formatter);//yyyy.MM.dd형식으로 주어진 문자열(매개값)을 LocalDate객체로 만들어준다. (LocalDate객체의 기본 형 = "yyyy-MM-dd")
		System.out.println(localDate);		
	}
}