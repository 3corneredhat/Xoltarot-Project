package xoltarot.controller;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class PastFortuneController {
	@FXML
	private AnchorPane mainPane4;
	@FXML
	private Button showPastFortunes;
	@FXML
	public TextArea pastFortunes;

	// reads the "PastFortunes.txt" into a textArea
	@FXML
	public void showPastFort(ActionEvent event) throws FileNotFoundException {
		File file = new File("PastFortunes.txt");
		try {
			Scanner read = new Scanner(file);
			while (read.hasNext()) {
				pastFortunes.appendText(read.nextLine() + "\n");
			}
			read.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

	// takes the user from the My notes window to the main menu
	@FXML
	void Home(ActionEvent event) throws IOException {
		pastFortunes.clear();

		mainPane4 = FXMLLoader.load(getClass().getResource("/xoltarot/view/Main.FXML"));
		Scene scene = new Scene(mainPane4);
		Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
		window.setScene(scene);
		window.show();
	}
}
