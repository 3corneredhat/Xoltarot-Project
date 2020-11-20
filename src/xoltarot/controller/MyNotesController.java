package xoltarot.controller;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class MyNotesController {
	@FXML
	private AnchorPane mainPane4;
	//takes the user from the My notes window to the main menu
	@FXML
	void Home(ActionEvent event) throws IOException {
		mainPane4 = FXMLLoader.load(getClass().getResource("/xoltarot/view/Main.fxml"));
		Scene scene = new Scene(mainPane4);
		Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
		window.setScene(scene);
		window.show();
	}
}
