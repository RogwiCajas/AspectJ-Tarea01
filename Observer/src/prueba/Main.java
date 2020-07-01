package prueba;


import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


public class Main extends Application {
	
	@Override
	public void start(Stage arg0) throws Exception {
		VBox root = new VBox();
		//Creo la ventana
		Stage stage = new Stage();
		
		//Creo los botones
		Button Bluebt = new Button("Blue");
		Button Redbt = new Button("Red");
		Button Greenbt = new Button("Green");
		//
		
		Bluebt.setOnAction(e -> root.setStyle("-fx-background-color: Blue"));
		Redbt.setOnAction(e -> root.setStyle("-fx-background-color: Red"));
		Greenbt.setOnAction(e -> root.setStyle("-fx-background-color: Green"));
		//
		root.getChildren().addAll(Bluebt,Redbt,Greenbt);
		root.setAlignment(Pos.CENTER);
		Scene scene = new Scene(root, 400,400);
		stage.setScene(scene);
		stage.show();
	}
	public static void main(String[] args) {
		launch(args);
	}
	


}
