package xoltarot;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class TodayFortController {
	@FXML
	private AnchorPane mainPane2;
	//takes the user from the Today's Fortune window to the main menu
	@FXML
	void Home(ActionEvent event) throws IOException {
		mainPane2 = FXMLLoader.load(getClass().getResource("Main.fxml"));
		Scene scene = new Scene(mainPane2);
		Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
		window.setScene(scene);
		window.show();
	}
}
