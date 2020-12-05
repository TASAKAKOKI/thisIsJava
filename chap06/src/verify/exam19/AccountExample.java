package verify.exam19;

public class AccountExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account account = new Account();
		
		account.setBalance(10000);
		System.out.println("현재 잔고: " + account.getBalance());
		
		// MIN_BALANCE보다 작은 값이 주어지면, 현 잔고를 그대로 유지한다.
		account.setBalance(-100);
		System.out.println("현재 잔고: " + account.getBalance());
		
		account.setBalance(150000);
		System.out.println("현재 잔고: " + account.getBalance());
		
		// MAX_BALANCE보다 큰 값이 주어지면, 현 잔고를 그대로 유지한다.
		account.setBalance(2000000);
		System.out.println("현재 잔고: " + account.getBalance());

		account.setBalance(300000);
		System.out.println("현재 잔고: " + account.getBalance());
	}

}
