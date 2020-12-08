package sec04.exam01_nestedInterface;

public class ButtonExample {
	public static void main(String args[]) {
		Button btn = new Button();
		
		//방법 1: 구현객체 생성 후, 매개값으로 전달
		CallListener cl = new CallListener();
		MessageListener ml = new MessageListener();
		btn.setOnClickListener(cl);
		btn.touch();
		btn.setOnClickListener(ml);
		btn.touch();
		System.out.println("============");
		
		//방법2: 매개값으로 생성자 호출
		btn.setOnClickListener(new CallListener());
		btn.touch();
		btn.setOnClickListener(new MessageListener());
		btn.touch();
		System.out.println("============");
		
		//방법3: 매개값으로 익명개체 생성
		btn.setOnClickListener(new Button.OnClickListener() {
			@Override
			public void onClick() {
				System.out.println("사진을 찍습니다.");
			}
		});
		btn.touch();
		btn.setOnClickListener(new Button.OnClickListener() {
			@Override
			public void onClick() {
				System.out.println("새로운 미지의 버튼이 눌렸습니다.");
			}
		});
		btn.touch();
	}
}