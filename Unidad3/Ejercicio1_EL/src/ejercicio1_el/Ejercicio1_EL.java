/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1_el;

/**
 *
 * @author Marcos
 */
import java.util.Scanner;
public class Ejercicio1_EL {

   
    public static void main(String[] args) {
        Scanner xd=new Scanner (System.in);
        String linea;
        System.out.println("Ingrese una linea de texto:");
        linea=xd.nextLine();
        linea.trim();//eleiminamos espacios del inicio y del fin en caso de que los haya
        char letras[]=linea.toCharArray();
        Pila pila=new Pila();
        for (int i=0; i<letras.length; i++){
            pila.push(letras[i]);
        }
        System.out.println("");
        System.out.println("Imprimiendo la linea de texto de forma inversa con una PILA:");
        pila.Imprimir();
        System.out.println("");
        
    }
    
}
