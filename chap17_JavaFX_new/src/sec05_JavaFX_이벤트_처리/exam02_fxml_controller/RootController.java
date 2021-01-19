package sec05_JavaFX_이벤트_처리.exam02_fxml_controller;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;

public class RootController implements Initializable{
	//1. fxml파일에서 fx:id로 준 값을 @FXML어노테이션을 붙여서 필드값으로 줌으로서, fxml파일에 선언된 Button 객체를 참조한다.
		@FXML private Button btn1;
		@FXML private Button btn2;
		//@FXML private Button btn3; //btn3은 fxml태그에서 작성하였기 때문에 이 코드가 필요없다.
	
	@Override
	public void initialize(URL location, ResourceBundle bundle) {
		//필드에서 이미 fxml파일의 Control을 참조하기 때문에, 
		//initializa()에서 안전하게 각 필드변수들을 사용할 수 있다.
			//btn1에 익명구현객체를 전달하여 이벤트 처리 
			btn1.setOnAction( new EventHandler<ActionEvent>() {
				@Override
				public void handle(ActionEvent event) {
					handleBtn1Action(event);
				}
			});
			
			//btn2에 람다식으로 이벤트 처리
			btn2.setOnAction( event -> handleBtn2Action(event));
	}
	public void handleBtn1Action(ActionEvent event) {
		System.out.println("버튼1 클릭");
	}
	public void handleBtn2Action(ActionEvent event) {
		System.out.println("버튼2 클릭");
	}
	//btn3은 fxml 태그에서 이벤트처리메소드 작성
	public void handleBtn3Action(ActionEvent event) {
		System.out.println("버튼3 클릭");
	}
}
