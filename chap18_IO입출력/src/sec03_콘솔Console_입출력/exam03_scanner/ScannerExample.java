package sec03_�ܼ�Console_�����.exam03_scanner;

import java.util.Scanner;

public class ScannerExample {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("���ڿ� �Է�>> ");
		String inputString = scanner.nextLine();
		System.out.println(inputString);
		
		System.out.print("short�� �Է�>> ");
		short inputShort = scanner.nextShort();
		System.out.println(inputShort);
		
		System.out.print("int�� �Է�>> ");
		int inputInt = scanner.nextInt();
		System.out.println(inputInt);
		
		System.out.print("long�� �Է�>> ");
		Long inputLong = scanner.nextLong();
		System.out.println(inputLong);
		
		System.out.print("float�� �Է�>> ");
		float inputFloat = scanner.nextFloat();
		System.out.println(inputFloat);
		
		System.out.print("double�� �Է�>> ");
		double inputDouble = scanner.nextDouble();
		System.out.println(inputDouble);
		
		System.out.print("boolean �Է�>> ");
		boolean inputBoolean = scanner.nextBoolean();
		System.out.println(inputBoolean);
		
		scanner.close();
	}
}