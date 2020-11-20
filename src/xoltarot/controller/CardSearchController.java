package xoltarot.controller;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class CardSearchController {
	@FXML
	private AnchorPane mainPane3;
	//takes the user from the card search window to the main menu
	@FXML
	void Home(ActionEvent event) throws IOException {
		mainPane3 = FXMLLoader.load(getClass().getResource("/xoltarot/view/Main.FXML"));
		Scene scene = new Scene(mainPane3);
		Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
		window.setScene(scene);
		window.show();
	}
}
