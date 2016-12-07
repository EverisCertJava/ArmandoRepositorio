package mx.com.everis.hasaexa;

class Employee{
	float salary=3000;
}
public class Developer extends Employee{
	float bonus=2000;
	public static void main (String args[]){
		Employee objeto = new Employee();
		System.out.println("Salario es: "+objeto.salary);
	}
}
