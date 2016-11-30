package mx.com.everis.Arma;

import java.util.Scanner;
import java.util.regex.*;
import java.util.Date;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class CambioHora {
	/*public static void generarV(int[][] v,String o, int p) { // Generamos un vector
		Scanner s = new Scanner(o).useDelimiter("\\s* \\s*");
		for (int i = 0; i < v.length; i++) {
			v[p][i]=s.nextInt();
		}
	}
	
	public static void sumaV(int[][] v,int n) { // Hace el histograma
		int aumenta=0,suma1=0,suma2=0,disminuye=v.length-1,total=0;
		for (int i = 0; i < v.length; i++)
		{
			suma1=suma1+v[i][aumenta];
			suma2=suma2+v[i][disminuye];
			aumenta=aumenta+1;
			disminuye=disminuye-1;
		}
		total=suma1-suma2;
		if (total<0){
			total=total*(-1);
		}
		System.out.println("La diferencia absoluta de las diagonales es: "+total);
	}*/
	
	public static void main(String[] args) throws ParseException {
		
		Scanner sc = new Scanner(System.in); // Creamos el ingreso de datos
		//String hor,min,seg,mantar;
		
		System.out.print("Otorga la hora a cambiar: ");
		String hora = sc.nextLine(); // Almacenamos La hora
		System.out.println("hora: "+hora);
		//Validamos el formato
		Pattern patron = Pattern.compile("^(0[1-9]|1[0-2]):[0-5][0-9]:[0-5][0-9][AP]M$");
		Matcher m = patron.matcher(hora);
		if (m.matches()){
			System.out.println("Hora correcta continuamos");
			//hor=hora.substring(0, 2);
			//min=hora.substring(3, 5);
			//seg=hora.substring(6, 8);
			//mantar=hora.substring(8, 10);
			DateFormat df = new SimpleDateFormat("hh:mm:ssaa");
			DateFormat outputformat = new SimpleDateFormat("HH:mm:ss");
			Date date = null;
		    String output = null;
			 date= df.parse(hora);
	    	 output = outputformat.format(date);
	    	 System.out.println(output);	
		}else{
			System.err.println("Error en el formato de las horas, hh:mm:ssAM o hh:mm:ssPM");
		}
	}
}
