package iestpjva.ejercicioswhile;
import java.util.Scanner;
/**
 * @author SERGIO ARELLANO
 */
public class EjercicioWhile2 {public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);   
    /* EJERCICIO 2: En una empresa trabajan N empleados cuyos sueldos oscilan entre 1000 y 3000 soles,
realizar un programa que lea los sueldos que cobra cada empleado e informe cuantos empleados cobran 
entre 1000 y 2000 soles y cuantos cobran más de 2000. Además, el programa deberá informar el importe 
que gasta la empresa en sueldos al personal.*/
int cantidadEmpleados, sueldosEntre1000y2000=0, sueldosMasDe2000=0; 
int sueldosTotales=0;
    System.out.println("Ingrese cantidad de empleados:");
    cantidadEmpleados= sc.nextInt();
 //--------------------------------------------------------------------------  
 int i=1;
 while ( i<=cantidadEmpleados) {
    System.out.println("Ingrese sueldo del empleado "+i+" :");
    int sueldo=sc.nextInt();
    if (sueldo>=1000 && sueldo<=2000)
    {sueldosEntre1000y2000=sueldosEntre1000y2000+1;}
    else if (sueldo>=2000)
    {sueldosMasDe2000=sueldosMasDe2000+1;}
    sueldosTotales=sueldosTotales+sueldo;
    i++; 
 }
//------------------
    System.out.println("Sueldos entre 1000 y 2000: "+sueldosEntre1000y2000);
    System.out.println("Sueldos entre 2000: " +sueldosMasDe2000);
    System.out.println("Gasto en sueldos de personal:"+sueldosTotales);  
}
}
