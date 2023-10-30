package iestpjva.ejerciciosestructurawhile;
import java.util.Scanner;

public class EjercicioEstructuraWhile3 { 
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);    
    /* 
/*EJERCICIO 3: Desarrollar un programa que solicite ingresar un conjunto de números 
(positivos,negativos,ceros),
luego calcular y mostrar:
-suma de números negativos.
-producto de númeors positivos.
-porcentaje de ceros (con relacion al total de ingresos)*/
int numero, numerosNegativos=0,numerosPositivos=1,i=1,ceros=0,porcentajeCeros;       
        System.out.println("Ingresar una cantidad de números para procesar: ");
         int cantidadConjunto=sc.nextInt();
        while(i<=cantidadConjunto){
           System.out.println("Ingresar numero "+i+" :(positivos,negativos,ceros)");  
            numero=sc.nextInt(); 
            if (numero<0)
                {numerosNegativos=numerosNegativos+numero;}   
               else if (numero>0)
                {numerosPositivos=numerosPositivos*numero;} 
               else if (numero==0)
                {ceros=ceros+1;} 
         i++;}//fin while
        
            porcentajeCeros=(ceros*100)/cantidadConjunto;
            
            System.out.println("Suma de negativos: "+numerosNegativos);
            System.out.println("Producto de positivos: "+numerosPositivos);
            System.out.println("Porcentaje de ceros: "+porcentajeCeros+" %");
        
    }
}
