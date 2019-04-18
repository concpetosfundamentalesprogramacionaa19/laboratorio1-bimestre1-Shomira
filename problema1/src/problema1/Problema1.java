/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema1;

import java.util.Scanner;

/**
 *
 * @author Salas
 */
public class Problema1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        // Entrada de datos del trabajador, costo por hora y horas trabajadas 
        System.out.println("Ingrese el nombre del trabajador o trabajadora: ");
        String nombre = entrada.nextLine();
        
        System.out.println("Ingrese el costo de cada hora: ");
        double costoHora = entrada.nextDouble();
        
        System.out.println("Ingrese el nùmero de horas trabajadas: ");
        double horas = entrada.nextDouble();
        // calculo del sueldo horas trabajadas por el costo de cada una 
        double sueldoTotal = (horas * costoHora);
        // Calculo del 10% que aporte al seguro
        double seguro = (sueldoTotal*0.10);
        // determinacion del sueldo total restando su seguro 
        sueldoTotal= (sueldoTotal - seguro);
        // salida de datos con el Sueldo total del trabajador 
        System.out.printf("El sueldo del trabajad@r %s es : %s $ "
                ,nombre, sueldoTotal);
    }
    
}
