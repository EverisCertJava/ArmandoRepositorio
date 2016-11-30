package mx.com.everis.tallerjava.enums;

public enum PreciosCaffe {
	/**/
	CHICO("Costo de 15 pesos"),
	
	/**/
	MEDIANO("Costo de 25 pesos"),
	
	/**/
	GRANDE("Costo de 30 pesos");
	private String mensaje;
	
	private PreciosCaffe(String costo){
		this.mensaje = costo;
	}
	
	public String getValue(){
		return this.mensaje;
	}
}
