package verify.exam06;

public class ChattingWrong {
	void startChat(String chatId) {
		String nickName = null;
		nickName = chatId;
		
		Chat chat = new Chat() {
			@Override
			public void start() {
				String inputData = "�ȳ��ϼ���";
				//������ ������ �͸�ü ���ο��� �Ű������� �ν��Ͻ� �ʵ尪�� ����߱� �����̴�.
				//�޼ҵ尡 ������ ������, �Ű������� �ν��Ͻ� �ʵ尪�� ���� �޸� �������� �������.
				//���� �־��� �ʵ尪�� �־��� �Ű������� �ʱ�ȭ �ϴ� ������ final Ư���� ���� ���� �����Ƿ�, �ʵ尪�� ����� ���ÿ� �Ű������� �ʱ�ȭ�ϰ�, 
				//���� �ʱ�ȭ �Ǵ� ���� �����Ѵ�.
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