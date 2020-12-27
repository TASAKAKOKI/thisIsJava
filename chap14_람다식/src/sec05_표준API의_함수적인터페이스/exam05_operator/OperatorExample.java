package sec05_표준API의_함수적인터페이스.exam05_operator;

import java.util.function.IntBinaryOperator;

public class OperatorExample {
	private static int[] scores = {92, 95, 87, 90, 88, 96, 97};
	
	public static int maxOrMin(IntBinaryOperator operator) {
		int result = scores[0];
		
		for(int score : scores) {
			result = operator.applyAsInt(result, score);
		}
		return result;
	}
	
	public static void main(String[] args) {
		//최대값 얻기
		int maxScore = maxOrMin(
				(a,b)  -> {
					if(a>= b) {return a;}
					else {return b;}
				});
		//최소값 얻기
		int minScore = maxOrMin(
				(a,b) -> {
					if(a<=b) return a;
					else return b;
				});
		
		System.out.println("최대값: " + maxScore +"\n최소값: " + minScore);
	}
}