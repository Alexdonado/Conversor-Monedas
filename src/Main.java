
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		EXTERNA:
		while(true) {
			System.out.println("CONVERSOR DE MONEDAS");
			System.out.println("1- Pesos Colombianos a Dolares\n"
							 + "2- Pesos Chilenos a Dolar\n"
						     + "3- Bolívares Soberanos a Dolares\n"
						 	 + "4- Salir ");
			System.out.print("INGRESE UNA OPCIÓN:");
			Scanner leer = new Scanner(System.in);
			char opcion = leer.next().charAt(0);
			
			switch(opcion) {
				case 1:
					convertir(4.23, "Pesos Colombianos");
					break;
				case 2:
					convertir(900, "Pesos Chilenos");
					break;
				case 3:
					convertir(33, "Bolívares Soberano");
					break;
				case 4:
					System.out.println("Cerrando Conversor");
					break EXTERNA;
				default:
					System.out.println("O P C I Ó N  INCORRECTA");
					break; 
			}
		}

	}
	
	static void convertir(double valorDolar, String pais) {
	Scanner leer = new Scanner(System.in);
	System.out.printf("Ingrese la cantidad a convertir: ", pais);
	double cantidadDivisa = leer.nextDouble();
		
	double dolares = cantidadDivisa / valorDolar;
		
	dolares = (double) Math.round(dolares*100d)/100;
			
	System.out.println("----------------------------------------------------");
	System.out.println("|     Tienes la cantidad $"+dolares+"Dolares       |");
	System.out.println("----------------------------------------------------");
	
	}
	
}
