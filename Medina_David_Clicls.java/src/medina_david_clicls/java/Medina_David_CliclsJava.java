
package medina_david_clicls.java;

import java.util.Scanner;

public class Medina_David_CliclsJava {

    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Ingrese la cantidad de clicks 1: ");
        int click = entrada.nextInt();
        double costoclick1 = 0.30;
        
        System.out.println("Ingrese la cantidad de clicks 2: ");
        int clickd = entrada.nextInt();
        double costoClickd = 0.25;
        
        System.out.println("Ingrese la cantidad de clicks 3: ");
        int clickt = entrada.nextInt();
        double costoclickt = 0.80;
        
        double totalclicks= (click * costoclick1)+(clickd*costoClickd)+(clickt *costoclickt);
        
        int totalcanclick = click + clickd +clickt;
        
        double costop = totalclicks/totalcanclick;
        
        double isv= totalclicks * 0.16;
        
        double totalconisv= totalclicks + isv;
        
        System.out.println("**VALOR TOTAL**");
        System.out.println("Costo promedio por click "+costop);
        System.out.println("Total sin isv: "+totalclicks);
        System.out.println("Total con isv: "+totalconisv);
        
    }
    
}
