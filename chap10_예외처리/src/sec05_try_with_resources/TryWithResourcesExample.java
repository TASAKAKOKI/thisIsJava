package sec05_try_with_resources;

public class TryWithResourcesExample {
	public static void main(String[] args) {
		try(FileInputStream fis = new FileInputStream("file.txt")) {
			fis.read();
			throw new Exception(); //강제 예외 발생 코드
			//예외가 발생되는 즉시, close()가 호출된 후에, catch문이 실행된다.
		} catch(Exception e) {
			System.out.println("예외처리 코드가 실행되었습니다니다.");
		}
	}
}