package aspectos;



public aspect Aspecto {
	pointcut CambioColorRojo():execution(void ButtonRedListener.update(String) );
	after(): CambioColorRojo(){
		System.out.println("Color Rojo  ");
	}
	

}
