
package medina_david_planillaempleado.java;
import java.util.Scanner;

public class Medina_David_PlanillaempleadoJava {

 /**
EJERCICIO 1
*/
    
    public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
   
    
        System.out.println("----- Boleta del Empleado -------");
        System.out.print("Nombre del Empleado: ");
        String empleado = entrada.nextLine();
        
        System.out.print("\nHora de Trabajo Mensual: ");
        int horatrabajo= entrada.nextInt();
        
        System.out.print("\nTarifa por Hora : Lps. ");
        int tarifa= entrada.nextInt();
        
        int salario = (horatrabajo*tarifa);
        int semanal = (salario/4);
        
        System.out.println("Salario del Empleado:" +empleado +"\nSemanal: Lps. "+semanal+"\nMensual: Lps"+salario);
        
    }
    
}
    
    

