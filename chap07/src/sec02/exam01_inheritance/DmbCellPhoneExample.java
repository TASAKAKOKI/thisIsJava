package sec02.exam01_inheritance;

public class DmbCellPhoneExample {

	public static void main(String args[]) {
		DmbCellPhone dmbCellPhone =  new DmbCellPhone("�ڹ���", "����", 10);
		
		//�θ� CellPhone Ŭ�����κ��� ��ӹ��� �ʵ� ���
		System.out.println("��: " + dmbCellPhone.model);
		System.out.println("����: " + dmbCellPhone.color);
		//�ڽ� DmbCellPhone Ŭ������ �ʵ� ���		
		System.out.println("ä��: " + dmbCellPhone.channel);
		
		//�θ� CellPhone Ŭ�����κ��� ��ӹ��� �޼ҵ� ȣ��
		dmbCellPhone.powerOn();
		dmbCellPhone.bell();
		dmbCellPhone.sendVoice("�� �߸� ��ȭ ��");
		dmbCellPhone.receiveVoice("�� �׷���?");
		dmbCellPhone.hangUp();
		dmbCellPhone.powerOff();
		//�ڽ� DmbCellPhone Ŭ������ �޼ҵ� ȣ��
		dmbCellPhone.turnOnDmb();
		dmbCellPhone.changeChannelDmb(7);
		dmbCellPhone.turnOffDmb();
	}
}
