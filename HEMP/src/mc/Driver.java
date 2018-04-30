package mc;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import ui.GUI;

public class Driver extends Application{
	
//Project in Dev3 Branch

	@Override
	public void start(Stage primaryStage) throws Exception {
		GUI gui = new GUI();
		Scene scene = new Scene(gui);
		scene.getStylesheets().add("mc/styles.css");
		primaryStage.setScene(scene);
		primaryStage.setResizable(false);
		primaryStage.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}

}
