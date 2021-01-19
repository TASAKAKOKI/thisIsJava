package sec06_JavaFX_속성감시와_바인딩.exam02_property_binding;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.beans.binding.Bindings;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextArea;

public class RootController implements Initializable{
	@FXML private TextArea textArea1;
	@FXML private TextArea textArea2;
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		//단방향 바인딩
		textArea2.textProperty().bind(textArea1.textProperty());
		
		//양방향 바인딩
		//Bindings.bindBidirectional(textArea1.textProperty(), textArea2.textProperty());
	}
}