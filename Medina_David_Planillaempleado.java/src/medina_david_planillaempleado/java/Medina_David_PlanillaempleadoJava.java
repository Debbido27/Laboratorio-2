
package medina_david_planillaempleado.java;
import java.util.Scanner;

public class Medina_David_PlanillaempleadoJava {

 /**
Planilla de Empleado: se requiere un algoritmo para elaborar una parte de la planilla de un empleado. Para ello se dispone de sus horas laboradas en el mes, así como la tarifa por hora, al conocer estas informaciones de horas y el precio por hora, son asignadas por el usuario, para lograr obtener el salario del empleado semanal.  Los valores deben ser ingresados desde el teclado, asi como horas trabajadas, tarifa por hora y el nombre completo del empleado(usar next( ), en donde, debe aceptar espacios en blanco) . 
----- Boleta del Empleado -------
Nombre del Empleado: " "
Hora de Trabajo Mensual: ##
Tarifa por Hora : Lps. ##.##
Salario del Empleado Semanal: Lps. ##.##
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
    
    

