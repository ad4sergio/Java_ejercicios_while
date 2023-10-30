package iestpjva.ejercicioswhile;
import java.util.Scanner;
/**
 * @author SERGIO ARELLANO
 */
public class EjercicioWhile6 {public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);   
  /* EJERCICIO 6: Realizar un programa que permita el ingreso del nombre y sexo de N personas.
 El programa debe calcular y mostrar la cantidad de personas del sexo masculino y la cantidad de femenino.*/
    int cantidadMasculino=0,cantidadFemenino=0;
    String nombre,sexo;
    System.out.println("Ingrese cantidad de personas:");
    int cantidadPersonas= sc.nextInt();
    //--------------------------------------------------------------------------  
    int i=1;
    while ( i<=cantidadPersonas) {
        System.out.println("Ingresar nombre de persona "+i+": ");
        nombre=sc.next();
        System.out.println("Ingresar sexo de persona "+i+": ");
        sexo=sc.next();
        //----------------------
        if (sexo.equals("masculino")){cantidadMasculino=cantidadMasculino+1;}
        else if (sexo.equals("femenino")){cantidadFemenino=cantidadFemenino+1;}
         i++; } //final while
     System.out.println("La cantidad de personas de sexo femenino es:  "+cantidadFemenino);
     System.out.println("La cantidad de personas de sexo masculino es: "+cantidadMasculino);
 }
}
