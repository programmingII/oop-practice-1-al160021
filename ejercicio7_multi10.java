//Nombre: Gerardo Alejandro Piña Puentes Fecha: 12/02/2019 Hora 12:04 
import java.util.Scanner; // Libreria que te permite escanear datos para trabajar con ellos
 
public class ejercicio7_multi10{ 
 
 public static void main(String[] args) { 
  Scanner in = new Scanner(System.in); 
   
  System.out.print("Escribe un numero: "); //Muestra en pantalla lo que se muestra entre comillas
  int num1 = in.nextInt();
   
  for (int i=0; i< 10; i++){  // Entra en un ciclo de 0 a 10 con incremento
   System.out.println(num1 + " x " + (i+1) + " = " + (num1 * (i+1)));  //Va a realizar una multiplicacion de el numero que ingresemos por los numeros que van en el ciclo (1-10)
  }
 }
}