package mx.com.everis.tallerjava.ejemplo;

import mx.com.everis.tallerjava.interfaces.*;

 abstract public class Persona extends Persona2 implements MiInterfaz {
	 /*
	  * Metodo abstracto
	  */
	 public abstract void getPersona();
	 
	 public abstract void getC();
	 /*
	  * Metodo no abstracto
	  */
	 public void getNombre(){
		 System.out.println("getNombre Persona");
	 }
	 
}
