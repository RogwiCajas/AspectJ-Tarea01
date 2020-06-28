package listeners;

import javafx.scene.control.Button;
import javafx.scene.layout.Pane;

public interface EventListener {
	//Realiza cambio de fondo de pantalla, para esto recibe referencia al boton y al panel principal de jfx
	public void update(String eventType,Button boton, Pane root);

}
