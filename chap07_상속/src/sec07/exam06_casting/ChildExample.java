package sec07.exam06_casting;

public class ChildExample {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parent parent = new Child();
		parent.field1 = "data1";
		parent.method1();
		parent.method2();
		
		/*아래 두 줄은 현재 자식 객체의 필드/메소드임으로 접근 불가 
		parent.field2 = "data2";
		parent.method3();
		*/
		
		Child child = (Child) parent;
		child.field2 = "yyy";
		child.method3();
	}

}
