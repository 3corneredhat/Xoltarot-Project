package xoltarot.controller;

import java.io.IOException;
import java.net.URL;
import java.util.Optional;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextInputDialog;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class MainController implements Initializable {
	@FXML
	private AnchorPane mainPane;
	@FXML
	public Button exitButton;

	/**
	 * 'TodayFort' is the function that prompts the user for an inquiry and then
	 * calls the Today's Fortune FXML file to set up the stage.
	 * 
	 * @param event
	 * @throws IOException
	 */
	@FXML
	public void TodayFort(ActionEvent event) throws IOException {
		TextInputDialog dialog = new TextInputDialog("Love, Finance, Career, etc.");
		dialog.setTitle("Today's Fortune");
		dialog.setHeaderText("What is your inquiry?");
		dialog.setContentText("Please enter one topic:");

		Optional<String> topic = dialog.showAndWait();

		// Checks to see if the 'OK' or 'Cancel' button was pressed.
		if (topic.isPresent()) {

		} else
			return;
		// Checks the topic to see if it is a valid input.
		if (topic.toString().contains(",") || topic.toString().contains(" ")){
			Alert alert = new Alert(AlertType.INFORMATION);
			alert.setContentText("Please make sure your topic is a single word.");
			alert.showAndWait();
			return;
		}
		FXMLLoader loader = new FXMLLoader(getClass().getResource("/xoltarot/view/TodayFort.fxml"));
		mainPane = loader.load();
		// Loads the Today's Fortune Controller in order to use the setPassedValue function.
		TodayFortController fortune = loader.getController();
		fortune.setPassedValue(topic.get());
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

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub

	}
}
