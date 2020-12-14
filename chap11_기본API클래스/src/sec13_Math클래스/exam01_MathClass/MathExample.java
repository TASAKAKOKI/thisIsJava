package sec13_Math클래스.exam01_MathClass;

public class MathExample {
	public static void main(String[] args) {
		System.out.println("[Math.abs()사용]");
		int v1 = Math.abs(-5);
		double v2 = Math.abs(-3.14);
		System.out.println("v1: " + v1);
		System.out.println("v2: " + v2);
		System.out.println("[Math.ceil()사용]");
		double v3 = Math.ceil(5.3);
		double v4 = Math.ceil(-5.3);
		System.out.println("v3: " + v3);
		System.out.println("v4: " + v4);
		System.out.println("[Math.floor()사용]");
		double v5 = Math.floor(5.3);
		double v6 = Math.floor(-5.3);
		System.out.println("v5: " + v5);
		System.out.println("v6: " + v6);
		System.out.println("[Math.max()사용]");
		int v7 = Math.max(5, 9);
		double v8 = Math.max(5.3, 2.5);
		System.out.println("v7: " + v7);
		System.out.println("v8: " + v8);
		System.out.println("[Math.min()사용]");
		int v9 = Math.min(5,9);
		double v10 = Math.min(5.3, 2.5);
		System.out.println("v9: " + v9);
		System.out.println("v10: " + v10);
		System.out.println("[Math.random()사용]");
		double v11 = Math.random();
		System.out.println("v11: " + v11);
		System.out.println("[Math.rint()사용]");
		double v12 = Math.rint(5.3);
		double v13 = Math.rint(5.7);
		System.out.println("v12: " + v12);
		System.out.println("v13: " + v13);
		System.out.println("[Math.round()사용]");
		long v14 = Math.round(5.3);
		long v15 = Math.round(5.7);
		System.out.println("v14: " + v14);
		System.out.println("v15: " + v15);
		System.out.println("[Math.round()와 연산을 이용하여, 소수점 2자리 수까지 구하기]");
		double value = 12.3456;				//value: 12.3456
		double temp1 = value * 100;			//temp1: 1234.56
		long temp2 = Math.round(temp1);		//round는 반올림 해준다. temp2: 1235
		double v16 = temp2 / 100.0; 		//temp2를 100으로 나눠준다.v16: 12.35 
		System.out.println("v16: " + v16);
		
	}
}