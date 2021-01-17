package sec03_콘솔Console_입출력.exam03_scanner;

import java.util.Scanner;

public class ScannerExample {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("문자열 입력>> ");
		String inputString = scanner.nextLine();
		System.out.println(inputString);
		
		System.out.print("short값 입력>> ");
		short inputShort = scanner.nextShort();
		System.out.println(inputShort);
		
		System.out.print("int값 입력>> ");
		int inputInt = scanner.nextInt();
		System.out.println(inputInt);
		
		System.out.print("long값 입력>> ");
		Long inputLong = scanner.nextLong();
		System.out.println(inputLong);
		
		System.out.print("float값 입력>> ");
		float inputFloat = scanner.nextFloat();
		System.out.println(inputFloat);
		
		System.out.print("double값 입력>> ");
		double inputDouble = scanner.nextDouble();
		System.out.println(inputDouble);
		
		System.out.print("boolean 입력>> ");
		boolean inputBoolean = scanner.nextBoolean();
		System.out.println(inputBoolean);
		
		scanner.close();
	}
}