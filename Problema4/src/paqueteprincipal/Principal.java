/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paqueteprincipal;
//Importación de los paquetes y sus respectivas clases
import paquete1.MiClase1;
import paquete2.MiClase2;
import paquete3.MiClase3;

/**
 *
 * @author FJTAMATTSH
 */
public class Principal {
    public static void main(String[] args) {
        //Presentacion de los atributos de las clases
       
        System.out.printf("%s\n", "Nombre:");
      //Llamada de la clase2 y su atributo
        System.out.printf("\t%s\n", MiClase2.nombre);
        
        System.out.printf("%s\n", "Apellido:");
        //Llamada de la clase3 y su atributo
        System.out.printf("\t%s\n", MiClase3.apellido);
        
        System.out.printf("%s\n", "Edad:");
        //LLamada de la clase1 y su atributo
        System.out.printf("\t%s\n", MiClase1.edad);
    }
}
