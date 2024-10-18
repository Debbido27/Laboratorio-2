
package medina_david_operaciones.algebraicas.java;

import java.util.Scanner;

public class Medina_David_operacionesAlgebraicasJava {

 
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Calculo de expresiones");
        System.out.println("Ingrese el numerador 1: ");
        double numerador1 = entrada.nextDouble();
        
        System.out.println("Ingrese el denominador 1: ");
        double denominador = entrada.nextDouble();
        
        System.out.println("Ingrese el numerador 2: ");
        double numerador2 = entrada.nextDouble();
        
        System.out.println("Ingrese el denominador 2: ");
        double demoninador2 = entrada.nextDouble();
        
        double resultado = (numerador1/denominador)+ (numerador2/demoninador2);
        
        System.out.println("El resultado es : \n"+resultado);
        
        //Ejercicio b
        System.out.println("\n\nEJERCICIO B");
        System.out.println("Ingrese el valor de x: ");
        double xa = entrada.nextDouble();
        
        System.out.println("Ingrese el valor de y: ");
        double ya = entrada.nextDouble();
        
        double resultadob = (1/(xa-5)) - (3*xa*ya/4);
        System.out.println("El resultado de el ejercicio b es: "+resultadob);
          
        
        
        //Ejercicio c
        System.out.println("\n\nEJERCICIO C");
        System.out.println("Ingrese el numerador del la primera fraccion: ");
        double mun1 = entrada.nextDouble();
        
        System.out.println("Ingrese el demoniador de la primera fraccion:");
        double mun2 = entrada.nextDouble();
        
        System.out.println("Ingrese el segundo numero entero: ");
        double mum3= entrada.nextDouble();
        
        double resultadoc= (mun1/mun2)+mum3;
        System.out.println("El resultado del c es: "+resultadoc);
        //Ejercicio d
        System.out.println("\n\nEJERCICIO D");
        System.out.println("Ingerrse el primer numero etnero : ");
        double num1= entrada.nextDouble();
        
        System.out.println("Ingrese el umerador de la segunda fraccion: ");
        double num2= entrada.nextDouble();
        
        System.out.println("Ingrese el denominador de la segunda fraccion: ");
        double den3 =entrada.nextDouble();
        
        
        double resultadod = num1+(num2/den3);
        System.out.println("El resultado es: "+resultadod);
        
       
    }
    
}
