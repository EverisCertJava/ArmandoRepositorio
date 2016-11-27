package mx.com.everis.tallerjava.hijas;

import mx.com.everis.tallerjava.implementapadre.SeleccionFutbol;

public class Entrenador extends SeleccionFutbol {

	private int idFederacion;

	public int getIdFederacion() {
		return idFederacion;
	}

	public void setIdFederacion(int idFederacion) {
		this.idFederacion = idFederacion;
	}
	
	public Entrenador(int id, String nombre, String apellidos, int edad, int idFederacion){
		super(id,nombre,apellidos,edad);
		this.setIdFederacion(idFederacion);
	}

	@Override
	public void entrenar() {
		System.out.println("Dirige un entrenamiento (Clase Entrenador)");

	}

	@Override
	public void jugarPartido() {
		System.out.println("Dirige un Partido (Clase Entrenador)");
	}

	public void planificarEntrenamiento() {
		System.out.println("Planificar un Entrenamiento");
	}
}
