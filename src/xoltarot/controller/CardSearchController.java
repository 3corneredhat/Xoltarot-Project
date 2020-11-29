/**
 * The controller for the Card Search function. 
 */
package xoltarot.controller;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import xoltarot.model.Card;
import xoltarot.model.Deck;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class CardSearchController implements Initializable {
//Declaraton of FXML items for use throughout card search
	@FXML
	private AnchorPane mainPane3;
	// takes the user from the card search window to the main menu

	@FXML
	private Button searchButton;

	@FXML
	private TextField searchBar;

	@FXML
	private TextField temp;

	@FXML
	private ListView<String> cards;
	
	@FXML
	private ImageView imageDisplay = new ImageView();;
	
	@FXML
	private Image pic;  

	ArrayList<String> cardList = new ArrayList<String>();
	ArrayList<String> searchList = new ArrayList<String>();
	
	//Reference list for initial display on Listview
	private void makeList(ArrayList<String> cardList) {
		cardList.add("0: The Fool");
		cardList.add("1: The Magician");
		cardList.add("2: The High Priestess");
		cardList.add("3: The Empress");
		cardList.add("4: The Emperor");
		cardList.add("5: The Hierophant");
		cardList.add("6: The Lovers");
		cardList.add("7: The Chariot");
		cardList.add("8: Strength");
		cardList.add("9: The Hermit");
		cardList.add("10: Wheel of Fortune");
		cardList.add("11: Justice");
		cardList.add("12: The Hanged Man");
		cardList.add("13: Death");
		cardList.add("14: Temperance");
		cardList.add("15: The Devil");
		cardList.add("16: The Tower");
		cardList.add("17: The Star");
		cardList.add("18: The Moon");
		cardList.add("19: The Sun");
		cardList.add("20: Judgement");
		cardList.add("21: The World");
	}

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// Creating "cardList" as reference for full deck of cards.
		makeList(cardList);
		//Displaying information to ListView
		for (int i = 0; i < cardList.size(); i++) {
			cards.getItems().add(cardList.get(i));
		}
	}

	@FXML
	void search(ActionEvent event) throws IOException {
		// Clearing ListView and searchList for fresh display
		cards.getItems().clear();
		searchList.clear();

		// Asking for term to be used for search
		String term = searchBar.getText();
		Matcher matcher;
		Pattern pattern = Pattern.compile(term, Pattern.CASE_INSENSITIVE);

		// Placing into second ArrayList matched terms
		for (int i = 0; i < cardList.size(); i++) {
			matcher = pattern.matcher(cardList.get(i));
			if (matcher.find()) {
				searchList.add(cardList.get(i));
			}
		}

		// Final display of matched terms on listview
		for (int i = 0; i < searchList.size(); i++) {
			cards.getItems().add(searchList.get(i));
		}
	}

	@FXML
	void display(ActionEvent event) throws IOException {
		Deck myDeck = new Deck();
		// Finds index number of selected item on ListView
		int selected = cards.getSelectionModel().getSelectedIndex();
		//Checks if nothing was selected and does nothing if so
		if(selected == -1){
			return;
		}
		String cardName;
		// If no search term has been selected, searches default ArrayList
		if (searchList.size() == 0) {
			cardName = cardList.get(selected);
		} else {// Otherwise, searches ArrayList created by search term.
			cardName = searchList.get(selected);
		}
		Pattern pattern = Pattern.compile(cardName, Pattern.CASE_INSENSITIVE);
		Matcher matcher;
		// Setting "i" to matched position in cardList
		for (int i = 0; i < cardList.size(); i++) {
			//Searching cardList for matched term retrieved by selecting ListView
			matcher = pattern.matcher(cardList.get(i));
			//Displaying information and picture to screen
			if (matcher.find()) {
				Card card = myDeck.deck.get(i);
				pic = new Image( getClass().getResourceAsStream("/xoltarot/images/".concat(String.valueOf(card.getNum()) + ".jpg")), 150, 220, true, true);
				imageDisplay.setImage(pic);
				Alert a = new Alert(AlertType.INFORMATION);
				a.setTitle("Card Information");
				a.setResizable(true);
				a.setHeaderText(card.getName());
				a.setContentText(card.getDescription());
				a.showAndWait();
				break;
			}
		}
	}

	@FXML
	void Home(ActionEvent event) throws IOException { //Button to return to home screen
		mainPane3 = FXMLLoader.load(getClass().getResource("/xoltarot/view/Main.FXML"));
		Scene scene = new Scene(mainPane3);
		Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
		window.setScene(scene);
		window.show();
	}
}
