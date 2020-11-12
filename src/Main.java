package xoltarot;

import java.io.IOException;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class Main extends Application {
	private Stage primaryStage;
	private static AnchorPane mainLayout;
	
	@Override
	public void start(Stage primaryStage) throws IOException {
			this.primaryStage = primaryStage;
			this.primaryStage.setTitle("Xoltarot");//title for the application
			showMain();//shows the main menu	
	}

	private void showMain() throws IOException {
		FXMLLoader loader = new FXMLLoader(); 
		loader.setLocation(Main.class.getResource("Main.fxml"));
		mainLayout = loader.load();
		Scene scene = new Scene(mainLayout); 
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	public static void main(String[] args) {
		launch(args);//launches the application
	}
}
