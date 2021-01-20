package sec07_JavaFX_컨트롤.exam01_button;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.application.Platform;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Toggle;
import javafx.scene.control.ToggleGroup;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class RootController implements Initializable{
	@FXML private CheckBox chk1;
	@FXML private CheckBox chk2;		
	@FXML private ImageView chkImgView;
	@FXML private ToggleGroup tgGroup;
	@FXML private ImageView chkChartView;
	
	@Override
	public void initialize(URL location, ResourceBundle resource) {
		tgGroup.selectedToggleProperty().addListener( new ChangeListener<Toggle>() {
			@Override
			public void changed(ObservableValue<? extends Toggle> observable, Toggle oldToggle, Toggle newToggle) {
				Image img = new Image(getClass().getResource("images/" + newToggle.getUserData().toString() + ".png").toString());
				chkChartView.setImage(img);
			}
		});
	}
	
	public void handleBtnExitAction(ActionEvent event) {
		//윈도우 창을 는 방법
		Platform.exit();
		System.exit(0);
		System.out.println("종료 버튼 클릭");
	}
	
	public void handleChkAction(ActionEvent event) {
		if(chk1.isSelected() && chk2.isSelected()) {
			chkImgView.setImage(new Image(getClass().getResource("images/woman_with_hat_glasses.png").toString()));
		} else if(chk1.isSelected()) {
			chkImgView.setImage(new Image(getClass().getResource("images/woman_with_glasses.png").toString()));
		} else if(chk2.isSelected()) {
			chkImgView.setImage(new Image(getClass().getResource("images/woman_with_hat.png").toString()));
		} else {
			chkImgView.setImage(new Image(getClass().getResource("images/woman.jpg").toString()));
		}
	}
}