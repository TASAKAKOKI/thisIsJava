package sec13_Math클래스.exam02_MathRandom;

import java.util.Arrays;
import java.util.Random;

public class RandomExample {
	public static void main(String[] args) {
		/*Random()객체 생성시, 난수 만드는 알고리즘에서 사용되는 종자값(seed)를 설정할 수 있다.
		 *종자값이 같으면 같은 난수를 얻는다.
		 *[객체 생성자] 
		 *	Random()은 호출시마다 다른 종자값(default: 현재 시간)이 자동 설정된다. 따라서, 매번 다른 난수가 생성된다.
		 *	Random(long seed)는 매개값으로 주어진 종자값이 설정된다.
		 *	종자값을 같게하면, 같은 난수를 발생시킨다.
		 *[Random()의 제공 메소드]
		 *	boolean		nextBoolean()	boolean타입의 난수를 리턴
		 *	double 		nextDouble()	double타입의 난수를 리턴(0.0<= ~ < 1.0)
		 *	int 		nextInt()		int타입의 난수를 리턴(-2^32<= ~ < 2^32 -1)
		 *	int 		nextInt(int n) 	int 타입의 난수를 리턴(0<= ~ < n)
		*/
		
		//Math.random()을 이용하여 로또 번호 생성하기
		int[] lottoNumber = new int[6];
		Random random = new Random();		//랜덤 객체 생성
		System.out.print("선택번호: ");
		for(int i =  0; i < lottoNumber.length; i++) {
			lottoNumber[i] = random.nextInt(45) + 1;
			System.out.print(lottoNumber[i] + " ");
		}
		System.out.println();
		
		/*
		//실험(종자값을 준다면?)
		int[] lottoNumber2 = new int[6];
		Random random2 = new Random(3);		//랜덤 객체 생성(with 종자값)
		System.out.print("선택번호: ");
		for(int i =  0; i < lottoNumber2.length; i++) {
			lottoNumber2[i] = random2.nextInt(45) + 1;
			System.out.print(lottoNumber2[i] + " ");
		}
		System.out.println();
		*/
		
		//당첨 번호
		int[] winningNumber = new int[6];
		random = new Random();
		System.out.print("당첨 번호: ");
		for(int i = 0; i < winningNumber.length; i++) {
			winningNumber[i] = random.nextInt(45) + 1;
			System.out.print(winningNumber[i] + " ");
		}
		System.out.println();
		
		//당첨 번호 갯수 파악하기
		/*
		 * 우선 올림차순으로 각 배열을 정렬한다.
		 * 각 배열의 인덱스를 하나씩 돌면서, 서로 맞는 값을 찾는다.
		 *  */
		Arrays.sort(lottoNumber);
		Arrays.sort(winningNumber);
		/*
		 * boolean result = Arrays.equals(lottoNumber, winningNumber);
		 * if(result) {
		 * 	System.out.println("로또 1등에 당첨되었습니다.");
		 * } else {
		 * 	System.out.println("아쉽게도 당첨되지 않았습니다.");
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
			System.out.println("1등 당첨!!! 축하합니다.");
		} else if (count != 0) {
			System.out.println(count + "개의 번호가 일치합니다. 축하합니다!");
		} else {
			System.out.println("아쉽네요. 다음기회에..");
		}
	}
}