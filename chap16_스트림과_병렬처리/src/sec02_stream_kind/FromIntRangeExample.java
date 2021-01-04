package sec02_stream_kind;

import java.util.stream.IntStream;

public class FromIntRangeExample {
	public static int sum;
	
	public static void main(String[] args) {
		IntStream stream = IntStream.rangeClosed(1,100); //rangeClosed´Â ³¡°ªµµ Æ÷ÇÔÇÏ³®.
		stream.forEach(i -> sum+=i);
		System.out.println("ÃÑÇÕ:" + sum);	
	}
}