package consola;

import anotaciones.Descripcion;
import entidades.Persona;
import entidades.RepositorioPersonas;

public class App {

	public static void main(String[] args) {
		
		Persona p1 = new Persona(11, "Juanito Palotes"); 
		Persona p2 = new Persona(20, "Pepito Gordillo"); 
		
		RepositorioPersonas repo = new RepositorioPersonas();
		repo.add(p1);
		repo.add(p2);
		
		System.out.println(repo.getAll());
		System.out.println(getDescripcion(p1.getClass()));
	}
	
	private static String getDescripcion(Class elemento){
		String resultado = "";
//		Obtenemos la anotacion de este tipo, le hacemos un casting de 
//		Annotation a Descripcion  y obtenemos el valor de la propiedad value.
		resultado = ((Descripcion)elemento.getAnnotation(Descripcion.class))
				.value(); 
		return resultado; 
	}
}//fin class consola.App
