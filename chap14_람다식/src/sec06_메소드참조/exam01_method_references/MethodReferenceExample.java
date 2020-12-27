package sec06_메소드참조.exam01_method_references;

import java.util.function.IntBinaryOperator;

public class MethodReferenceExample {
	public static void main(String[] args) {
		IntBinaryOperator operator;
		
		//정적 메소드 참조
		operator = (x,y) -> Calculator.staticMethod(x, y);
		System.out.println("결과 1: " + operator.applyAsInt(1, 2));
		
		operator = Calculator :: staticMethod; // ::앞에 클래스가 오는 경우 - 정적 메소드를 참조하는 경우,
		System.out.println("결가 2: " + operator.applyAsInt(3, 4));
		
		//인스턴스 메소드 참조
		Calculator obj = new Calculator(); //인스턴스 객체를 먼저 생성해야 한다.
		
		operator = (x,y) -> obj.instanceMethod(x, y);
		System.out.println("결과 3: " + operator.applyAsInt(5, 6));
		 
		operator = obj :: instanceMethod; // :: 앞에 인스턴스객체명이 오는 경우 - 인스턴스 메소드를 참조하는 경우,
		System.out.println("결과 4: " + operator.applyAsInt(7, 8));
	}
}