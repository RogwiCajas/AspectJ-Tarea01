package listeners;

import javafx.scene.control.Button;
import javafx.scene.layout.Pane;

public class ButtonRedListener implements EventListener {
	//private Button boton;
	//private Pane root;
	public ButtonRedListener(/*Button boton,Pane root*/) {
		//this.boton=boton;
		//this.root=root;
		
	}
	@Override
	public void update(String eventType, Button boton, Pane root) {
		// metodo que cambia el color de acuerdo al boton presionado
		//cambia el color de fondo
		
		boton.setOnAction(e -> root.setStyle("-fx-background-color: Red"));
		//root.setStyle("-fx-background-color: Red");
		
	}

}