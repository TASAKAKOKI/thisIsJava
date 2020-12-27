package sec04_클래스멤버와_로컬변수_사용.exam01_field;

public class UsingThisExample {
	public static void main(String[] args) {
		UsingThis usingThis = new UsingThis();
		UsingThis.Inner inner = usingThis.new Inner();
		inner.method();
	}
}