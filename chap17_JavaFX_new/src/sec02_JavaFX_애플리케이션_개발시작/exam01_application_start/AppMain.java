package sec02_JavaFX_애플리케이션_개발시작.exam01_application_start;

import javafx.application.Application;
import javafx.stage.Stage;

public class AppMain extends Application{

	//부모클래스 Application는 추상클래스이므로, 추상메소드인 start()를 반드시 재정의해주어야 한다.
	@Override
	public void start(Stage primaryStage) throws Exception {
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);	//AppMain 객체 생성 및 메인 윈도우 생성
	}
}