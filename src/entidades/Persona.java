package entidades;

import anotaciones.Descripcion;
import anotaciones.ValidarPersona;

//La propiedad value es especial y la podemos omitir
//el nombre de la propiedad. 
@Descripcion("Representa a una persona.")
@ValidarPersona(
		minCodigo = 5,
		maxCodigo = 500, 
		patronNombre = "\\A(([A-ZÑ])(\\p{Lower}+))((\\s+))(([A-ZÑ])(\\p{Lower}+))"
		)
@ValidarPersona(
		minCodigo = 10,
		maxCodigo = 400, 
		patronNombre = ".*"
		)
public class Persona {
	@Descripcion("Código de la persona.")
	private Integer codigo;
	@Descripcion("Nombre de la persona.")
	private String nombre;
	
	public Persona(){
		
	}
	
	public Persona(Integer codigo, String nombre){
		setCodigo(codigo);
		setNombre(nombre);
	}
	
	@Descripcion("Obtiene el codigo de la persona")
	public Integer getCodigo() {
		return this.codigo;
	}
	
	@Descripcion("Establece el codigo de la persona")
	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}
	
	@Descripcion("Obtiene el nombre de la persona")
	public String getNombre() {
		return this.nombre;
	}
	
	@Descripcion("Establece el nombre de la persona")
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "Persona [Codigo= " + this.getCodigo() + 
				
				", Nombre= " + this.getNombre() + 
				"]\n"; 
	}
}//fin class entidades.Persona
