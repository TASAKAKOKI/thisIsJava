package sec05.exam04_;

public class Anonymous {
	private int field;

	/* field는 private키워드가 붙어있기 때문에, 상속받은 객체에서는 계속 접근할 수 있다.
	 * 하지만, 아래 method에 매개값으로 주어진, arg1, arg2나 로컬변수로 선언된 var1, var2는 method()의 실행이 끝나면,
	 * 스택 메모리에서 삭제된다. 그러면, 힙메모리에 존재하는 Calculator 가상 객체는 더이상 변수를 사용할 수 없는데, 
	 * 이를 위해 컴파일 시 자동으로 Calculator 객체 안에 복사된다.
	*/
	public void method(final int arg1, int arg2) {
		final int var1 = 0;
		int var2 = 0;
		
		field = 10;
		
		//arg1 = 20; (X): arg1은 final 키워드가 붙었으며, 또한 인터페이스에서 사용되었으므로 초기화 할 수 없다.
		//arg2 = 20; (X): arg2은 인터페이스에서 사용되었으므로 초기화 할 수 없다.		
	
		//var1 = 30; (X): var1은 final 키워드가 붙었으며, 또한 인터페이스에서 사용되었으므로 초기화 할 수 없다.
		//var2 = 30; (X): var2은  인터페이스에서 사용되었으므로 초기화 할 수 없다.
		
		Calculator calc = new Calculator() {
			@Override
			public int sum() {
				int result = field+arg1+arg2+var1+var2;
				return result;
			}
		};
		System.out.println(calc.sum());
	}
}