package mx.com.everis.tallerjava.interfaz;

public interface PruebaInterfaz extends InterfazPrueba, InterfazPrueba2{//se usa extends no implements, no extens clase
	//String getNombre();//metodo abstracto, no tiene cuerpo, no esta declarado.(Se declara pero no se define)
	//public String getNombre();
	public abstract String getNombre();
	//public static String getNombre1();//Los metodos en una interfaz no pueden ser estaticos.
	
	String apellido="Arma";//implicito el public, en interfaz solo puedes declarar constantes.
	//final String getNom();//no puede ser final
	//strictfp String getNom1();//no puede ser strictfp
	//native String getNom2();//no puede ser native
}
