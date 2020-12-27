package verify.exam05;

import java.util.function.IntBinaryOperator;

public class LambdaExample {
	private static int[] scores = {10, 50, 3, 12, 24, 49, 7};
	
	public static int maxOrMin(IntBinaryOperator operator) {
		int result = scores[0];
		for(int score : scores) {
			result = operator.applyAsInt(result, score);
		}
		return result;
	}

	public static void main(String[] args) {
		//�ִ밪 ���
		int maxValue = maxOrMin(
			(a,b) -> {
				if(a >= b) return a;
				else return b;
			}
		);
		System.out.println("�ִ밪: " + maxValue);
		
		//�ּҰ� ���
		int minValue = maxOrMin(
			(a,b) -> (a<=b)? a:b //���׿����ڷ� ǥ�� ����
		);
		System.out.println("�ּҰ�: " + minValue);
	}
}