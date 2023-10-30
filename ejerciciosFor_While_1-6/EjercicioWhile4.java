package iestpjva.ejercicioswhile;
import java.util.Scanner;
/**
 * @author SERGIO ARELLANO
 */
public class EjercicioWhile4 {public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);   
  /* EJERCICIO 4: Realizar un programa que permita ingresar n cantidad numéricas, 
 al finalizar el proceso, mostrar el promedio y la suma total de los números ingresados 
 (el valor n debe ingresarse desde el teclado). */
    int nota,sumaNotas=0;
    double promedio;
    System.out.println("Ingrese cantidad de notas:");
    int cantidadNotas= sc.nextInt();
    //--------------------------------------------------------------------------  
     int i=1;
     while ( i<=cantidadNotas) {
        System.out.println("Ingresar nota "+i+": ");
        nota=sc.nextInt();
        sumaNotas=sumaNotas+nota;
        i++;  
        }
    
     promedio=sumaNotas/cantidadNotas;
     System.out.println("La suma de notas es: "+sumaNotas);
     System.out.println("El promedio es: "+promedio);
 }
}
