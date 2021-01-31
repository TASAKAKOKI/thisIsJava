package sec07_TCP네트워킹.exam03_chatting;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class ServerExample1 extends Application{
	//UI 생성 코드// (레이아웃을 구성하고 ServerExample을 실행시킨다.
	@Override
	public void start(Stage primaryStage) throws Exception {
		Parent parent = FXMLLoader.load(getClass().getResource("serverRoot.fxml"));
		Scene scene = new Scene(parent);
		scene.getStylesheets().add(getClass().getResource("app.css").toString());
		
		primaryStage.setScene(scene);
		primaryStage.setTitle("chattingServer");
		primaryStage.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}