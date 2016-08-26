package entidades;

import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

import anotaciones.ValidacionesPersona;
import anotaciones.ValidarPersona;

public class RepositorioPersonas {

	private List<Persona> personas = new ArrayList<>();

	public void add(Persona persona){
		if(persona != null){
			
			Class metadatos = persona.getClass();
//			ValidarPersona anotacion =  (ValidarPersona) metadatos
//					.getAnnotation(ValidarPersona.class); 
			
			ValidarPersona[] anotaciones = (ValidarPersona[]) metadatos
					.getAnnotationsByType(ValidarPersona.class); 
			
			if(anotaciones.length!=0) { //tenemos anotaciones
				boolean cumple = true;
				for(ValidarPersona ann: anotaciones){ //recorro anotaciones
					if(cumple && !personaValida(ann, persona))
						cumple = false; 
					
				}
				if(cumple)
					personas.add(persona);
			}
		}	
	}
	
	private boolean personaValida(ValidarPersona anotacion, Persona persona ){
		boolean ret = false; 
		int min = anotacion.minCodigo(); 
		int max = anotacion.maxCodigo(); 
		String regex = anotacion.patronNombre(); 
				
		if( persona.getCodigo() >=  min && persona.getCodigo() <= max ) {
			if(Pattern.compile(regex).matcher(persona.getNombre()).find() ){
				ret = true; 
			}
		}
		return ret; 
	}

	public List<Persona> getAll() {
		return personas;
	}
}// fin class entidades.RepositoroPersonas
