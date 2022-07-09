package application;

import java.net.URL;
import java.nio.file.Paths;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;


public class Main extends Application {

	@Override
	public void start(Stage stage) {
		
		try {
			URL url = Paths.get("C:\\Projetos_Eclipse\\javafx2\\src\\gui\\View.fxml").toUri().toURL();
			Parent parent = FXMLLoader.load(url);
			Scene scene = new Scene(parent);
			stage.setScene(scene);
			stage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}

/*getClass().getClassLoader().getResource("../gui/View.fxml")*/