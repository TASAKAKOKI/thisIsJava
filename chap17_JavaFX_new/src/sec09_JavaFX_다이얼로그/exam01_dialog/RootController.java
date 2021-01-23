package sec09_JavaFX_���̾�α�.exam01_dialog;

import java.io.File;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.stage.DirectoryChooser;
import javafx.stage.FileChooser;
import javafx.stage.FileChooser.ExtensionFilter;
import javafx.stage.Popup;
import javafx.stage.Stage;

public class RootController implements Initializable{
	//��Ʈ�ѷ����� primaryStage�� ����ϴ� ���
		//1 
		/*
		 * @FXML private HBox hbox;
		 * 
		 * @Override public void initialize(URL arg0, ResourceBundle arg1) {
		 * 
		 * }
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
		popup.getContent().add(parent);
	}
	public void handleCustom(ActionEvent e) {
		
	}
}