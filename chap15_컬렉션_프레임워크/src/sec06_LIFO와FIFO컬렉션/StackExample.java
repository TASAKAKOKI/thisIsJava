package sec06_LIFO와FIFO컬렉션;

import java.util.Stack;

/*LIFO 자료구조를 구현한 Stack클래스: 나중에 넣은 자료를 먼저 반환한다.*/
public class StackExample {
	public static void main(String[] args) {
		Stack<Coin> coinBoxStack = new Stack<>();
		
		coinBoxStack.push(new Coin(100));
		coinBoxStack.push(new Coin(50));
		coinBoxStack.push(new Coin(500));
		coinBoxStack.push(new Coin(200));
		coinBoxStack.push(new Coin(10));
		
		while(!coinBoxStack.isEmpty()) {
			Coin coin = coinBoxStack.pop();
			System.out.println("꺼내온 동전: " + coin.getValue() + "원");
		}
		
	}
}