package verify.exam02;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class RootController implements Initializable {
	@FXML private Button btnAdd;
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		btnAdd.setOnAction(event -> handleBtnAddAction(event));
		
	}
	public void handleBtnAddAction(ActionEvent e) {
		try {
		Stage dialog = new Stage(StageStyle.UTILITY);
		dialog.initModality(Modality.WINDOW_MODAL);
		dialog.initOwner(btnAdd.getScene().getWindow());
		dialog.setTitle("추가 화면");
		
		Parent parent = FXMLLoader.load(getClass().getResource("popup.fxml"));
		
		Button btnFormCancel = (Button) parent.lookup("#btnFormCancel");
		btnFormCancel.setOnAction(event -> dialog.close());
		
		Scene scene = new Scene(parent);
		dialog.setScene(scene);
		dialog.setResizable(false);
		dialog.show();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
	}
}