package mx.com.everis.certjava.clases;

/*
 * import
 * import static
 */
import mx.com.everis.certjava.interfaces.*;
import mx.com.everis.certjava.padre.*;

/*
 * Modificadores de acceso: private, default(package),protected, public
 * static(solo se instancia una vez, solo vive en la clase, solo una vez, estos se instancian sin
 * instanciar la clase)
 */
public class Runner extends Person implements Athlete, AthleteDos{

	/*
	 * Constructor, no tiene valor de retorno
	 */
	public Runner(){
		super();
		//System.out.println("Clase Hija (Runner)");
	}
	public Runner(String nombre){
		System.out.println("Constructor runner class"+nombre);
	}
	/*
	 * Var args
	 */
	Runner(String... name){
		System.out.println(name[0]);
		System.out.println(name[1]);
		System.out.println(name[2]);
	}
	/*
	 * Variables de clase o estaticas
	 */
	
	/*
	 * Variables de Instancia
	 */
	
	/*
	 * 
	 */
	@Override
	public String getNombre() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public String getApellido() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public int getEdad() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Armando"+"18";
	}
	
	
}
