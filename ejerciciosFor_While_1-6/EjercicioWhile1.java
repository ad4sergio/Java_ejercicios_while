package iestpjva.ejercicioswhile;
import java.util.Scanner;
/*
@author SERGIO ARELLANO
 */
public class EjercicioWhile1 {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);    
    /* EJERCICIO 1: Realice un programa que calcule el factorial de un numero ingresado por teclado.*/
    int i=1, factorial=1;
    System.out.println("Ingrese un número:  ");
    int numero = sc.nextInt();
    while (i <= numero)
    { factorial=factorial*i; 
    i++;  }
    System.out.println("El factorial de " + numero + " es " + factorial); 
    }
}
