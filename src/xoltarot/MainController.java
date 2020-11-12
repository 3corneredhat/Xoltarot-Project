package xoltarot;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class MainController {
	@FXML
	private AnchorPane mainPane;	
	@FXML
	public Button exitButton;
	//takes user to the "TodayForturne" window
	@FXML
	public void TodayFort(ActionEvent event) throws IOException {
		mainPane = FXMLLoader.load(getClass().getResource("TodayFort.fxml"));															
		Scene scene = new Scene(mainPane);
		Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
		window.setScene(scene);
		window.show();
	}
	//takes user to "Card Search" window
	@FXML
	public void CardSearch(ActionEvent event) throws IOException {
		mainPane = FXMLLoader.load(getClass().getResource("CardSearch.fxml"));															
		Scene scene = new Scene(mainPane);
		Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
		window.setScene(scene);
		window.show();
	}
	//takes user to "My Notes" window
	@FXML
	public void MyNotes(ActionEvent event) throws IOException {
		mainPane = FXMLLoader.load(getClass().getResource("MyNotes.fxml"));															
		Scene scene = new Scene(mainPane);
		Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
		window.setScene(scene);
		window.show();
	}
	//exits application
	@FXML
	public void handleExitButtonAction(ActionEvent event) {
	    Stage stage = (Stage) exitButton.getScene().getWindow();
	    stage.close();
	}
}
