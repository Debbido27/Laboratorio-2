
package medina_david_cuotas.java;

import java.util.Scanner;

/**

 */

public class Medina_David_CuotasJava {

    /**
     el tamano del prestamos y los intereses son ingresados por el usuario
     */
    public static void main(String[] args) {
        Scanner entrada= new Scanner(System.in);
        
        System.out.println("---------Calculadora de cuotas mensuales--------");
        
        System.out.println("Ingrese el monto del prestamo:  ");
        double monto = entrada.nextDouble();
        
        System.out.println("Ingrese la duracion del prestamo en meses:  ");
        int duracion = entrada.nextInt();
        
        System.out.println("Ingrese el interes mensual del prestamo: ");
        double interes = entrada.nextDouble();
        
        System.out.println("Ingrese la comision mensual del prestamo:  ");
        double comision = entrada.nextDouble();
        
        
        System.out.println("Ingrese el seguro del prestamo:  ");
        double seguro  = entrada.nextDouble();
        
        double interesmensual = monto*(interes/100);
        double seguromensual = monto*(seguro/100);
   
        double cuotamensual = (monto/duracion)+interesmensual+comision+seguro;
        double totall = cuotamensual*duracion;
        
        System.out.println("****CUOTAS MENSUALES*****");
        System.out.println("Cuota pago mensual: "+cuotamensual);
        System.out.println("Total a pagar: "+totall);
    }
    
}
