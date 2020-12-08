package app;

import controladores.*;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {
	
	private MainController main_cont;
	
	public Main()
	{
		
		main_cont = new MainController();
	}

	public static void main(String[] args) {
		launch();
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		Scene sc = new Scene(main_cont.getView());
		primaryStage.setScene(sc);
		primaryStage.show();
	}
}
