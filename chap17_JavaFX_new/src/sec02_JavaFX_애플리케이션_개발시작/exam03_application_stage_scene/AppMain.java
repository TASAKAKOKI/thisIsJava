package sec02_JavaFX_���ø����̼�_���߽���.exam03_application_stage_scene;

import java.util.Map;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
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
		//scene����
		VBox root = new VBox(); //Parent�� ���� Ŭ����
		root.setPrefWidth(350);
		root.setPrefHeight(150);
		root.setAlignment(Pos.CENTER);
		root.setSpacing(20);
		
		Label label = new Label();
		label.setText("Hello, JavaFX");
		label.setFont(new Font(50)); //����ũ�⸦ 50���� ����

		Button btn = new Button();
		btn.setText("Ȯ�ι�ư");
		btn.setOnAction( e -> Platform.exit() );
		
		root.getChildren().add(label);
		root.getChildren().add(btn);
		
		Scene scene = new Scene(root);
		
		primaryStage.setTitle("AppMain Ÿ��Ʋ ���� ��");
		primaryStage.setScene(scene);
		System.out.println(Thread.currentThread().getName() + "�� ApplicationŬ������ start()�� ȣ���Ͽ����ϴ�.");
		primaryStage.show();
	}
	
	@Override
	public void stop() throws Exception {
		System.out.println(Thread.currentThread().getName() + "�� ApplicationŬ������ stop()�� ȣ���Ͽ����ϴ�.");
	}
}