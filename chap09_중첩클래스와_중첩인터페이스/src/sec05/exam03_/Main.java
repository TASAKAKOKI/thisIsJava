package sec05.exam03_;

public class Main {
	public static void main(String[] args) {
		Window w = new Window();
		
		//window의 중첩클래스 button1, button2에 대해 각각 touch()메소드를 호출한다.
		w.button1.touch();
		w.button2.touch();
	}
}