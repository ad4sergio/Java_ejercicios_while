package iestpjva.ejerciciosestructurawhile;
import java.util.Scanner;

public class EjercicioEstructuraWhile1 { 
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);    
    /* EJERCICIO 1: Elaborar programa que permita aceptar los datos de N empleados: 
nombre,categoría(entero),sueldo básico y número de hijos. Considerar condiciones:
a-si empleado pertenece cat 1,bonificación de 12% del sueldo basico.
b-si empleado pertenece cat 2, bonificación de 10% del sueldo basico.
c-si empleado pertenece cat 3, bonificación de 8% del sueldo basico.
d-Demás casos bonificación de  6% del sueldo basico.
adicionalmente si tiene 3 hijos tendrá bonificación de escolaridad de 20 soles por cada hijo,
si tiene hasta 6 hijos tendrá bono de 30 soles por cada hijo  y si tiene más de 6 hijos tendrá una bonificación 
de 40 soles por cada hijo. Se debe mostrar el importe de bonificación por categoria, 
el importe de bonificación por hijos y sueldo neto.*/    
    int cantidadEmpleados,categoria,sueldoBasico=0,numeroHijos=0;
    double bono,bonoCategoria1=0,bonoCategoria2=0,bonoCategoria3=0,bonoCategoria4=0;
    String nombre;
    System.out.println("|Ingrese cantidad de empleados");
    cantidadEmpleados=sc.nextInt();
    int i=1;
    while (i<=cantidadEmpleados){
        System.out.println("Ingrese nombre de empleado "+i+": ");
        nombre=sc.next();
        System.out.println("Ingrese categoría de empleado "+i+": ");
        categoria=sc.nextInt();
        System.out.println("Ingrese sueldo basico "+i+": ");
        sueldoBasico=sc.nextInt();
        System.out.println("Ingrese numero de hijos de empleado "+i+": ");
        numeroHijos=sc.nextInt();
                 switch (categoria) {
                     case 1:
                          bono=sueldoBasico*0.12;
                          bonoCategoria1=bonoCategoria1+bono;
                          break;
                     case 2:
                          bono=sueldoBasico*0.1;
                          bonoCategoria2=bonoCategoria2+bono;
                          break;
                     case 3:
                          bono=sueldoBasico*0.08;
                          bonoCategoria3=bonoCategoria3+bono;
                          break;
                     default:
                          bono=sueldoBasico*0.06;
                          bonoCategoria4=bonoCategoria4+bono;
                          break;
                         }//fin switch
        //-------------------------------         
        int escolaridad=0, escolaridad1=20, escolaridad2=30,escolaridad3=40;    
                 if (numeroHijos>=1 && numeroHijos<=3)
                    { escolaridad=numeroHijos*escolaridad1;}
                 else if (numeroHijos>=4 && numeroHijos<=6)
                    { escolaridad=numeroHijos*escolaridad2;}
                 else if (numeroHijos>6)
                    { escolaridad=numeroHijos*escolaridad2;}
                    
         double sueldoNeto=sueldoBasico+bono;       
        //--------------------------------
         System.out.println("--------------------------------------------------------------------"); 
         System.out.println("Empleado "+nombre+" numero"+i);
         System.out.println("Categoria:"+categoria);
         System.out.println("Bono por categtoria: "+bono);
         System.out.println("Bono de escolaridad: "+escolaridad);
         System.out.println("Sueldo neto de empleado "+i+": "+sueldoNeto);
        System.out.println("--------------------------------------------------------------------");
          i++;  }//Fin While
  
    }
}
