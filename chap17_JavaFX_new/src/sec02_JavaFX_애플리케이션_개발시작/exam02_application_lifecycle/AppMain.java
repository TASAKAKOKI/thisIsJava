package sec02_JavaFX_���ø����̼�_���߽���.exam02_application_lifecycle;

import java.util.Map;

import javafx.application.Application;
import javafx.stage.Stage;

public class AppMain extends Application{
	public static void main(String[] args) {
		launch(args); 	//main�����忡�� launch()�� ȣ��Ǹ�,
		//���ο��� �ΰ��� �����尡 ������ �ȴ�. 
		// 	1.JavaFX Application Thread(������)�� AppMain��ü�� �����ϱ� ���ؼ� �����ڸ� ȣ����. 
		//	2.JavaFX-Launcher(������)�� ApplicationŬ������ init() �޼ҵ� ȣ��
	}

	public AppMain() {
		System.out.println(Thread.currentThread().getName() + "�� AppMain() �����ڸ� ȣ���Ͽ����ϴ�.");
	}
	
	@Override
	public void init() throws Exception {
		System.out.println(Thread.currentThread().getName() + "�� ApplicationŬ������ init()�� ȣ���Ͽ����ϴ�.");
		Parameters params = this.getParameters();
		Map<String, String> map = params.getNamed();
		String ip = map.get("ip");
		String port = map.get("port");
		System.out.println("ip: " + ip);
		System.out.println("port: " + port);
	}
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		System.out.println(Thread.currentThread().getName() + "�� ApplicationŬ������ start()�� ȣ���Ͽ����ϴ�.");
		primaryStage.show();
	}
	
	@Override
	public void stop() throws Exception {
		System.out.println(Thread.currentThread().getName() + "�� ApplicationŬ������ stop()�� ȣ���Ͽ����ϴ�.");
	}
}