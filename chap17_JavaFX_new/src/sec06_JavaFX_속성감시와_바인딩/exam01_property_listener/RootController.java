package sec06_JavaFX_속성감시와_바인딩.exam01_property_listener;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.text.Font;

public class RootController implements Initializable{
	@FXML private Slider slider;
	@FXML private Label label;

	@Override
	public void initialize(URL location, ResourceBundle bundle) {
		slider.valueProperty().addListener( new ChangeListener<Number>() {
			@Override
			public void changed(ObservableValue<? extends Number> observable,
								Number oldNumber, Number newNumber) {
				label.setFont(new Font(newNumber.doubleValue()));
				System.out.println("슬라이드를 움직여 " + oldNumber.toString() + "에서 " + newNumber.toString() + "으로 폰트 사이즈 변경하였습니다.");
			}
		});
	}
}