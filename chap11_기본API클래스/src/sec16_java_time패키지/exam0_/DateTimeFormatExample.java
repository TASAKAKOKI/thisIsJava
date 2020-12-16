package sec16_java_time��Ű��.exam0_;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeFormatExample {
	public static void main(String[] args) {
		//��¥ �ð� ��ü�� ���ڿ��� ������ ��, ofPattern()�� �Ű������� �� ������ java.time.format.DateTimeFormatter Ŭ���� ������ ���ǵǾ� �ִ� ���� ���� �̿��Ͽ� ��Ÿ�� �� �ִ�.
		DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy�� M�� d�� a h�� m��");
		//�̶�, �����ϱ�! _ LocalDate��ü�� �����ϰ� �Ǹ�, ������ DateTimeFormatter�� ��¥ ���ڿ��� �����ؾ� �Ѵ�.
		LocalDateTime now = LocalDateTime.now();
		
		//��¥�ð���ü.format(dateTimeFormatter��ü)�� ȣ���ϸ�, �����õ� ���ڿ��� ��ȯ�ȴ�.
		String strNow = now.format(dateTimeFormatter);
		System.out.println(strNow);
	}
}