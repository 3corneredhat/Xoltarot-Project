package xoltarot.controller;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import java.util.Optional;
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
import javafx.stage.Stage;
import xoltarot.model.Card;
import xoltarot.model.Deck;

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

	private String topic;

	private Card cardOne;
	private Card cardTwo;
	private Card cardThree;

	/**
	 * Home returns the user to the main stage. 
	 * @param event The click of the 'Home' button.
	 * @throws IOException
	 */
	@FXML
	void Home(ActionEvent event) throws IOException {
		mainPane2 = FXMLLoader.load(getClass().getResource("/xoltarot/view/Main.fxml"));
		Scene scene = new Scene(mainPane2);
		Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
		window.setScene(scene);
		window.show();
	}

	/**
	 * This method saves the topic of the inquiry and the generated fortune.
	 * 
	 * @param event The click of the 'Save Fortune' button.
	 */
	@FXML
	private void saveFort(ActionEvent event) throws IOException {
		
		/**
		 *  makes new text file that contains "topic"/inquiry and the three card
		 *  generated called "PastFortunes.txt"
		 */
		FileWriter outfile = new FileWriter("PastFortunes.txt", true);
		
		/**
		 *  writes the date of which the fortune was saved, the inquiry of "topic" and
		 *  the names of the three cards generated
		 */
		PrintWriter data = new PrintWriter(outfile);
		Date date = new Date();
		data.write(date.toString() + "\r\nTopic: " + topic + " \r\n");
		data.write("Past: " + cardOne.getName() + ", Present: "+ cardTwo.getName() 
		+ ", Future: " + cardThree.getName() + " " + "\r\n");
		data.close();
		
		// Alerts user that the fortune data is being saved
		Alert alert = new Alert(AlertType.INFORMATION);
		alert.setContentText("Your fortune has been saved.");
		alert.showAndWait();
	}

	/**
	 * Stores the initial inquiry after requesting a fortune. Proceeds to generate
	 * the first fortune.
	 * 
	 * @param topic The topic of the inquiry.
	 */
	public void setPassedValue(String topic) {

		this.topic = topic;

		Deck deck = new Deck();
		deck.shuffleCards();

		// Saves the names of the cards.
		cardOne = deck.getCard(0);
		cardTwo = deck.getCard(1);
		cardThree = deck.getCard(2);

		// Loads the image, resizes it, keeps the proportions, among others things.
		i0 = new Image(getClass().getResourceAsStream("/xoltarot/images/deck.png"), 150, 220, true, true); // image for
																											// the deck.

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

		// Create new deck and shuffle.
		Deck deck = new Deck();
		deck.shuffleCards();

		// Saves the names of the cards.
		cardOne = deck.getCard(0);
		cardTwo = deck.getCard(1);
		cardThree = deck.getCard(2);

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
