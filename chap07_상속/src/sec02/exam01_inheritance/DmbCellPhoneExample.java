package sec02.exam01_inheritance;

public class DmbCellPhoneExample {

	public static void main(String args[]) {
		DmbCellPhone dmbCellPhone =  new DmbCellPhone("자바폰", "검정", 10);
		
		//부모 CellPhone 클래스로부터 상속받은 필드 출력
		System.out.println("모델: " + dmbCellPhone.model);
		System.out.println("색상: " + dmbCellPhone.color);
		//자식 DmbCellPhone 클래스의 필드 출력		
		System.out.println("채널: " + dmbCellPhone.channel);
		
		//부모 CellPhone 클래스로부터 상속받은 메소드 호출
		dmbCellPhone.powerOn();
		dmbCellPhone.bell();
		dmbCellPhone.sendVoice("아 잘못 전화 검");
		dmbCellPhone.receiveVoice("아 그랬냐?");
		dmbCellPhone.hangUp();
		dmbCellPhone.powerOff();
		//자식 DmbCellPhone 클래스의 메소드 호출
		dmbCellPhone.turnOnDmb();
		dmbCellPhone.changeChannelDmb(7);
		dmbCellPhone.turnOffDmb();
	}
}
