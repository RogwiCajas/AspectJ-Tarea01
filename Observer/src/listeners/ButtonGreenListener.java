package listeners;

import javafx.scene.control.Button;
import javafx.scene.layout.Pane;

public class ButtonGreenListener implements EventListener {
	//private Button boton;
	//private Pane root;
	public ButtonGreenListener(/*Button boton,Pane root*/) {
		//this.boton=boton;
		//this.root=root;
		
	}
	@Override
	public void update(String eventType, Button boton, Pane root) {
		//cambia el color de fondo
		
		boton.setOnAction(e -> root.setStyle("-fx-background-color: Green"));
		//root.setStyle("-fx-background-color: Green");
		
	}

}
