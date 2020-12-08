package verify.exam06;

public class ChattingCorrect {
	void startChat(String chatId) {
		String nickName = chatId;
		
		Chat chat = new Chat() {
			@Override
			public void start() {
				String inputData = "æ»≥Á«œººø‰";
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