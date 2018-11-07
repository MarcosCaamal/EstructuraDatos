/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pila_cola;

/**
 *
 * @author marco
 */
import java.util.Scanner;
public class Pila_Cola {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Pila <Integer> pilaNumeros= new Pila<>();
        Scanner xd=new Scanner (System.in);
        int n;
        System.out.print("Cuantos numeros desea ingresar a la pila: ");
        int cantidad=xd.nextInt();
        if(cantidad>0)
            System.out.println("Ingrese los valores de la pila:");
        for(int i=0; i<cantidad; i++){
            n=xd.nextInt();
            pilaNumeros.push(n);//llenando la pila
        }
        System.out.println("Pila ingresada: ");
        pilaNumeros.Imprimir();
        pilaNumeros.buscar(5);
        Cola c=new Cola();
        System.out.println("Imprimiendo cola:");
        c.LlenarCola(pilaNumeros);
        
        
    }
    
}
