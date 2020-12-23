package sec02_제네릭타입.exam02_generic_type;
/*클래스/인터페이스를 선언할 때, 미리 파라미터 타입을 함께 정의해준다.*/
public class Box<T> {
	private T t;
	
	public void set(T t) {
		this.t = t;
	}
	
	public T get() {
		return this.t;
	}
}