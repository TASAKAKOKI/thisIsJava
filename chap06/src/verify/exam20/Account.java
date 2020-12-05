package verify.exam20;

public class Account {
	//�ʵ忡 ���� ���¹�ȣ(ano), ������(owner), �ʱ� �Աݾ�(balance)�� �������ش�.
	private String ano;
	private String owner;
	private int balance;
	
	//���¹�ȣ, ������, �ʱ� �Աݾ��� �Ű������� ���޹޾� Account��ü�� �����ϴ� �����ڸ� �������ش�.
	public Account(String ano, String owner, int balance) {
		this.ano = ano;
		this.owner = owner;
		this.balance = balance;
	}
	
	//�� private �ʵ�鿡 ���� Getter �޼ҵ�� Setter �޼ҵ带 �������ش�.
	public String getAno() {return ano;}
	public void setAno(String ano) {this.ano = ano;}
	
	public String getOwner() {return owner;}
	public void setOwner(String owner) {this.owner = owner;}

	public int getBalance() {return balance;}
	public void setBalance(int balance) {this.balance = balance;}
}
