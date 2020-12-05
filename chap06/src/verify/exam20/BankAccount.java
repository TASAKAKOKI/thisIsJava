package verify.exam20;

//import�� ����Ű: ctrl + shift + O 
import java.util.Scanner;

public class BankAccount {
	//���¸���� �ʵ�� �������ش�.
	private static Account[] accountArray = new Account[100];
	//Scanner�� java.util.*�� �ִ� ��Ű��
	private static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//run������ while���� �����ϴµ� ���δ�.
		boolean run = true;
		while(run) {
			System.out.println("------------------------------------");
			System.out.println("1.���»���|2.���¸��|3.����|4.���|5.����");
			System.out.println("------------------------------------");
			System.out.print("����> "); // System.out.print�� .println�� �޸� �ٹٲ��� ���� �ʰ� ���� ���� �̾� ǥ���� �� �ִ�.
			
			int selectedNo = scanner.nextInt();//scanner��ü�� .nextInt()�� �Ű������� �־��� int���� ��ȯ�Ѵ�.
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
					System.out.println("���α׷� ����");
					run = false;
				default:
					continue;
			}
		}
	}
	private static void createAccount() {
		// TODO Auto-generated method stub
		System.out.println("--------------");
		System.out.println("���»���");
		System.out.println("--------------");
		
		System.out.print("���¹�ȣ: ");
		String ano = scanner.next();
		
		System.out.print("������: ");
		String owner = scanner.next();
		
		System.out.print("�ʱ� �Աݾ�: ");
		int balance = scanner.nextInt();
		Account account = new Account(ano,owner,balance);
		
		for(int i = 0; i < accountArray.length; i++) {
			if(accountArray[i] == null) {
				accountArray[i] = account;
				System.out.println("���: ���°� �����Ǿ����ϴ�.");
				break;
			}
		}
	}
	private static void accountList() {
		// TODO Auto-generated method stub
		System.out.println("--------------");
		System.out.println("���¸��");
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
		System.out.println("����");
		System.out.println("--------------");
		
		System.out.print("���¹�ȣ: ");
		String ano = scanner.next();
		System.out.print("���ݾ�: ");
		int money = scanner.nextInt();
		
		Account accountToFind = findAccount(ano);
		if(accountToFind == null) {
			System.out.println("���: ���¸� ã�� �� �����ϴ�.");
			return;
		}
		accountToFind.setBalance(accountToFind.getBalance() + money);
		System.out.println("���: ������ �����Ǿ����ϴ�.");
	}
	private static void withdraw() {
		// TODO Auto-generated method stub
		System.out.println("--------------");
		System.out.println("���");
		System.out.println("--------------");
		
		System.out.print("���¹�ȣ: ");
		String ano = scanner.next();
		System.out.print("���ݾ�: ");
		int money = scanner.nextInt();
		
		Account accountToFind = findAccount(ano);
		if(accountToFind == null) {
			System.out.println("���: ���¸� ã�� �� �����ϴ�.");
			return;
		} else {
			int resultMoney = accountToFind.getBalance() - money;
			if(resultMoney < 0) {
				System.out.println("���: ���¿� �ܾ��� �����Ͽ� ����� �� �����ϴ�.");
				return;
			} else {
				accountToFind.setBalance(resultMoney);
				System.out.println("���: ����� �����Ǿ����ϴ�.");
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
