package sec03_JavaFX_���̾ƿ�.exam01_programmatical_layout;

import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class AppMain extends Application{
	@Override
	public void start(Stage primaryStage) throws Exception {
		HBox hbox = new HBox();							//Parent�� ���� Ŭ������ HBox() �����̳� ����
		hbox.setPadding( new Insets(10,10,10,10));		//���� ���� ����(Padding)
		hbox.setSpacing(10);							//��Ʈ�Ѱ��� ���� ���� ����
		
		TextField textField = new TextField();			//TextField ��Ʈ�� ����
		textField.setPrefWidth(200);					//TextField�� �� ����
		
		Button button = new Button();					//Button ��Ʈ�� ����
		button.setText("Ȯ�ι�ư"); 						//Button�� ���� ����
		
		ObservableList list = hbox.getChildren();		//HBox�� ObservableList ���
		list.add(textField); list.add(button);			//TextField�� Button ��Ʈ�� ��ġ
		
		Scene scene = new Scene(hbox);					//Parent�� ����Ŭ������ HBox�� ��Ʈ �����̳ʷν�(�Ű���)���� ����
		
		primaryStage.setTitle("AppMainŸ��Ʋ");			//������ â ���� ����
		primaryStage.setScene(scene);					//������ â�� ȭ�� ����
		primaryStage.show();							//������ â �����ֱ�
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
