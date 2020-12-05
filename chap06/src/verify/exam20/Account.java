package verify.exam20;

public class Account {
	//필드에 각각 계좌번호(ano), 계좌주(owner), 초기 입금액(balance)를 선언해준다.
	private String ano;
	private String owner;
	private int balance;
	
	//계좌번호, 계좌주, 초기 입금액을 매개값으로 전달받아 Account객체를 생성하는 생성자를 생성해준다.
	public Account(String ano, String owner, int balance) {
		this.ano = ano;
		this.owner = owner;
		this.balance = balance;
	}
	
	//각 private 필드들에 대한 Getter 메소드와 Setter 메소드를 생성해준다.
	public String getAno() {return ano;}
	public void setAno(String ano) {this.ano = ano;}
	
	public String getOwner() {return owner;}
	public void setOwner(String owner) {this.owner = owner;}

	public int getBalance() {return balance;}
	public void setBalance(int balance) {this.balance = balance;}
}
