package verify.exam20;

//import문 단축키: ctrl + shift + O 
import java.util.Scanner;

public class BankAccount {
	//계좌목록을 필드로 지정해준다.
	private static Account[] accountArray = new Account[100];
	//Scanner는 java.util.*에 있는 패키지
	private static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//run변수는 while문을 조정하는데 쓰인다.
		boolean run = true;
		while(run) {
			System.out.println("------------------------------------");
			System.out.println("1.계좌생성|2.계좌목록|3.예금|4.출금|5.종료");
			System.out.println("------------------------------------");
			System.out.print("선택> "); // System.out.print는 .println과 달리 줄바꿈을 하지 않고 다음 줄을 이어 표시할 수 있다.
			
			int selectedNo = scanner.nextInt();//scanner객체의 .nextInt()는 매개값으로 주어진 int값을 반환한다.
			switch(selectedNo) {
				case 1:
					createAccount();
					break;
				case 2:
					accountList();
					break;
				case 3:
					deposit();
					break;
				case 4:
					withdraw();
					break;
				case 5:
					System.out.println("프로그램 종료");
					run = false;
				default:
					continue;
			}
		}
	}
	private static void createAccount() {
		// TODO Auto-generated method stub
		System.out.println("--------------");
		System.out.println("계좌생성");
		System.out.println("--------------");
		
		System.out.print("계좌번호: ");
		String ano = scanner.next();
		
		System.out.print("계좌주: ");
		String owner = scanner.next();
		
		System.out.print("초기 입금액: ");
		int balance = scanner.nextInt();
		Account account = new Account(ano,owner,balance);
		
		for(int i = 0; i < accountArray.length; i++) {
			if(accountArray[i] == null) {
				accountArray[i] = account;
				System.out.println("결과: 계좌가 생성되었습니다.");
				break;
			}
		}
	}
	private static void accountList() {
		// TODO Auto-generated method stub
		System.out.println("--------------");
		System.out.println("계좌목록");
		System.out.println("--------------");
		
		for(int i = 0; i < accountArray.length; i++) {
			Account account = accountArray[i];
			if(account != null) {
				System.out.print(account.getAno());
				System.out.print("     ");
				System.out.print(account.getOwner());
				System.out.print("     ");
				System.out.print(account.getBalance());
				System.out.println();
			}
		}
	}
	private static void deposit() {
		// TODO Auto-generated method stub
		System.out.println("--------------");
		System.out.println("예금");
		System.out.println("--------------");
		
		System.out.print("계좌번호: ");
		String ano = scanner.next();
		System.out.print("예금액: ");
		int money = scanner.nextInt();
		
		Account accountToFind = findAccount(ano);
		if(accountToFind == null) {
			System.out.println("결과: 계좌를 찾을 수 없습니다.");
			return;
		}
		accountToFind.setBalance(accountToFind.getBalance() + money);
		System.out.println("결과: 예금이 성공되었습니다.");
	}
	private static void withdraw() {
		// TODO Auto-generated method stub
		System.out.println("--------------");
		System.out.println("출금");
		System.out.println("--------------");
		
		System.out.print("계좌번호: ");
		String ano = scanner.next();
		System.out.print("예금액: ");
		int money = scanner.nextInt();
		
		Account accountToFind = findAccount(ano);
		if(accountToFind == null) {
			System.out.println("결과: 계좌를 찾을 수 없습니다.");
			return;
		} else {
			int resultMoney = accountToFind.getBalance() - money;
			if(resultMoney < 0) {
				System.out.println("결과: 계좌에 잔액이 부족하여 출금할 수 없습니다.");
				return;
			} else {
				accountToFind.setBalance(resultMoney);
				System.out.println("결과: 출금이 성공되었습니다.");
				return;
			}
		}
	}
	private static Account findAccount(String ano) {
		// TODO Auto-generated method stub
		Account account = null;
		for(int i =0; i < accountArray.length; i++) {
			if(accountArray[i] != null) {
				String dbAno = accountArray[i].getAno();
				if(ano.equals(dbAno)) {
					account = accountArray[i];
					break;
				}
			}
		}
		return account;
	}
}
