package sec09_JavaFX_���̾�α�.exam01_dialog;

import java.io.File;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.DirectoryChooser;
import javafx.stage.FileChooser;
import javafx.stage.FileChooser.ExtensionFilter;
import javafx.stage.Modality;
import javafx.stage.Popup;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class RootController implements Initializable{
	//��Ʈ�ѷ����� primaryStage�� ����ϴ� ���
		//1 
		/*
		 * @FXML private HBox hbox;
		 */
		//2 �޼ҵ带 ���� AppMainŬ�������� Controller ��ü�� ���޹ޱ�
		private Stage primaryStage;
		public void setPrimaryStage(Stage primaryStage) {
			this.primaryStage = primaryStage;
		}
		
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		
	}

	
	
	public void handleOpenFileChooser(ActionEvent e) {
		FileChooser fileChooser = new FileChooser();
		fileChooser.getExtensionFilters().addAll(
			new ExtensionFilter("Text Files", "*.txt"),
			new ExtensionFilter("Image Files", "*.jpg","*.png","*.gif"),
			new ExtensionFilter("Audio Files", "*.wav","*.mp3","*.aac"),
			new ExtensionFilter("All Files", "*.*")
		);
			//���1�� �����,
			//File selectedFile = fileChooser.showOpenDialog(hbox.getScene().getWindow());
				//�� �����츦 �Ű������� �־�� �Ѵ�.
				//������ ��� ���, mainŬ�������� ��� ���, controller�� ��� ����� 2������ �ִ�.
				//Scene��ü�� �����Ǿ��ٸ�, ��Ʈ�Ѱ�ü�� getScene().getWindow()�޼ҵ带 ȣ���Ͽ� primaryStage�� �ҷ��� �� �ִ�.
			//���2�� �����,
			File selectedFile = fileChooser.showOpenDialog(primaryStage);
		if(selectedFile != null) {
			System.out.println("�ҷ��� ����: " + selectedFile.getPath());
		}
	}
	public void handleSaveFileChooser(ActionEvent e) {
		FileChooser fileChooser = new FileChooser();
		fileChooser.getExtensionFilters().addAll( new ExtensionFilter("All Files","*.*"));
		File selectedFile = fileChooser.showSaveDialog(primaryStage);
		if(selectedFile != null) {
			System.out.println("������ ����: " + selectedFile.getPath());
		}
	}
	public void handleDirectoryChooser(ActionEvent e) {
		DirectoryChooser directoryChooser = new DirectoryChooser();
		File selectedDir = directoryChooser.showDialog(primaryStage);
		if(selectedDir != null) {
			System.out.println("���õ� ����: " + selectedDir.getPath());
		}
	}
	
	public void handlePopup(ActionEvent e) throws Exception{
		Popup popup = new Popup();
		
		Parent parent = FXMLLoader.load(getClass().getResource("popup.fxml"));
		ImageView imageView = (ImageView) parent.lookup("#imgMessage");
		//@FXML�� �ƴ� �ٸ� ������� ��Ʈ�� ��ü�� ������ ��.
		//��Ʈ�ѷ��� ������ �Ǿ� �ִ� fxml������ �±׿� id="��"�� �о���� �ȴ�.
		imageView.setImage(new Image(getClass().getResource("images/info.png").toString()));
		imageView.setOnMouseClicked( event -> popup.hide());
		
		Label lblMessage = (Label) parent.lookup("#lblMessage");
		lblMessage.setText("�޼����� �Խ��ϴ�.");
		
		popup.getContent().add(parent);
		popup.setAutoHide(true);
		popup.show(primaryStage);
	}
	
	public void handleCustom(ActionEvent e) throws Exception{
		Stage dialog = new Stage(StageStyle.UTILITY);
		dialog.initModality(Modality.WINDOW_MODAL);
		dialog.initOwner(primaryStage);
		dialog.setTitle("Ȯ��_Ŀ���Ҵ��̾�α�");
		
		Parent parent = FXMLLoader.load(getClass().getResource("custom_dialog.fxml"));
		Label txtTitle = (Label) parent.lookup("#txtTitle"); //����Ÿ���� NodeŸ���̹Ƿ�, ����Ÿ�Ժ�ȯ �ʿ�
		txtTitle.setText("Ȯ���ϼ̽��ϴ�.");
		Button btnOk = (Button) parent.lookup("#btnOk");
		btnOk.setOnAction( event -> dialog.close());

		Scene scene = new Scene(parent);
		
		dialog.setScene(scene);
		dialog.setResizable(false);
		dialog.show();
	}
}