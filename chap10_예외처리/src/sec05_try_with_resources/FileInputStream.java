package sec05_try_with_resources;

//AutoCloseable�������̽��� �����Ǿ� �ִ� Ŭ������ try-with-resource�� ����� �� �ִ�.
public class FileInputStream implements AutoCloseable {
	//FileInputStream Ŭ������ �ʵ� �����
	private String file;
	
	//FileInputStream Ŭ������ ������ �ۼ�
	public FileInputStream(String file) {
		this.file = file;
	}
	
	//FileInputStream Ŭ������ read()�޼ҵ� ����
	public void read() {
		System.out.println(file +"�� �н��ϴ�.");
	}
	
	@Override
	//AutoCloseable �������̽��� �߻�޼ҵ� ������
	public void close() throws Exception {
		System.out.println(file + "�� �ݽ��ϴ�.");
	}
}
