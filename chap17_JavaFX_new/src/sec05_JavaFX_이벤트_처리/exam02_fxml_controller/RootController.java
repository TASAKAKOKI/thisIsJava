package sec05_JavaFX_�̺�Ʈ_ó��.exam02_fxml_controller;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;

public class RootController implements Initializable{
	//1. fxml���Ͽ��� fx:id�� �� ���� @FXML������̼��� �ٿ��� �ʵ尪���� �����μ�, fxml���Ͽ� ����� Button ��ü�� �����Ѵ�.
		@FXML private Button btn1;
		@FXML private Button btn2;
		//@FXML private Button btn3; //btn3�� fxml�±׿��� �ۼ��Ͽ��� ������ �� �ڵ尡 �ʿ����.
	
	@Override
	public void initialize(URL location, ResourceBundle bundle) {
		//�ʵ忡�� �̹� fxml������ Control�� �����ϱ� ������, 
		//initializa()���� �����ϰ� �� �ʵ庯������ ����� �� �ִ�.
			//btn1�� �͸�����ü�� �����Ͽ� �̺�Ʈ ó�� 
			btn1.setOnAction( new EventHandler<ActionEvent>() {
				@Override
				public void handle(ActionEvent event) {
					handleBtn1Action(event);
				}
			});
			
			//btn2�� ���ٽ����� �̺�Ʈ ó��
			btn2.setOnAction( event -> handleBtn2Action(event));
	}
	public void handleBtn1Action(ActionEvent event) {
		System.out.println("��ư1 Ŭ��");
	}
	public void handleBtn2Action(ActionEvent event) {
		System.out.println("��ư2 Ŭ��");
	}
	//btn3�� fxml �±׿��� �̺�Ʈó���޼ҵ� �ۼ�
	public void handleBtn3Action(ActionEvent event) {
		System.out.println("��ư3 Ŭ��");
	}
}
