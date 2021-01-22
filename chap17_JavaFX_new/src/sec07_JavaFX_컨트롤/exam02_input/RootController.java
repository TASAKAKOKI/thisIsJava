package sec07_JavaFX_ÄÁÆ®·Ñ.exam02_input;

import java.net.URL;
import java.time.LocalDate;
import java.util.ResourceBundle;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class RootController implements Initializable{
	@FXML private TextField txtTitle;
	@FXML private TextField txtPassword;
	@FXML private ComboBox<String> comboPublic;
	@FXML private DatePicker dateExit;
	@FXML private TextArea txtContent;

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		
	}
	
	public void handleBtnRegAction(ActionEvent e) {
		String title = txtTitle.getText();
		String password = txtPassword.getText();
		String strPublic = comboPublic.getValue();
		
		LocalDate localDate = dateExit.getValue();
		String content = txtContent.getText();
		System.out.println("title: " + title);
		System.out.println("paddword: " + password);
		System.out.println("public?: " + strPublic);
		if(localDate!=null) {
			System.out.println("dateExit: " + localDate.toString());
		}
		System.out.println("content: " + content);
	}
	public void handleBtnCancelAction(ActionEvent e) {
		Platform.exit();
	}
}