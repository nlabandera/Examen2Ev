import java.util.ArrayList;
import java.util.Scanner;

public class Ejecutable {
	

	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		
		ArrayList<Persona> personas = new ArrayList<Persona>();
	
		boolean salir = false;

		int opcion;
		while (!salir) {
			System.out.println("Qué quieres hacer?" 
					+ "\n1. Añadir personas."
					+ "\n2. Mostrar datos de las personas guardadas." 
					+ "\n3. Nº de personas guardadas." 
					+ "\n4. Mostrar personas mayores de edad"
					+ "\n5. Mostrar personas por ciudad" 
					+ "\n6. Salir.");
			
			opcion = sc.nextInt();
			
			switch(opcion) {
			
			case 1:
				
				añadirPersona(personas);
				
				break;
						
			case 2:
				mostrarPersonas(personas);
				break;
				
			case 3: 
				numeroPersonas(personas);
				break;
				
			case 4:
				personasMayoresDeEdad(personas);
				break;
			
			case 5:
				cuantasPersonasVivenEn(personas);
				break;
			case 6: 
				System.out.println("Saliendo...");
				salir = true;
				break;
				
			default:
				System.out.println("Opción incorrecta. Elija otra");
			}
			
				
		}

	}
	public static void  numeroPersonas(ArrayList<Persona> personas) {
		System.out.println(personas.size());
	}
	
	public static  void añadirPersona(ArrayList<Persona> personas) {
		
		System.out.println("Cuantas personas vas a meter?");
		int numeroPersonas = sc.nextInt();
		
		while(personas.size()<numeroPersonas) {
			
			Persona persona =new Persona();
			System.out.println("Introduzca datos");
			
			System.out.println("Nombre:");
			String nombre = sc.next();
			persona.setNombre(nombre);
			System.out.println("Direccion :");
			String direccion = sc.next();
			persona.setDireccion(direccion);
			System.out.println("Código Postal :");
			int codpost = sc.nextInt();
			persona.setCodpost(codpost);
			System.out.println("Ciudad :");
			String ciudad = sc.next();
			persona.setCiudad(ciudad);
			System.out.println("Edad :");
			int edad = sc.nextInt();
			persona.setEdad(edad);
			
			personas.add(persona);
			
		}
	}

	public static void mostrarPersonas(ArrayList<Persona> personas) {
		for(int i=0; i<personas.size();i++) {
			System.out.println(personas.get(i).toString()+"\n");
		}
	}
	
	public static void personasMayoresDeEdad(ArrayList<Persona> personas) {
		int numAdultos=0;
		
		for (int i = 0; i<personas.size(); i ++) {
			if(personas.get(i).esMayorDeEdad(personas.get(i).getEdad())==true){
				numAdultos++;
			}
		}
		System.out.println(numAdultos);
	}
	
/*	public static boolean esMayorDeEdad(ArrayList<Persona> personas) {
		boolean esMayor = true;
		for (int i = 0; i<personas.size(); i++) {
			if(personas.get(i).getEdad()>17) 
				esMayor=true;
			else
				esMayor=false;
		}
		return esMayor;			
	}
*/	
	public static void cuantasPersonasVivenEn(ArrayList<Persona> personas) {
		
		System.out.println("Escriba ciudad: ");
		String ciudad = sc.next();
		
		int cant=0;
		
		for (int i = 0; i<personas.size(); i++) {
			if(personas.get(i).getCiudad().equalsIgnoreCase(ciudad)) {
				cant ++;
			}
			
		}
		System.out.println(cant);
	}
	
//----------------------FIN DEL MAIN---------------------//


}
