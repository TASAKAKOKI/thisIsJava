package verify.exam06;

public class Child extends Parent{
	private String name;
	
	public Child() {
		//super()가 올 수 없다. 왜냐하면, this()자식생성자와 super()부모 생성자는 모두 첫줄에 호출되어야 하므로, 같은 블록에 있을 수 없기 때문이다.
		this("홍길동");
		System.out.println("Child() call");
	}
	
	public Child(String name) {
		//super();가 생략되어 있음.
		this.name = name;
		System.out.println("Child(String name) call");
	}
}