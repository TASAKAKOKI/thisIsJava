package sec02_JavaFX_���ø����̼�_���߽���.exam01_application_start;

import javafx.application.Application;
import javafx.stage.Stage;

public class AppMain extends Application{

	//�θ�Ŭ���� Application�� �߻�Ŭ�����̹Ƿ�, �߻�޼ҵ��� start()�� �ݵ�� ���������־�� �Ѵ�.
	@Override
	public void start(Stage primaryStage) throws Exception {
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);	//AppMain ��ü ���� �� ���� ������ ����
	}
}