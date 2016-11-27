package mx.com.everis.tallerjava.hijas;

import mx.com.everis.tallerjava.implementapadre.SeleccionFutbol;

public class Masajista extends SeleccionFutbol {

	private String titulacion;
	private int aniosExperiencia;

	public Masajista(int id, String nombre, String apellidos, int edad, String titulacion, int aniosExperiencia){
		super(id,nombre,apellidos,edad);
		this.setTitulacion(titulacion);
		this.setAniosExperiencia(aniosExperiencia);
	}
	
	public String getTitulacion() {
		return titulacion;
	}

	public void setTitulacion(String titulacion) {
		this.titulacion = titulacion;
	}

	public int getAniosExperiencia() {
		return aniosExperiencia;
	}

	public void setAniosExperiencia(int aniosExperiencia) {
		this.aniosExperiencia = aniosExperiencia;
	}

	@Override
	public void entrenar() {
		System.out.println("Da asistencia en el entrenamiento (Clase Masajista)");
	}

	public void darMasaje() {
		System.out.println("Da un Masaje");
	}
}