package sec02_JavaFX_애플리케이션_개발시작.exam02_application_lifecycle;

import java.util.Map;

import javafx.application.Application;
import javafx.stage.Stage;

public class AppMain extends Application{
	public static void main(String[] args) {
		launch(args); 	//main스레드에서 launch()가 호출되면,
		//내부에서 두개의 스레드가 생성이 된다. 
		// 	1.JavaFX Application Thread(스레드)가 AppMain객체를 생성하기 위해서 생성자를 호출함. 
		//	2.JavaFX-Launcher(스레드)가 Application클래스의 init() 메소드 호출
	}

	public AppMain() {
		System.out.println(Thread.currentThread().getName() + "가 AppMain() 생성자를 호출하였습니다.");
	}
	
	@Override
	public void init() throws Exception {
		System.out.println(Thread.currentThread().getName() + "가 Application클래스의 init()를 호출하였습니다.");
		Parameters params = this.getParameters();
		Map<String, String> map = params.getNamed();
		String ip = map.get("ip");
		String port = map.get("port");
		System.out.println("ip: " + ip);
		System.out.println("port: " + port);
	}
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		System.out.println(Thread.currentThread().getName() + "가 Application클래스의 start()를 호출하였습니다.");
		primaryStage.show();
	}
	
	@Override
	public void stop() throws Exception {
		System.out.println(Thread.currentThread().getName() + "가 Application클래스의 stop()을 호출하였습니다.");
	}
}