//Nombre:Gerardo Alejandro Piña Puentes Dia:07/02/2019 Hora: 12:25

import java.util.Scanner; //libreria para poder leer datos que ingrese el usuario

public class ejercicio5_producto {

	public static void main(String[] args) {
	Scanner in = new Scanner(System.in); 

	System.out.print("ingrese el primer numero: ");  	
	int a = in.nextInt();					//Te permite ingresar la variable a para poder utilizarla
	System.out.print("ingrese el segundo numero: ");
	int b = in.nextInt();	
	
System.out.println("El resultado es" + a*b);    //Hace la operacion de las dos variables e imprime el resultado final
 }
}				
				
