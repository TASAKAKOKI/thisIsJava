package sec07_user_define_exception;

public class AccountExample {
	public static void main(String[] args) {
		//Account 객체 생성
		Account account = new Account();
		
		//예금하기
		account.deposit(10000);
		System.out.println("예금액: " + account.getBalance());
		
		//출금하기
		try {
			account.withdraw(100000);
			System.out.println("예금액: " + account.getBalance());
		} catch (BalanceInsufficientException e) {
			System.out.println("예외 발생!");
			System.out.println(e.getMessage().toString());
			e.printStackTrace();
		}
	}

}
