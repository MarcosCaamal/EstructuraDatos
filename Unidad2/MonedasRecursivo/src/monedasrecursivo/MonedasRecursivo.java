/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package monedasrecursivo;

import java.util.Scanner;
public class MonedasRecursivo {

    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        int precio, pago;
        System.out.print("Ingrese el total (precio) a pagar: ");
        precio=teclado.nextInt();
        System.out.print("¿Cuanto dinero va a pagar?: ");
        pago=teclado.nextInt();
        int cambio=pago-precio;
        Producto ob1=new Producto();
        ob1.Cambio(cambio);
        
    }
    
}
