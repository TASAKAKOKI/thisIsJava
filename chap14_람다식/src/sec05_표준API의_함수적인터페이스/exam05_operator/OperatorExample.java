package sec05_ǥ��API��_�Լ����������̽�.exam05_operator;

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
		//�ִ밪 ���
		int maxScore = maxOrMin(
				(a,b)  -> {
					if(a>= b) {return a;}
					else {return b;}
				});
		//�ּҰ� ���
		int minScore = maxOrMin(
				(a,b) -> {
					if(a<=b) return a;
					else return b;
				});
		
		System.out.println("�ִ밪: " + maxScore +"\n�ּҰ�: " + minScore);
	}
}