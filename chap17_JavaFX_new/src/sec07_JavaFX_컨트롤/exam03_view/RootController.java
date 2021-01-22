package sec07_JavaFX_��Ʈ��.exam03_view;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.application.Platform;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ListView;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class RootController implements Initializable{
	@FXML private ListView<String> listView;
	@FXML private TableView<Phone> tableView;
	@FXML private ImageView	imageView;
	
	@Override
	public void initialize(URL location, ResourceBundle resource) {
		listView.setItems(FXCollections.observableArrayList(
				"������ S1","������ S2","������ S3","������ S4","������ S5","������ S6","������ S7"
		));
		
		listView.getSelectionModel().selectedIndexProperty().addListener(
			new ChangeListener<Number>() {
				@Override
				public void changed(ObservableValue<? extends Number> observable,
									Number oldValue, Number newValue) {
					tableView.getSelectionModel().select(newValue.intValue());
					tableView.scrollTo(newValue.intValue());
				}
			}
		);
		
		ObservableList phoneList = FXCollections.observableArrayList(
				new Phone("������ S1", "galaxy01.jpg"),
				new Phone("������ S2", "galaxy02.jpg"),
				new Phone("������ S3", "galaxy03.jpg"),
				new Phone("������ S4", "galaxy04.jpg"),
				new Phone("������ S5", "galaxy05.jpg"),
				new Phone("������ S6", "galaxy06.jpg"),
				new Phone("������ S7", "galaxy07.jpg")
		);
		
		TableColumn tcSmartPhone = tableView.getColumns().get(0);
		tcSmartPhone.setCellValueFactory(new PropertyValueFactory("smartPhone"));
		tcSmartPhone.setStyle("-fx-alignment: CENTER;");

		TableColumn tcImage = tableView.getColumns().get(1);
		tcImage.setCellValueFactory(new PropertyValueFactory("image"));
		tcImage.setStyle("-fx-alignment: CENTER; ");
		
		tableView.setItems(phoneList);
		
		/*
		tableView.getSelectionModel().selectedIndexProperty().addListener(
			new ChangeListener<Number>() {
				@Override
				public void changed(ObservableValue<? extends Number> arg0, Number arg1, Number arg2) {
					if(arg2 != null) {
						System.out.println(arg2.intValue());
//						imageView.setImage(new Image(getClass().getResource("images/galaxy0" + (arg2.intValue()+1) + ".png").toString()));
					}
				}
			}
		);
		*/
		
		tableView.getSelectionModel().selectedItemProperty().addListener(
			new ChangeListener<Phone>() {
				@Override
				public void changed(ObservableValue<? extends Phone> arg0, Phone arg1, Phone arg2) {
					if(arg2 != null) {
						imageView.setImage(new Image(getClass().getResource("images/" + arg2.getImage()).toString()));
					}
				}
			}
		);
		tableView.getSelectionModel().selectedIndexProperty().addListener(
			new ChangeListener<Number>() {
				@Override
				public void changed(ObservableValue<? extends Number> arg0, Number arg1, Number arg2) {
					listView.getSelectionModel().select(arg2.intValue());
					listView.scrollTo(arg2.intValue());
				}
			}
		);
	}
	
	public void handleBtnOkAction(ActionEvent e) {
		String item = listView.getSelectionModel().getSelectedItem();
		if(item != null) {
			System.out.println("ListView ����Ʈ��: " + item);

			Phone phone = tableView.getSelectionModel().getSelectedItem();
			System.out.println("TableView ����Ʈ��: " + phone.getSmartPhone());
			System.out.println("TableView �̹���: " + phone.getImage());
		} else {
			System.out.println("���ϴ� ���� ������ �ֽʽÿ�");
		}
	}
	public void handleBtnCancelAction(ActionEvent e) {
		Platform.exit();
	}
}