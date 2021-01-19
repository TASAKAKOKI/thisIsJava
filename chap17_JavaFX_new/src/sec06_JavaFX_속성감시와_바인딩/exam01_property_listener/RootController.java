package sec06_JavaFX_�Ӽ����ÿ�_���ε�.exam01_property_listener;

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
				System.out.println("�����̵带 ������ " + oldNumber.toString() + "���� " + newNumber.toString() + "���� ��Ʈ ������ �����Ͽ����ϴ�.");
			}
		});
	}
}