public class ejercicio15_cambio {
 
 public static void main(String[] args) {
     
   int a, b, temp;
   a = 15;
   b = 27;
   System.out.println("antes del cambio : a, b = "+a+", "+ + b);
   temp = a;
   a = b;
   b = temp;   
  System.out.println("Despues del cambio : a, b = "+a+", "+ + b);
 }
 }