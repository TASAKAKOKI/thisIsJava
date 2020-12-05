package verify.exam19;

public class Account {
	//static final은 상수를 선언해준다.
	//상수명은 대문자로 하는 것이 관례이다.
	public static final int MIN_BALANCE = 0;
	public static final int MAX_BALANCE = 1000000;
	
	//private 접근제한자는 클래스 내부에서만 접근 가능하도록 해준다.
	private int balance;
	
	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		if(balance < Account.MIN_BALANCE
			|| balance > Account.MAX_BALANCE) {
			return;
		}
		this.balance = balance;
	}

}
