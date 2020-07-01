package aspectos;


import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import prueba.Main;

public aspect Aspecto {

	
	pointcut cambiarColor() :  call(* *.setStyle*(String));
	
	after() : cambiarColor()  {
		String args = thisJoinPoint.getArgs()[0].toString();
		if(args.contains("Blue")) {
			System.out.println("Se cambio a Azul");
		}
		else if(args.contains("Green")) {
			System.out.println("Se cambio a Verde");
			
		}
		else {
			System.out.println("Se cambio a Rojo");
		}
		
	}
}
