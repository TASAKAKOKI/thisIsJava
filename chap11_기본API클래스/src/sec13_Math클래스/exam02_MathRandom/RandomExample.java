package sec13_MathŬ����.exam02_MathRandom;

import java.util.Arrays;
import java.util.Random;

public class RandomExample {
	public static void main(String[] args) {
		/*Random()��ü ������, ���� ����� �˰��򿡼� ���Ǵ� ���ڰ�(seed)�� ������ �� �ִ�.
		 *���ڰ��� ������ ���� ������ ��´�.
		 *[��ü ������] 
		 *	Random()�� ȣ��ø��� �ٸ� ���ڰ�(default: ���� �ð�)�� �ڵ� �����ȴ�. ����, �Ź� �ٸ� ������ �����ȴ�.
		 *	Random(long seed)�� �Ű������� �־��� ���ڰ��� �����ȴ�.
		 *	���ڰ��� �����ϸ�, ���� ������ �߻���Ų��.
		 *[Random()�� ���� �޼ҵ�]
		 *	boolean		nextBoolean()	booleanŸ���� ������ ����
		 *	double 		nextDouble()	doubleŸ���� ������ ����(0.0<= ~ < 1.0)
		 *	int 		nextInt()		intŸ���� ������ ����(-2^32<= ~ < 2^32 -1)
		 *	int 		nextInt(int n) 	int Ÿ���� ������ ����(0<= ~ < n)
		*/
		
		//Math.random()�� �̿��Ͽ� �ζ� ��ȣ �����ϱ�
		int[] lottoNumber = new int[6];
		Random random = new Random();		//���� ��ü ����
		System.out.print("���ù�ȣ: ");
		for(int i =  0; i < lottoNumber.length; i++) {
			lottoNumber[i] = random.nextInt(45) + 1;
			System.out.print(lottoNumber[i] + " ");
		}
		System.out.println();
		
		/*
		//����(���ڰ��� �شٸ�?)
		int[] lottoNumber2 = new int[6];
		Random random2 = new Random(3);		//���� ��ü ����(with ���ڰ�)
		System.out.print("���ù�ȣ: ");
		for(int i =  0; i < lottoNumber2.length; i++) {
			lottoNumber2[i] = random2.nextInt(45) + 1;
			System.out.print(lottoNumber2[i] + " ");
		}
		System.out.println();
		*/
		
		//��÷ ��ȣ
		int[] winningNumber = new int[6];
		random = new Random();
		System.out.print("��÷ ��ȣ: ");
		for(int i = 0; i < winningNumber.length; i++) {
			winningNumber[i] = random.nextInt(45) + 1;
			System.out.print(winningNumber[i] + " ");
		}
		System.out.println();
		
		//��÷ ��ȣ ���� �ľ��ϱ�
		/*
		 * �켱 �ø��������� �� �迭�� �����Ѵ�.
		 * �� �迭�� �ε����� �ϳ��� ���鼭, ���� �´� ���� ã�´�.
		 *  */
		Arrays.sort(lottoNumber);
		Arrays.sort(winningNumber);
		/*
		 * boolean result = Arrays.equals(lottoNumber, winningNumber);
		 * if(result) {
		 * 	System.out.println("�ζ� 1� ��÷�Ǿ����ϴ�.");
		 * } else {
		 * 	System.out.println("�ƽ��Ե� ��÷���� �ʾҽ��ϴ�.");
		 * }
		*/
		int count = 0;
		for(int i = 0; i < 6; i++) {
			for(int j = 0; j < 6; j++) {
				if(lottoNumber[i] == winningNumber[j]) {
					count++;
				}
			}
		}
		if(count == 6) {
			System.out.println("1�� ��÷!!! �����մϴ�.");
		} else if (count != 0) {
			System.out.println(count + "���� ��ȣ�� ��ġ�մϴ�. �����մϴ�!");
		} else {
			System.out.println("�ƽ��׿�. ������ȸ��..");
		}
	}
}