package sec05.exam02_final_method;

public class Car {
	//필드
	public int speed;
	
	//메소드
	public void speedUp() {speed++;}
	
	//final 메소드 
	//아래의 메소드는 final로 선언되었으므로 자식 클래스에서 Overriding 할 수 없다.
	public final void stop() {
		System.out.println("차가 멈춥니다.");
		speed = 0;
	}
}
