package sec02_���׸�Ÿ��.exam01_none_generic_type;

public class BoxExample {
	public static void main(String[] args) {
		Box box = new Box();
		
		box.set("ȫ�浿"); //���ڿ��� �Ű������� �־�����, �ڵ�Ÿ�Ժ�ȯ�� �Ͼ Object��ü�� ���Եȴ�.
		
		String name = (String) box.get(); //get()�� ���� ��ȯ�Ǵ� Ÿ���� Object�̹Ƿ�, ���ڿ��� �ٽ� ����Ÿ�Ժ�ȯ�� ���־�� �Ѵ�.
		
		box.set(new Apple());//������ �߻����� �ʴ´�.
		//�ֳ��ϸ�, ��� ��ü�� �ֻ��� Ŭ������ Object�̹Ƿ�,
		//�ڵ����� Object��ü�� Ÿ�� ��ȯ�� �Ǳ� �����̴�.
		//�ٸ�, �̷��� ���, ��ü�� �ٽ� ��ȯ�ؾ� �� ��, �ٽ� �ѹ� Ÿ�Ժ�ȯ�� ����Ƿ�,
		//������ ���� ���ϴٴ� ������ �ִ�.
	}
}