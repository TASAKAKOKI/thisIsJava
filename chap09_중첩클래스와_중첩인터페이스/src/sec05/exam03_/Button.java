package sec05.exam03_;

public class Button {
	//OnClickListener(인터페이스)타입으로 필드(listener)를 선언
	OnClickListener listener;
	
	//setOnClickListener(Setter메소드)를 통해 외부에서 구현객체(OnClickListener listener)를 매개값으로 전달받아 필드(listener)에 대입
	//OnClickListener 구현객체를 매개값으로 받는 메소드 생성
	//매개값으로 주어진 구현객체를 인터페이스 필드에 대입
	void setOnClickListener(OnClickListener listener) {
		this.listener = listener;
	}
	
	//Button 이벤트(touch())가 발생했을 때, 인터페이스를 통해 구현 객체의 메소드를 호출(listener.onClick())한다.  
	//필드에 대입된 구현객체의 onClick() 실체메소드를 호출하는 메소드 생성
	void touch() {
		listener.onClick();		
	}
	//중첩 인터페이스 선언부
	interface OnClickListener {
		void onClick();
	}
}