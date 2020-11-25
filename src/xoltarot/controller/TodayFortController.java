package xoltarot.controller;

import java.io.IOException;
import java.util.HashMap;
import java.util.Optional;

import xoltarot.model.Card;
import xoltarot.model.Deck;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.TextInputDialog;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class TodayFortController {
	@FXML
	private AnchorPane mainPane2;

	@FXML
	private Button draw;
	@FXML
	private HBox dealerCards;
	@FXML
	private Button past;
	@FXML
	private Button present;
	@FXML
	private Button future;
	@FXML
	private Image i0;
	@FXML
	private Image i1;
	@FXML
	private Image i2;
	@FXML
	private Image i3;
	@FXML
	private ImageView image0;
	@FXML
	private ImageView image1;
	@FXML
	private ImageView image2;
	@FXML
	private ImageView image3;
	@FXML
	private TextArea description;

	private String topic; // not yet implemented, to be used in file output

	private Card cardOne;
	private Card cardTwo;
	private Card cardThree;
	private HashMap<String, Integer> fortune = new HashMap<>();

	// takes the user from the Today's Fortune window to the main menu
	@FXML
	void Home(ActionEvent event) throws IOException {
		mainPane2 = FXMLLoader.load(getClass().getResource("/xoltarot/view/Main.fxml"));
		Scene scene = new Scene(mainPane2);
		Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
		window.setScene(scene);
		window.show();
	}

	// when the save button is pressed it should save the displayed fortune
	// for now it alerts the user that their fortune is being saved
	@FXML
	private void saveFort(ActionEvent event) {

		Alert alert = new Alert(AlertType.CONFIRMATION);
		alert.setContentText("Your fortune is being saved");
		alert.showAndWait();

		/**
		 * TO-DO: take the 'fortune' information and the topic then write it to a file.
		 */
	}

	/**
	 * Stores the initial inquiry after requesting a fortune. Proceeds to generate
	 * the first fortune.
	 * 
	 * @param t The topic of the inquiry.
	 */
	public void setPassedValue(String topic) {

		this.topic = topic;

		Deck deck = new Deck();
		deck.shuffleCards();

		// Saves the names of the cards.
		cardOne = deck.getCard(0);
		cardTwo = deck.getCard(1);
		cardThree = deck.getCard(2);

		// Puts the card in the array
		fortune.put("Past", cardOne.getNum());
		fortune.put("Present", cardTwo.getNum());
		fortune.put("Future", cardThree.getNum());

		// Loads the image, resizes it, keeps the proportions, among others things.
		i0 = new Image(getClass().getResourceAsStream("/xoltarot/images/deck.jpg"), 150, 220, true, true);
		i1 = new Image(
				getClass().getResourceAsStream("/xoltarot/images/".concat(String.valueOf(cardOne.getNum()) + ".jpg")),
				150, 220, true, true);
		i2 = new Image(
				getClass().getResourceAsStream("/xoltarot/images/".concat(String.valueOf(cardTwo.getNum()) + ".jpg")),
				150, 220, true, true);
		i3 = new Image(
				getClass().getResourceAsStream("/xoltarot/images/".concat(String.valueOf(cardThree.getNum()) + ".jpg")),
				150, 220, true, true);

		// Create a new ImageView with the image of the card.
		image0 = new ImageView(i0);
		image1 = new ImageView(i1);
		image2 = new ImageView(i2);
		image3 = new ImageView(i3);

		// Set the graphics for each button.
		draw.setGraphic(image0);
		past.setGraphic(image1);
		present.setGraphic(image2);
		future.setGraphic(image3);

		// Disables buttons to help guide the user.
		draw.setDisable(true);
		description.setWrapText(true);
		description.setText("The card description will be shown here once selected.");

	}

	/**
	 * Allows the user to generate a new fortune after the initial fortune is given.
	 * Prompts the user for a new inquiry and disables the card buttons.
	 * 
	 * @param event The click of the 'New fortune' button.
	 */
	@FXML
	private void newFort(ActionEvent event) {

		description.clear();

		TextInputDialog dialog = new TextInputDialog("Love, Finance, Career, etc.");
		dialog.setTitle("Today's Fortune");
		dialog.setHeaderText("What is your inquiry?");
		dialog.setContentText("Please enter one topic:");

		Optional<String> topic = dialog.showAndWait();
		if (topic.isPresent()) {
			System.out.println("Your topic: " + topic.get());
		} else
			return;

		this.topic = topic.get();

		// Disables the deck.
		draw.setDisable(false);

		// Enables the cards for selection.
		past.setDisable(true);
		present.setDisable(true);
		future.setDisable(true);

		description.setText("Click the deck to draw your new fortune");

	}

	/**
	 * Displays a new fortune after the deck button is clicked.
	 * 
	 * @param event The click of the deck button.
	 */
	@FXML
	private void genFort(ActionEvent event) {
		
		image1.setImage(null);
		image2.setImage(null);
		image3.setImage(null);
		
		// Clears and sets new text in the TextArea.
		description.clear();
		description.setText("The card description will be shown here once selected.");
		
		// Removes the image/name.

		// Create new deck and shuffle.
		Deck deck = new Deck();
		deck.shuffleCards();

		// Saves the names of the cards.
		cardOne = deck.getCard(0);
		cardTwo = deck.getCard(1);
		cardThree = deck.getCard(2);

		// Sets the text of the Cards.
		fortune.put("Past", cardOne.getNum());
		fortune.put("Present", cardTwo.getNum());
		fortune.put("Future", cardThree.getNum());

		// Loads the image, resizes it, keeps the proportions, among others things.
		i1 = new Image(
				getClass().getResourceAsStream("/xoltarot/images/".concat(String.valueOf(cardOne.getNum()) + ".jpg")),
				150, 220, true, true);
		i2 = new Image(
				getClass().getResourceAsStream("/xoltarot/images/".concat(String.valueOf(cardTwo.getNum()) + ".jpg")),
				150, 220, true, true);
		i3 = new Image(
				getClass().getResourceAsStream("/xoltarot/images/".concat(String.valueOf(cardThree.getNum()) + ".jpg")),
				150, 220, true, true);

		// Create a new ImageView with the image of the card.
		image1 = new ImageView(i1);
		image2 = new ImageView(i2);
		image3 = new ImageView(i3);

		// Set the graphics for each button.
		past.setGraphic(image1);
		present.setGraphic(image2);
		future.setGraphic(image3);

		// Disables the deck button.
		draw.setDisable(true);
		past.setDisable(false);
		present.setDisable(false);
		future.setDisable(false);
	}

	/**
	 * Sets the TextArea to the description of the past card when clicked.
	 * 
	 * @param event The click of the button.
	 */
	@FXML
	private void showPastDescription(ActionEvent event) {
		description.setWrapText(true);
		description.setText(cardOne.getDescription());
	}

	/**
	 * Sets the TextArea to the description of the present card when clicked.
	 * 
	 * @param event The click of the button.
	 */
	@FXML
	private void showPresentDescription(ActionEvent event) {
		description.setWrapText(true);
		description.setText(cardTwo.getDescription());
	}

	/**
	 * Sets the TextArea to the description of the future card when clicked.
	 * 
	 * @param event The click of the button.
	 */
	@FXML
	private void showFutureDescription(ActionEvent event) {
		description.setWrapText(true);
		description.setText(cardThree.getDescription());
	}
}
