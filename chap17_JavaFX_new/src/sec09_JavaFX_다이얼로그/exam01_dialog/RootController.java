package sec09_JavaFX_다이얼로그.exam01_dialog;

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
	//컨트롤러에서 primaryStage를 사용하는 방법
		//1 
		/*
		 * @FXML private HBox hbox;
		 * 
		 * @Override public void initialize(URL arg0, ResourceBundle arg1) {
		 * 
		 * }
		 */
		//2 메소드를 통해 AppMain클래스에서 Controller 객체로 전달받기
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
			//방법1로 실행시,
			//File selectedFile = fileChooser.showOpenDialog(hbox.getScene().getWindow());
				//주 윈도우를 매개값으로 주어야 한다.
				//참조를 얻는 방법, main클래스에서 얻는 방법, controller로 얻는 방법의 2가지가 있다.
				//Scene객체가 생성되었다면, 컨트롤객체에 getScene().getWindow()메소드를 호출하여 primaryStage를 불러올 수 있다.
			//방법2로 실행시,
			File selectedFile = fileChooser.showOpenDialog(primaryStage);
		if(selectedFile != null) {
			System.out.println("불러온 파일: " + selectedFile.getPath());
		}
	}
	public void handleSaveFileChooser(ActionEvent e) {
		FileChooser fileChooser = new FileChooser();
		fileChooser.getExtensionFilters().addAll( new ExtensionFilter("All Files","*.*"));
		File selectedFile = fileChooser.showSaveDialog(primaryStage);
		if(selectedFile != null) {
			System.out.println("저장할 파일: " + selectedFile.getPath());
		}
	}
	public void handleDirectoryChooser(ActionEvent e) {
		DirectoryChooser directoryChooser = new DirectoryChooser();
		File selectedDir = directoryChooser.showDialog(primaryStage);
		if(selectedDir != null) {
			System.out.println("선택된 폴더: " + selectedDir.getPath());
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