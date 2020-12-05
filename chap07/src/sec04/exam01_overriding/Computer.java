package sec04.exam01_overriding;

public class Computer extends Calculator {
	@Override
	double areaCircle(double r) {
		// TODO Auto-generated method stub
		System.out.println("Computer 객체의 areaCircle() 실행");
		return Math.PI*r*r;
		//Math는 JDK에서 제공해주는 기본적인 API이다.
	}
}
