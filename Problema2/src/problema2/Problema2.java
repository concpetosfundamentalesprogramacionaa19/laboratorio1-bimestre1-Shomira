/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema2;

import java.util.Scanner;

/**
 *
 * @author Salas
 */
public class Problema2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /**Realizar un programa que ingrese 3 variables y realice una 
        operacion determinada donde se encuentre el resultado de la variable m*/
        
        //Ingreso por teclado de las variables: x,y,z (usando nextLine()).
        Scanner entrada=new Scanner(System.in);
        System.out.println("Ingrese un valor para la variable x ");
        String variableX = entrada.nextLine();
        
        System.out.println("Ingrese un valor para la variable y ");
        String variableY = entrada.nextLine();
        
        System.out.println("Ingrese un valor para la variable z ");
        String variableZ = entrada.nextLine();
        // Transformacion de las variables que se encuentran en texto a numeros
        double variableXd = Double.parseDouble(variableX);
        double variableYd = Double.parseDouble(variableY);
        double variableZd = Double.parseDouble(variableZ);
        //Calculo de la operacion para determinar el valor de la variable m
        double resultado = (variableXd+(variableYd/variableZd))/
                (variableXd-(variableYd/variableZd));
        //Salida de datos con los respectivas identaciones
        System.out.printf("El valor de m, en base a las variables :\n"
                +"x=%s\n y=%s\n  z= %s\nDa como resultado: "
                + "\n m=%s",variableX, variableY, variableZ, resultado);
        
        
        
        
    }      
}
