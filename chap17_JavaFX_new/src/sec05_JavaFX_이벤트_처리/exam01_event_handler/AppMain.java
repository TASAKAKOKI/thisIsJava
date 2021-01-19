package sec05_JavaFX_이벤트_처리.exam01_event_handler;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class AppMain extends Application{
	@Override
	public void start(Stage primaryStage) throws Exception {
		Parent parent = FXMLLoader.load(getClass().getResource("root.fxml"));
		Scene scene = new Scene(parent);

		primaryStage.setTitle("FXML Contorller");
		primaryStage.setScene(scene);
		primaryStage.setOnCloseRequest( event -> {
			System.out.println("종료버튼이 클릭되었습니다.");
		});	
		primaryStage.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}