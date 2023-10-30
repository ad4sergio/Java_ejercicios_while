package iestpjva.ejerciciosestructurawhile;
import java.util.Scanner;

public class EjercicioEstructuraWhile2 { 
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);    
    /* 
EJERCICIO 2:Pedir la edad de una persona mientras edad sea válida donde 
no puede ser negativa ni mayor a 100.
    */ 
        int edad=0;
        while (edad>=0 && edad<=100)
        { System.out.println("Ingresar una edad válida: ");
        edad=sc.nextInt();}
          
        if (edad<=0 || edad>=100)
        System.out.println("ERROR: Edad invalida");
    
    }
}
