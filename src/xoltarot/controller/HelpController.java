package xoltarot.controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TextArea;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import xoltarot.model.Help;

public class HelpController implements Initializable {
	@FXML
	private AnchorPane mainPane5;

	@FXML
	private Button home;

	@FXML
	private ListView<String> helpList;

	@FXML
	private TextArea description;

	private Help help = new Help();

	/***
	 * Initializes the ListView.
	 */
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// Creating "cardList" as reference for full deck of cards.
		helpList.getItems().add("Today's Fortune");
		helpList.getItems().add("Card Search");
		helpList.getItems().add("Past Fortunes");

	}
	
	/**
	 * Handles the mouse click of an item in the ListView: loads the
	 * associated description.
	 * 
	 * @param event The click of the mouse. 
	 */
	public void handleMouseClick(MouseEvent event) {

		int selection = helpList.getSelectionModel().getSelectedIndex();
		description.setWrapText(true);

		if (selection == 0) {
			description.setText(help.getDescription(selection));
		}
		if (selection == 1) {
			description.setText(help.getDescription(selection));
		}
		if (selection == 2) {
			description.setText(help.getDescription(selection));
		}
	}

	/**
	 * 'Home' is the functions that loads the primary stage and scene.
	 * 
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
