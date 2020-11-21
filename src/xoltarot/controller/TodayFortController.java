package xoltarot.controller;

import java.io.IOException;
import xoltarot.model.Deck;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class TodayFortController {
	@FXML
	private AnchorPane mainPane2;
	
	private Deck TarotCards = new Deck(); 
	private String topic;
	//takes the user from the Today's Fortune window to the main menu
	@FXML
	void Home(ActionEvent event) throws IOException {
		mainPane2 = FXMLLoader.load(getClass().getResource("/xoltarot/view/Main.fxml"));
		Scene scene = new Scene(mainPane2);
		Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
		window.setScene(scene);
		window.show();
	}
	//when the save button is pressed it should save the displayed fortune
	//for now it alerts the user that their fortune is being saved
	@FXML
	private void saveFort(ActionEvent event){
		Alert alert = new Alert(AlertType.CONFIRMATION);
		alert.setContentText("Your fortune is being saved");
		alert.showAndWait();
	}
	
	public void setPassedValue(String t) {
		topic = t; 
	}
	//When the generate my fortune button is pressed, three "cards" should be displayed
	//for now it alerts the user that their fortune is being generated
	@FXML
	private void genFort(ActionEvent event){
		Alert alert = new Alert(AlertType.CONFIRMATION);
		alert.setContentText("Your fortune is being generated");
		alert.showAndWait();
	}
}
