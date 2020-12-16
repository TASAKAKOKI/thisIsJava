package sec15_Format_클래스.exam01_DecimalFormat;

//ctrl + shift + o 를 누르면, 필요한 패키지를 import할 수 있다.
import java.text.DecimalFormat;

public class DecimalFormatExample {
	public static void main(String[] args) {
		double num = 1234567.89;
		
		DecimalFormat df = new DecimalFormat("0");
		System.out.println(df.format(num));
		
		df = new DecimalFormat("000000000.0000");
		System.out.println(df.format(num));
		
		df = new DecimalFormat("#########.####");
		System.out.println(df.format(num));
		
		df = new DecimalFormat("#.#");
		System.out.println(df.format(num));
		
		df = new DecimalFormat("#.0");
		System.out.println(df.format(num));
		
		df = new DecimalFormat("000000000.0000");
		System.out.println(df.format(num));
	}
}