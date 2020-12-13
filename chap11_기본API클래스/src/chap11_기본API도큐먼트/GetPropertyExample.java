package chap11_기본API도큐먼트;

import java.util.Properties;
import java.util.Set;

public class GetPropertyExample {
	public static void main(String[] args) {
		String osName = System.getProperty("os.name");
		String userName = System.getProperty("user.name");
		String userHome = System.getProperty("user.home");
		String javaVersion = System.getProperty("java.version");
		
		System.out.println("운영체제 이름: " + osName);
		System.out.println("사용자 이름: " + userName);
		System.out.println("사용자 홈 디렉토리: " + userHome);
		System.out.println("자바 버전: " + javaVersion);
		
		System.out.println("------------------------------------------------------------");
		System.out.println("   [key]     		   		value  ");
		System.out.println("------------------------------------------------------------");

		Properties props = System.getProperties();
		Set keys = props.keySet();
		for(Object objKey : keys) {
			String key = (String) objKey;
			String value = System.getProperty(key);
			System.out.println("   [ " + key + " ]\n					" + value + "  ");
		}
	}
}