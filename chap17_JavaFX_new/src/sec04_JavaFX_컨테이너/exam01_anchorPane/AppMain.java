package sec04_JavaFX_컨테이너.exam01_anchorPane;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class AppMain extends Application{
	@Override
	public void start(Stage primaryScene) throws Exception {
		Parent parent = FXMLLoader.load(getClass().getResource("root.fxml"));
		Scene scene = new Scene(parent);
		
		primaryScene.setTitle("This is a title");
		primaryScene.setScene(scene);
		primaryScene.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}