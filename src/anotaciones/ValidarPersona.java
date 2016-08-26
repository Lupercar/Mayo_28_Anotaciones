package anotaciones;

import java.lang.annotation.ElementType;
import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target( //Se puede poner esta anotación 
		{
			ElementType.TYPE //En clases
		}
		)

@Retention( //Hasta donde sobrevive la anotacion
		
//		Pasa el compilador y la MVJ lo lee
		RetentionPolicy.RUNTIME 
		)

@Repeatable( ValidacionesPersona.class)
public @interface ValidarPersona {
	int minCodigo();
	int maxCodigo();
	String patronNombre(); 
}//fin @interface anotaciones.ValidarPersona
