package xoltarot.controller;

import java.io.IOException;
import java.util.Optional;
import xoltarot.controller.TodayFortController;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextInputDialog;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class MainController {
	@FXML
	private AnchorPane mainPane;
	@FXML
	public Button exitButton;

	/**
	 * 'TodayFort' is the function that prompts the user for an inquiry and then calls the 
	 * Today's Fortune FXML file to set up the stage. 
	 * @param event
	 * @throws IOException
	 */
	@FXML
	public void TodayFort(ActionEvent event) throws IOException {
		TextInputDialog dialog = new TextInputDialog("Love");
		dialog.setTitle("Today's Fortune");
		dialog.setHeaderText("What is your inquiry?");
		dialog.setContentText("Please enter a topic:");

		// Traditional way to get the response value.
		Optional<String> topic = dialog.showAndWait();
		if (topic.isPresent()){
		    System.out.println("Your topic: " + topic.get());
		    TodayFortController.setPassedValue(topic.get());
		}
		else
			return;
		
		mainPane = FXMLLoader.load(getClass().getResource("/xoltarot/view/TodayFort.fxml"));
		Scene scene = new Scene(mainPane);
		Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
		window.setScene(scene);
		window.show();
	}

	// takes user to "Card Search" window
	@FXML
	public void CardSearch(ActionEvent event) throws IOException {
		mainPane = FXMLLoader.load(getClass().getResource("/xoltarot/view/CardSearch.fxml"));
		Scene scene = new Scene(mainPane);
		Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
		window.setScene(scene);
		window.show();
	}

	// takes user to "My Notes" window
	@FXML
	public void MyNotes(ActionEvent event) throws IOException {
		mainPane = FXMLLoader.load(getClass().getResource("/xoltarot/view/MyNotes.fxml"));
		Scene scene = new Scene(mainPane);
		Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
		window.setScene(scene);
		window.show();
	}

	/**
	 * 'Help' is the function that loads the stage and scene for the help window.
	 * 
	 * @param event The 'Help' button click.
	 * @throws IOException
	 */
	@FXML
	public void Help(ActionEvent event) throws IOException {
		mainPane = FXMLLoader.load(getClass().getResource("/xoltarot/view/Help.fxml"));
		Scene scene = new Scene(mainPane);
		Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
		window.setScene(scene);
		window.show();
	}

	// exits application
	@FXML
	public void handleExitButtonAction(ActionEvent event) {
		Stage stage = (Stage) exitButton.getScene().getWindow();
		stage.close();
	}
}
