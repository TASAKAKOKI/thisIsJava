package chap14_람다식.sec04_클래스멤버와로컬변수사용.exam01_field;

public class UsingThis {
	public int outterField = 10;
	
	class Inner {
		int innerField = 20;
		
		void method() {
			//람다식 
			MyFunctionalInterface fi = () -> {
				//만약 필드 변수 이름이 Field로 같았다면, 
				//바깥 클래스의 필트변수에 접근하기 위해서는, 밖클래스 이름.this.필드변수이름 으로 접근할 수 있다.
				System.out.println("outterField: " + outterField);
				System.out.println("outterField: " + UsingThis.this.outterField + "\n");
				
				System.out.println("innerField: " + innerField);
				System.out.println("innerField: " + this.innerField);
			
			};
			
			fi.method();
		}
	}
}