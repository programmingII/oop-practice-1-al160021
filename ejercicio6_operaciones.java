//Nombre: Gerardo Alejandro Piña Puentes Dia: 07/02/2019 hora: 12:56
import java.util.Scanner; //Libreria que nos permite leer datos que ingresemos para interactuar con ellos

public class ejercicio6_operaciones{

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

	System.out.print("intrese el primer numero: ");
	int a = in.nextInt();					//Aqui le pide al usuario ingresar el valor que le quiere dar a la primera variable
	System.out.print("ingrese el segundo numero: " );
	int b = in.nextInt();					//Le pide al usuario ingresar el valor que le quiere dar a la segunda variable
		System.out.println("El resultado de la suma es " + 
  		(a + b));                                            //Imprime el resultado de la suma despues del calculo
   		System.out.println("El resultado de la resta es " + 
  		(a - b));						//Imprime el resultado de la resta despues del calculo
		 System.out.println("El resultado de la multiplicacion es " + 
  		(a * b));						//Imprime el resultado de la multiplicacion despues del calculo
		System.out.println("El resultado de la division es " + 
  		(a / b));						//Imprime el resultado de la division despues de realizar el calculo
		System.out.println("El resultado del modulo es " + 
  		(a % b));						//Imprime el resultado del modulo despues de realizar el calculo
 }
}