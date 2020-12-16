package sec16_java_time��Ű��.exam0_;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateTimeParsingExample {
	public static void main(String[] args) {
		DateTimeFormatter formatter;
		LocalDate localDate;
		
		//���� ���� �޼ҵ��� .parse(���ڿ�)�� �̿��Ͽ�, �Ľ�.
		localDate = LocalDate.parse("2024-05-21");
		System.out.println(localDate);
		
		//formatter�� DateTimeFormatter�� ��� ISO_LOCAL_DATE�� �̿��Ͽ� �������ְ�, ���� ���� �޼ҵ��� .parse(���ڿ�,������)�� �̿��Ͽ� �Ľ�
		formatter = DateTimeFormatter.ISO_LOCAL_DATE;
		localDate = LocalDate.parse("2024-05-21", formatter);
		System.out.println(localDate);
		
		//formatter�� DateTimeFormatter�� ���� �޼ҵ� ofPattern(���ڿ�)�� �̿��Ͽ� �������ְ�, ���� ���� �޼ҵ��� .parse(���ڿ�,������)�� �̿��Ͽ� �Ľ�
		formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd");
		localDate = LocalDate.parse("2024/05/21", formatter);//yyyy/MM/dd�������� �־��� ���ڿ�(�Ű���)�� LocalDate��ü�� ������ش�. (LocalDate��ü�� �⺻ �� = "yyyy-MM-dd")
		System.out.println(localDate);
		
		//formatter�� DateTimeFormatter�� ���� �޼ҵ� ofPattern(���ڿ�)�� �̿��Ͽ� �������ְ�, ���� ���� �޼ҵ��� .parse(���ڿ�,������)�� �̿��Ͽ� �Ľ�
		formatter = DateTimeFormatter.ofPattern("yyyy.MM.dd");
		localDate = LocalDate.parse("2024.05.21", formatter);//yyyy.MM.dd�������� �־��� ���ڿ�(�Ű���)�� LocalDate��ü�� ������ش�. (LocalDate��ü�� �⺻ �� = "yyyy-MM-dd")
		System.out.println(localDate);		
	}
}