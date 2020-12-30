package sec04_Map컬렉션.exam03_properties;

import java.io.FileReader;
import java.net.URLDecoder;
import java.util.Properties;

public class PropertiesExample {
	public static void main(String[] args) throws Exception {
		Properties properties = new Properties(); // 키와 값이 모두 String으로 제한되어 있는 Properties (Map 구현 클래스)
		String path = PropertiesExample.class.getResource("database.properties").getPath(); //PropertiesExample.class가 있는
		path = URLDecoder.decode(path,"utf-8"); // 경로에 한글이 있을 경우 사용한다.
		properties.load(new FileReader(path));

		String driver = properties.getProperty("driver"); //Properties구현객체 파일 안에 있는 값을 .getProperty()메소드에 키를 매개값으로 주어 얻는다. 
		String url = properties.getProperty("url");
		String username = properties.getProperty("username");
		String password = properties.getProperty("password");
		
		System.out.println("driver: " + driver);
		System.out.println("url: " + url);
		System.out.println("username: " + username);
		System.out.println("password: " + password);
	}
}