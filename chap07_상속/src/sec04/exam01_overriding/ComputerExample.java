package sec04.exam01_overriding;

public class ComputerExample {
	
	public ComputerExample() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int r = 10;
		
		Calculator cal = new Calculator();
		System.out.println("원 면적: " + cal.areaCircle(r) + "\n");

		Computer com = new Computer();
		//자식 클래스에서 재정의된 메소드를 자식 객체를 통해 호출한다.
		System.out.println("원 면적: " + com.areaCircle(r) + "\n");
		
	}

}
