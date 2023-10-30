package iestpjva.ejerciciosestructurawhile;
import java.util.Scanner;

public class EjercicioEstructuraWhile4 { 
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);    
   /*   EJERCICIO 4:Una persona debe realizar un muestreo con  50 personas para determinar el promedio 
de peso de los niños,jóvenes,adultos y tercera edad que existen en la zona habitacional. 
se determinan las categorias con base en:
categoria  edad
a.niños  0-12
b.jovenes  13-29
c.adultos  30-59
d.viejos  60 en adelante.
    */
    int i=1, poblacion=8,edad,niños=0,jovenes=0,adultos=0,viejos=0;
    double peso,pesoNiños=0,pesoJovenes=0,pesoAdultos=0,pesoViejos=0;
    System.out.println("La población evaluada es de "+poblacion+" personas");
    while(i<=poblacion)
    {  System.out.println("Ingresar edad de persona "+i+": ");
         edad= sc.nextInt();
         System.out.println("Ingresar peso de persona "+i+": ");
         peso=sc.nextDouble();
          if (edad>0 && edad<=12)
         {niños=niños+1; pesoNiños=pesoNiños+peso;} 
         else if (edad>=13 && edad<=29)
         {jovenes=jovenes+1; pesoJovenes=pesoJovenes+peso;} 
         else if (edad>=30 && edad<=59)
         {adultos=adultos+1; pesoAdultos=pesoAdultos+peso;} 
         else if (edad>=60)
         {viejos=viejos+1; pesoViejos=pesoViejos+peso;}
          i++;
       }//fin while
        double promedioNiños,promedioJovenes,promedioAdultos,promedioViejos;
        promedioNiños=pesoNiños/niños;
        promedioJovenes=pesoJovenes/jovenes;
        promedioAdultos=pesoAdultos/adultos;
        promedioViejos=pesoViejos/viejos;
    System.out.println("DATOS RECOPILADOS");
    System.out.println("Peso promedio de "+niños+" niños es: "+promedioNiños);
    System.out.println("Peso promedio de "+jovenes+" jovenes es: "+promedioJovenes);
    System.out.println("Peso promedio de "+adultos+" adultos es: "+promedioAdultos);
    System.out.println("Peso promedio de "+viejos+" viejos es: "+promedioViejos);
    }
}
