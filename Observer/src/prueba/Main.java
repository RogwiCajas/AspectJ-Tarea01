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
		EventHandler<ActionEvent> evB = new EventHandler<ActionEvent>() {
		    @Override public void handle(ActionEvent e) {
		        updateB(root);
		    }
		};
		EventHandler<ActionEvent> evR = new EventHandler<ActionEvent>() {
		    @Override public void handle(ActionEvent e) {
		        updateR(root);
		    }
		};
		EventHandler<ActionEvent> evG = new EventHandler<ActionEvent>() {
		    @Override public void handle(ActionEvent e) {
		        updateG(root);
		    }
		};
		//Creo la ventana
		Stage stage = new Stage();
		
		//Creo los botones
		Button Bluebt = new Button("Blue");
		Button Redbt = new Button("Red");
		Button Greenbt = new Button("Green");
		//
		
		Bluebt.setOnAction(evB);
		Redbt.setOnAction(evR);
		Greenbt.setOnAction(evG);
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
	
	public void updateB(VBox root) {
		root.setStyle("-fx-background-color: Blue");
		
	}
	public void updateR(VBox root) {
		root.setStyle("-fx-background-color: Red");
		
	}
	public void updateG(VBox root) {
		root.setStyle("-fx-background-color: Green");
		
	}

}
