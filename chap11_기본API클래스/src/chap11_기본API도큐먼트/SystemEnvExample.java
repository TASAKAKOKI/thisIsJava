package chap11_기본API도큐먼트;

public class SystemEnvExample {
	public static void main(String[] args) {
		String javaHome = System.getenv("JAVA_HOME");
		System.out.println("JAVA_HOME: " + javaHome);
		//제어판 - 시스템 및 보안 - 시스템 -고급 시스템 설정 - 고급 - 환경변수 - 시스템 변수 에서 변수에 해달하는 것을 getenv()에 매개값으로 전달하면 그 값이 String으로 반환된다. 
	}
}