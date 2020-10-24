package employee.view;

import java.io.IOException;

import employee.Main;
import javafx.fxml.FXML;

public class MainItemsController {
	
	private Main main;
	
	@FXML
	private void goFortune() throws IOException{
		main.showFortuneScene();
		}	
	@FXML
	private void goSearch() throws IOException{
		main.showSearchScene();
	}
	@FXML
	private void goNotes() throws IOException{
		main.showNotesScene();
	}
}	
