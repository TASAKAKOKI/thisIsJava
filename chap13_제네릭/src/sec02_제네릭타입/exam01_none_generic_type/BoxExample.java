package sec02_제네릭타입.exam01_none_generic_type;

public class BoxExample {
	public static void main(String[] args) {
		Box box = new Box();
		
		box.set("홍길동"); //문자열을 매개값으로 주었지만, 자동타입변환이 일어나 Object객체로 대입된다.
		
		String name = (String) box.get(); //get()을 통해 반환되는 타입은 Object이므로, 문자열로 다시 강제타입변환을 해주어야 한다.
		
		box.set(new Apple());//에러가 발생하지 않는다.
		//왜냐하면, 어떠한 객체도 최상위 클래스는 Object이므로,
		//자동으로 Object객체로 타입 변환이 되기 떄문이다.
		//다만, 이러할 경우, 객체를 다시 반환해야 할 떄, 다시 한번 타입변환이 생기므로,
		//성능이 좋지 못하다는 단점이 있다.
	}
}