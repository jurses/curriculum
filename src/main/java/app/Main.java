package app;

import controladores.*;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {
	
	private MainController main_cont;
	private static Stage main_stage;
	
	public Main()
	{
		
		main_cont = new MainController();
	}

	public static void main(String[] args) {
		launch();
	}
	
	public static Stage getMain_stage()
	{
		return main_stage;
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		main_stage = primaryStage; 
		Scene sc = new Scene(main_cont.getView());
		primaryStage.setScene(sc);
		primaryStage.show();
	}
}
