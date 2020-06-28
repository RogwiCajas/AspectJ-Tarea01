package listeners;

import javafx.scene.control.Button;
import javafx.scene.layout.Pane;

public class ButtonBlueListener implements EventListener {
	//private Button azul;
	//private Pane root;
	public ButtonBlueListener(/*Button azul, Pane root*/) {
		//this.root=root;
		//this.azul=azul;
		
	}
	@Override
	public void update(String eventType, Button boton, Pane root) {
		//cambia el color de fondo
		
		boton.setOnAction(e -> root.setStyle("-fx-background-color: Blue"));
		//root.setStyle("-fx-background-color: Blue");
		
		
	}
	

	
}
