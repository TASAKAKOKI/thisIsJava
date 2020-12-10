package sec05_try_with_resources;

//AutoCloseable인터페이스가 구현되어 있는 클래스는 try-with-resource를 사용할 수 있다.
public class FileInputStream implements AutoCloseable {
	//FileInputStream 클래스의 필드 선언부
	private String file;
	
	//FileInputStream 클래스의 생성자 작성
	public FileInputStream(String file) {
		this.file = file;
	}
	
	//FileInputStream 클래스의 read()메소드 생성
	public void read() {
		System.out.println(file +"을 읽습니다.");
	}
	
	@Override
	//AutoCloseable 인터페이스의 추상메소드 재정의
	public void close() throws Exception {
		System.out.println(file + "을 닫습니다.");
	}
}
