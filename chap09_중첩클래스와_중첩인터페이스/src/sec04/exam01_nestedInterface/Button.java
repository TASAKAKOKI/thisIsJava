package sec04.exam01_nestedInterface;

public class Button {
	//인스턴스 필드: OnClickListener인터페이스 타입으로 필드를 선언; 여기에는 각종 구현객체가 대입될 수 있다.
	OnClickListener listener;
	
	//Setter 메소드
	//이 메소드는 OnClickListener인터페이스를 구현한 다양한 구현객체를 매개값으로 받아 사요한다.
	//주어진 매개값을 Button클래스의 인스턴스 필드 값으로 설정한다.
	void setOnClickListener(OnClickListener listener) {
		this.listener = listener;
	}
	
	//이벤트 발생(touch()이벤트)
	//Button객체에 touch메소드가 호출되면, 필드 변수값인 listener구현객체의 onClick() 실체메소드를 호출한다.
	void touch() {
		listener.onClick();
	}
	
	//OnClickListenr인터페이스에는 onClick()추상메소드가 선언되어 있고, 각 구현 객체는 onClick() 실체메소드가 정의되어야 한다.
	interface OnClickListener {
		void onClick();
	}
}