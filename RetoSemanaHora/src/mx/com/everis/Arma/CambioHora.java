package mx.com.everis.Arma;

import java.util.Scanner;
import java.util.regex.*;
import java.util.Date;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class CambioHora {

	public static void main(String[] args) throws ParseException {
		
		Scanner sc = new Scanner(System.in); // Creamos el ingreso de datos
		//String hor,min,seg,mantar;
		
		//System.out.print("Otorga la hora a cambiar: ");
		String hora = sc.nextLine(); // Almacenamos La hora
		//System.out.println("hora: "+hora);
		//Validamos el formato
		Pattern patron = Pattern.compile("^(0[1-9]|1[0-2]):[0-5][0-9]:[0-5][0-9][AP]M$");
		Matcher m = patron.matcher(hora);
		if (m.matches()){
			//System.out.println("Hora correcta continuamos");
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
