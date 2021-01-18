package sec03_JavaFX_���̾ƿ�.exam03_margin_padding;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class AppMain extends Application{
	@Override
	public void start(Stage primaryScene) throws Exception {
		//�е� ����=========
		/*
			HBox hbox = new HBox();
			 	hbox.setPadding(new Insets(50,10,10,50));
			 	Button button = new Button();
			 	button.setPrefSize(100,100);
		*/
		//���� ����=======
			
			HBox hbox = new HBox();
				Button button = new Button();
				button.setPrefSize(100,100);
				HBox.setMargin(button, new Insets(10,10,50,50));
		
		hbox.getChildren().add(button);
		
		Scene scene = new Scene(hbox);
		
		primaryScene.setTitle("AppMainŸ��Ʋ");
		primaryScene.setScene(scene);
		primaryScene.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
}
