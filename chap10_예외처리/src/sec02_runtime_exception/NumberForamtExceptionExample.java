package sec02_runtime_exception;

public class NumberForamtExceptionExample {
	public static void main(String[] args) {
		System.out.println("문자열을 정수로 변환해보기");
		String data1 = "100";
		String data2 = "200";
		
		int val1 = Integer.parseInt(data1);
		int val2 = Integer.parseInt(data2);
		System.out.println("변환 성공!");
		
		System.out.println("문자열을 실수로 변환해보기");
		String data3 = "10.23";
		String data4 = "a10.234";
		
		double val3 = Double.parseDouble(data3);
		double val4 = Double.parseDouble(data4);
		System.out.println("변환 성공!");
	}
}