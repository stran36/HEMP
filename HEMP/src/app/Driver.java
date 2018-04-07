package app;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import visuals.GUI;

public class Driver extends Application{

	@Override
	public void start(Stage primaryStage) throws Exception {
		GUI gui = new GUI();
		Scene scene = new Scene(gui);
		scene.getStylesheets().add("app/styles.css");
		primaryStage.setScene(scene);
		primaryStage.setResizable(false);
		primaryStage.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}

}
