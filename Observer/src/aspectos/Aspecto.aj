package aspectos;


import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonBase;
import javafx.stage.Stage;
import prueba.Main;

public aspect Aspecto {

	pointcut cambiarColorB() :call(* updateB(..));
	
	after() : cambiarColorB()  {
		System.out.println("Se cambio a Azul");
		
	}
	
	pointcut cambiarColorR() :call(* updateR(..));
	
	after() : cambiarColorR()  {
		System.out.println("Se cambio a Rojo");
		
	}
	pointcut cambiarColorG() :call(* updateG(..));
	
	after() : cambiarColorG()  {
		System.out.println("Se cambio a Verde");
		
	}

}
