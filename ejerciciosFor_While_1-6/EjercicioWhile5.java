package iestpjva.ejercicioswhile;
import java.util.Scanner;
/**
 * @author SERGIO ARELLANO
 */
public class EjercicioWhile5 {public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);   
  /* EJERCICIO 5: Desarrollar un programa en el que se ingresen los datos n personas 
 (nombre, apellido, dni, edad y pais) y calcule:
a) La cantidad de personas que están entre 25 y 46 años.
b) La cantidad de personas que son de nacionalidad peruana.
c) El promedio de edades de las personas de nacionalidad peruana.   .*/
    int edad,personas25a46=0,peruanos=0;
    double promedioEdadesPeruanos=0;
    String nombre,apellido,dni,pais;
    System.out.println("Ingrese cantidad de personas:");
    int cantidadPersonas= sc.nextInt();
    //--------------------------------------------------------------------------  
    int i=1;
    while ( i<=cantidadPersonas) {
        System.out.println("Ingresar nombre "+i+": ");
        nombre=sc.next();
        System.out.println("Ingresar apellido "+i+": ");
        apellido=sc.next();
        System.out.println("Ingresar DNI "+i+": ");
        dni=sc.next();
        System.out.println("Ingresar edad "+i+": ");
        edad=sc.nextInt();
        System.out.println("Ingresar pais "+i+": ");
        pais=sc.next();
        //----------------------
        if (edad>=25 && edad<=46){personas25a46=personas25a46+1;}
        if (pais.equals("Peru")){peruanos=peruanos+1;
        promedioEdadesPeruanos=promedioEdadesPeruanos+edad;}
         i++;        } //final while
     System.out.println("La cantidad de personas entre 25 a 46 años:  "+personas25a46);
     System.out.println("La cantidad de personas con nacionalidad peruana: "+peruanos);
     System.out.println("Promedio de edades de peruanos: "+promedioEdadesPeruanos);
 }
}
