package sec07_user_define_exception;

public class AccountExample {
	public static void main(String[] args) {
		//Account ��ü ����
		Account account = new Account();
		
		//�����ϱ�
		account.deposit(10000);
		System.out.println("���ݾ�: " + account.getBalance());
		
		//����ϱ�
		try {
			account.withdraw(100000);
			System.out.println("���ݾ�: " + account.getBalance());
		} catch (BalanceInsufficientException e) {
			System.out.println("���� �߻�!");
			System.out.println(e.getMessage().toString());
			e.printStackTrace();
		}
	}

}
