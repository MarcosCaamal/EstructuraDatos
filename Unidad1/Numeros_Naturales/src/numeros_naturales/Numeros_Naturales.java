/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numeros_naturales;

import java.util.Scanner;
public class Numeros_Naturales {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        int n;
        int opcion;
        do{
           System.out.println("1.- Cero");
           System.out.println("2.- Sucesor");
           System.out.println("3.- Es cero");
           System.out.println("4.- Igual");
           System.out.println("5.- Suma");
           System.out.println("6.- Antecesor");
           System.out.println("7.- Diferencia");
           System.out.println("8.- Menor");
           System.out.println("Elige una opcion");
           opcion = teclado.nextInt();
           System.out.println("Ingrese un numero natural");
           n=teclado.nextInt();
           Operaciones ob1=new Operaciones(n);
           if(opcion == 1){
                System.out.println(ob1.Cero());
                    
           }
           else if(opcion==2){
               System.out.println("El numero sucesor de " +n+ " es: " + ob1.Sucesor());
           }
           else if (opcion==3){
               System.out.println(ob1.Escero());
           }
           else if (opcion==4){
               int a;
               System.out.println("Ingrese un nuevo numero");
               a=teclado.nextInt();
               System.out.println("El numero " + n + ob1.Igual(a) + "  a "+ a );
           }
           else if (opcion==5){
               int b;
               System.out.println("Ingrese un numero ");
               b=teclado.nextInt();
               System.out.println("La suma de los numeros es "+ ob1.Suma(b));
           }
           else if (opcion==6){
                System.out.println("El numero antecesor de "+n+" es: " + ob1.Antecesor());
           }
           else if (opcion==7){
               int c;
               System.out.println("Ingrese un nuevo numero");
               c=teclado.nextInt();
               System.out.println("La diferencia de los numeros ingresados es: " + ob1.Diferencia(c));
           }
           else if (opcion==8){
               int d;
               System.out.println("Ingrese un nuevo numero");
               d=teclado.nextInt();
               System.out.println("El numero  : " + n + ob1.Menor(d)+ " a " + d);
           }
        }while(opcion!=9);
        
    }
    
}
