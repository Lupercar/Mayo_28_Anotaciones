package anotaciones;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.management.StringValueExp;

@Target( //Se puede poner esta anotación
		{
		ElementType.FIELD,  //En propiedades
		ElementType.TYPE,   //En clases
		ElementType.METHOD  //En métodos
		}
		)

@Retention( //hasta donde sobrevive la anotación
//		El compilador lo elimina
//		RetentionPolicy.SOURCE 
		
//		Pasa el compilador pero la MVJ al pasar no lo lee
//		RetentionPolicy.CLASS  
		
//		Pasa el compilador y la MVJ lo lee
		RetentionPolicy.RUNTIME 
		)

public @interface Descripcion {
//	crea la propiedad privada, getter y setter
	String value(); 
}//fin @interface anotaciones.Descripcion
