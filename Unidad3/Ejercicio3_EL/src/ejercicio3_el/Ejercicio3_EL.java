/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3_el;

/**
 *
 * @author Marcos
 */
import java.util.Scanner;
public class Ejercicio3_EL {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Lista l=new Lista();
        Scanner teclado = new Scanner(System.in);
        int op, nu;
        String nombre, apellido;
        do{
            System.out.println("1.- Insertar");
            System.out.println("2.- Enlistar Clientes");
            /*System.out.println("3.- Buscar Cliente");*/
            System.out.println("3.- Mostrar Clientes-Regalos");
            System.out.println("4.- Salir");
            System.out.println("Elije tu opcion: ");
            op=teclado.nextInt();
            teclado.nextLine();
            switch(op){
                case 1:
                {   System.out.print("Ingrese el numero de cliente: ");
                    nu=teclado.nextInt();
                    teclado.nextLine();
                    System.out.print("Ingrese su nombre: ");
                    //texto.append(teclado.nextLine());
                    nombre=teclado.nextLine();
                    System.out.print("Ingrese su Numero de telefono: ");
                    apellido=teclado.nextLine();
                    l.insertar(new Persona(nombre, apellido, nu));
                    break;
                }
                case 2:{
                l.mostrar();
                break;
                }
                /*case 3:{
                    System.out.println("Ingrese el valor a buscar: ");
                    nu=teclado.nextInt();
                    l.buscar(nu);
                    break;
                }*/
                case 3:{
                l.AsignarRegalos();
                break;
                }
            
            
            
            }
        
        
        }while(op!=4);
    }
    
}
