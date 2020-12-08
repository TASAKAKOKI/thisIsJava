package verify.exam06;

public class ChattingWrong {
	void startChat(String chatId) {
		String nickName = null;
		nickName = chatId;
		
		Chat chat = new Chat() {
			@Override
			public void start() {
				String inputData = "안녕하세요";
				//컴파일 에러는 익명객체 내부에서 매개변수와 인스턴스 필드값을 사용했기 때문이다.
				//메소드가 실행이 끝나면, 매개변수와 인스턴스 필드값은 스택 메모리 영역에서 사라진다.
				//따라서 주어진 필드값을 주어진 매개값으로 초기화 하는 라인은 final 특성을 갖게 하지 않으므로, 필드값은 선언과 동시에 매개값으로 초기화하고, 
				//재차 초기화 되는 것을 방지한다.
				String message = "[" + nickName +"]" + inputData;
				sendMessage(message);
			}
		};
		chat.start();
	}
	
	class Chat {
		void start() {}
		void sendMessage(String message) {}
	}
}