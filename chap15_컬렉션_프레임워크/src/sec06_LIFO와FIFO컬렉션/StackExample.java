package sec06_LIFO��FIFO�÷���;

import java.util.Stack;

/*LIFO �ڷᱸ���� ������ StackŬ����: ���߿� ���� �ڷḦ ���� ��ȯ�Ѵ�.*/
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
			System.out.println("������ ����: " + coin.getValue() + "��");
		}
		
	}
}