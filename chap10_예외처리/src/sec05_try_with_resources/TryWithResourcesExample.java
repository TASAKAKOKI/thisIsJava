package sec05_try_with_resources;

public class TryWithResourcesExample {
	public static void main(String[] args) {
		try(FileInputStream fis = new FileInputStream("file.txt")) {
			fis.read();
			throw new Exception(); //���� ���� �߻� �ڵ�
			//���ܰ� �߻��Ǵ� ���, close()�� ȣ��� �Ŀ�, catch���� ����ȴ�.
		} catch(Exception e) {
			System.out.println("����ó�� �ڵ尡 ����Ǿ����ϴٴϴ�.");
		}
	}
}