package sec02_제네릭타입.exam02_generic_type;

public class BoxExample {
	public static void main(String[] args) {
		Box<String> box1 = new Box<String>();
		
		box1.set("홍길동"); 
		
		String name = box1.get();
		
		Box<Integer> box2 = new Box<Integer>();
		box2.set(67);
		int value = box2.get();
	}
}