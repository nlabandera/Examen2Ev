import java.util.ArrayList;

public class Persona {
	private String nombre;
	private String direccion;
	private int codpost=0;
	private String ciudad;
	private int edad=0;
	
	
	public Persona() {}

	public Persona (String nombre, String direccion, int codpost, String ciudad, int edad) {
		this.nombre= nombre;
		this.direccion = direccion;
		this.codpost=codpost;
		this.ciudad=ciudad;
		this.edad= edad;
	}

	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getDireccion() {
		return direccion;
	}


	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public int getCodpost() {
		return codpost;
	}


	public void setCodpost(int codpost) {
		this.codpost = codpost;
	}
	
	public String getCiudad() {
		return ciudad;
	}


	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}


	public int getEdad() {
		return edad;
	}


	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	public static boolean esMayorDeEdad(int edad) {
		boolean esMayor = true;
			if(edad>17) 
				esMayor=true;
			else
				esMayor=false;
		
		return esMayor;			
	}

	
	public String toString() {
		String mensaje;
	
		return mensaje="Nombre: "+nombre
				+"\nDireccion: "+direccion
				+"\nCiudad: "+ciudad
				+"\nCódigo Postal: "+codpost
				+"\nEdad: "+edad;
		
	}
	
}


