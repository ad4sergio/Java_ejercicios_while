package iestpjva.ejercicioswhile;
import java.util.Scanner;
/**
 * @author SERGIO ARELLANO
 */
public class EjercicioWhile3 {public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);   
   /* EJERCICIO 3: Ingresar un rango de valores (1er valor y 2do valor).
 Visualice la lista de estos números, además de sus cuadrados.: .*/
int valor1,valor2,cuadrado;
    System.out.println("Ingrese valor 1:");
    valor1= sc.nextInt();
    System.out.println("Ingrese valor 2:");
    valor2= sc.nextInt();
System.out.println("Cuadrados del rango entre los valores: "+valor1+" y "+valor2); 
    //--------------------------------------------------------------------------  
    int i=valor1;
    while ( i<=valor2) {
   cuadrado=i*i;
    System.out.println("El cuadrado de "+i+" es: "+cuadrado);
     i++;     
    }
}
}
