package employee;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class Main extends Application {
	private Stage primaryStage;
	private static BorderPane mainLayout;
	
	@Override
	public void start(Stage primaryStage) throws IOException {
		this.primaryStage = primaryStage;
		this.primaryStage.setTitle("Xoltarot");
		showMainView();
		showMainItems();
		
	}

	public static void showMainItems() throws IOException {
		FXMLLoader loader = new FXMLLoader(); 
		loader.setLocation(Main.class.getResource("view/MainItems.fxml"));
		BorderPane MainItems = loader.load();
		mainLayout.setCenter(MainItems);
		
	}

	private void showMainView() throws IOException {
		FXMLLoader loader = new FXMLLoader(); 
		loader.setLocation(Main.class.getResource("view/MainView.fxml"));
		mainLayout = loader.load();
		Scene scene = new Scene(mainLayout); 
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	
	public static void showFortuneScene() throws IOException {
		FXMLLoader loader = new FXMLLoader();
		loader.setLocation(Main.class.getResource("fortune/TodayFort.fxml"));
		BorderPane TodayFort = loader.load();
		mainLayout.setCenter(TodayFort);
	} 
	
	public static void showSearchScene() throws IOException {
		FXMLLoader loader = new FXMLLoader();
		loader.setLocation(Main.class.getResource("card/CardSearch.fxml"));
		BorderPane CardSearch = loader.load();
		mainLayout.setCenter(CardSearch);
	}
	public static void showNotesScene() throws IOException {
		FXMLLoader loader = new FXMLLoader();
		loader.setLocation(Main.class.getResource("notes/MyNotes.fxml"));
		BorderPane MyNotes = loader.load();
		mainLayout.setCenter(MyNotes);
	}

	public static void main(String[] args) {
		launch(args);
	}
}
