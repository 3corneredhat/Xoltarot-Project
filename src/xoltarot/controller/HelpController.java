package xoltarot.controller;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class HelpController {
	@FXML
	private AnchorPane mainPane5;
	
	@FXML
    private Button home;
	/**
	 * 'Home' is the functions that loads the primary stage and scene. 
	 * @param event The 'Home' button click. 
	 * @throws IOException
	 */
	@FXML
	void Home(ActionEvent event) throws IOException {
		mainPane5 = FXMLLoader.load(getClass().getResource("/xoltarot/view/Main.FXML"));
		Scene scene = new Scene(mainPane5);
		Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
		window.setScene(scene);
		window.show();
	}
}
