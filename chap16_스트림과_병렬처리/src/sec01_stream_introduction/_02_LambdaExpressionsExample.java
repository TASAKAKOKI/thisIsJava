package sec01_stream_introduction;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class _02_LambdaExpressionsExample {
	public static void main(String[] args) {
		List<_02_Student> list = Arrays.asList(
				new _02_Student("È«±æµ¿", 90),
				new _02_Student("±èÀÚ¹Ù", 92)
				);
		Stream<_02_Student> stream = list.stream();
		stream.forEach( s -> {
			String name = s.getName();
			int score = s.getScore();
			System.out.println(name + "-" + score);
		});
	}
}