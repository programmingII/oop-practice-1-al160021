//Nombre: Gerardo Alejandro Piña Puentes fecha: 16/02/2019 Hora 7:01 - 7:23
import java.util.Scanner;

public class ejercicio12_promedio {

	public static void main(String [] args) {
	Scanner in = new Scanner(System.in);
	
	System.out.print("ingresa los 5 numeros ") ;
	int a = in.nextInt();
        int b = in.nextInt();
	int c = in.nextInt();
	int d = in.nextInt();
	int e = in.nextInt();
	

		System.out.println(" El promedio de los 5 numeros es : " + (a + b + c + d + e) / 5);
	}
}