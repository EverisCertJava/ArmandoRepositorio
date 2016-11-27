package mx.com.everis.tallerjava.hijas;

import mx.com.everis.tallerjava.implementapadre.SeleccionFutbol;

public class Futbolista extends SeleccionFutbol {

	private int dorsal;
	private String demarcacion;

	public Futbolista(int id, String nombre, String apellidos, int edad,int dorsal, String demarcacion){
		super(id,nombre,apellidos,edad);
		this.setDorsal(dorsal);
		this.setDemarcacion(demarcacion);
	}

	@Override
	public void entrenar() {
		System.out.println("Realiza un entrenamiento (Clase Futbolista)");
	}

	@Override
	public void jugarPartido() {
		System.out.println("Juega un Partido (Clase Futbolista)");
	}

	public void entrevista() {
		System.out.println("Da una Entrevista");
	}

	public int getDorsal() {
		return dorsal;
	}

	public void setDorsal(int dorsal) {
		this.dorsal = dorsal;
	}

	public String getDemarcacion() {
		return demarcacion;
	}

	public void setDemarcacion(String demarcacion) {
		this.demarcacion = demarcacion;
	}
}
