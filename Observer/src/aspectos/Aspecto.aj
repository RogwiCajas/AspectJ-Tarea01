package aspectos;


import javafx.stage.Stage;
import prueba.Main;

public aspect Aspecto {
	pointcut CambioColor():call(void Main.start(Stage arg0));
	
	after(): CambioColor(){
		
		if (comprobar().equals("Azul")) {
			Main.cambiarAzul();
		}
		
	}

	public static String comprobar() {
		
		return "Azul";
	}
}
