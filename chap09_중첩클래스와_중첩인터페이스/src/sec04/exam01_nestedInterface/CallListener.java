package sec04.exam01_nestedInterface;

public class CallListener implements Button.OnClickListener{
	@Override
	public void onClick() {
		System.out.println("전화를 겁니다.");	
	}
}