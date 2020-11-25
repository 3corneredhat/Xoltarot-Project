package xoltarot.controller;

import java.io.IOException;
import java.util.HashMap;
import java.util.Optional;

import xoltarot.model.Deck;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.TextInputDialog;
import javafx.scene.control.Alert.AlertType;
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
	private HBox dealerCards; 
	@FXML 
	private Rectangle rec1;
	@FXML 
	private Rectangle rec2;
	@FXML 
	private Rectangle rec3;
	@FXML
	private StackPane past; 
	@FXML
	private StackPane present; 
	@FXML
	private StackPane future; 
	/**
	 * The following Text objects are place holders and were intended to test
	 * the development of the functionality. 
	 */
	@FXML
	private Text pa; //past
	@FXML
	private Text pe; //present
	@FXML
	private Text fu; //future
	
	private String topic; //not yet implemented
	
	private String cardOne;
	private String cardTwo;
	private String cardThree;
	private HashMap<String, Integer> fortune = new HashMap<>();
	
	
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
		
		/**
		 * TO-DO: take the 'fortune' information and the topic then 
		 * write it to a file. 
		 */
	}
	
	/**
	 * Stores the initial inquiry after requesting a fortune. 
	 * Proceeds to generate the first fortune.
	 * @param t The topic of the inquiry.
	 */
	public void setPassedValue(String topic) {
		
		this.topic = topic; 
		
		Deck deck = new Deck();
		deck.shuffleCards();
		
		cardOne = deck.getCardName(0);
		cardTwo = deck.getCardName(1);
		cardThree = deck.getCardName(2);
		
		fortune.put("Past", deck.getCardNum(0));
		fortune.put("Present", deck.getCardNum(1));
		fortune.put("Future", deck.getCardNum(2));
		
		pa = new Text(cardOne); 
		pe = new Text(cardTwo); 
		fu = new Text(cardThree); 
		
		past.getChildren().addAll(pa);
		present.getChildren().addAll(pe);
		future.getChildren().addAll(fu);
		
		
	}
	/**
	 * Allows the user to generate a new fortune after the initial fortune is given. 
	 * Prompts the user for a new inquiry, clears the cards, and generates a new 
	 * fortune. 
	 * @param event The click of the 'Generate fortune' button. 
	 */
	@FXML
	private void genFort(ActionEvent event){

		
		TextInputDialog dialog = new TextInputDialog("Love, Finance, Career, etc.");
		dialog.setTitle("Today's Fortune");
		dialog.setHeaderText("What is your inquiry?");
		dialog.setContentText("Please enter one topic:");

		Optional<String> topic = dialog.showAndWait();
		if (topic.isPresent()){
		    System.out.println("Your topic: " + topic.get());
		}
		else
			return;
		
		this.topic = topic.get();
		
		//Removes the image/name
		past.getChildren().remove(pa);
		present.getChildren().remove(pe);
		future.getChildren().remove(fu);
		
		//
		Deck deck = new Deck();
		deck.shuffleCards();
		
		//Saves the names of the cards.
		cardOne = deck.getCardName(0);
		cardTwo = deck.getCardName(1);
		cardThree = deck.getCardName(2);
		
		//Sets the text of the Cards.
		pa = new Text(cardOne); 
		pe = new Text(cardTwo); 
		fu = new Text(cardThree); 
		
		//Adds text to the StackPane objects.
		past.getChildren().addAll(pa);
		present.getChildren().addAll(pe);
		future.getChildren().addAll(fu);
	}
}
