/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema3;

import java.util.Scanner;

/**
 *
 * @author FJTAMATTSH
 */
public class Problema3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Realizar un programa que determine si un alumno ah pasado el año o no 
        Scanner entrada=new Scanner(System.in);
        //Declaracion de las de variables y el tipo de las mismas
        String nota1, nota2, nota3;
        String resultado;
        double nota_1, nota_2, nota_3;
        double promedio;
        System.out.println("Programa que permite determinar si un alumno"
                + " paso o no paso de año ");
        //Ingreso de las 3 notas  usando nextLine()  
        System.out.println("Ingrese nota 1:");
        nota1 = entrada.nextLine();
        System.out.println("Ingrese nota 2:");
        nota2 = entrada.nextLine();
        System.out.println("Ingrese nota 3:");
        nota3 = entrada.nextLine();
        //Transformacion de las variables en texto a numeros 
        nota_1 = Double.parseDouble(nota1);
        nota_2 = Double.parseDouble(nota2);
        nota_3 = Double.parseDouble(nota3);
        //Calculo del promedio de las notas del estudiante 
        promedio = (nota_1 + nota_2 + nota_3) / 3;
        /**Determinacion lógica si el estudainte  ha pasado el año o no 
                                     verdadero : Falso */
        resultado = (promedio > 14)? "Aprobado el año ":"Reprobado el año ";
        //Presentación de datos al usuario
        System.out.println("Su promedio es: " + promedio);
        System.out.println("Usted esta: "+resultado);
        
        
    }
    
}
