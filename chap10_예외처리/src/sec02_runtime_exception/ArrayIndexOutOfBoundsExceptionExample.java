package sec02_runtime_exception;

public class ArrayIndexOutOfBoundsExceptionExample {
	public static void main(String[] args) {
		//주어진 args가 2개가 아니면 ArrayIndexOutOfBoundsException을 발생하므로,
		//if문으로 처리해준다.
		if(args.length ==2) {
			String data1 = args[0];
			String data2 = args[1];
			
			System.out.println("args[0]: " + data1);
			System.out.println("args[1]: " + data2);			
		} else {
			//args를 2개 주지 않았을 경우,
			//사용자에게 args를 주는 방법을 안내한다.
			System.out.println("[실행방법]");
			System.out.println("java ArrayIndexOutOfBoundsExceptionExample 값1 값2");
		}
	}
}