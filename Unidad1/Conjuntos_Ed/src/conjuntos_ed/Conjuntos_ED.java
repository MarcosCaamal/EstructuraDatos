
package conjuntos_ed;

/*Autor: Marcos Abraham Caamal Tzuc
Fecha: 16/09/2018
Programa que realiza metodos con conjuntos
 */
import java.util.ArrayList;
import java.util.Scanner;
public class Conjuntos_ED {

  
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        ArrayList <Integer> ConjuntoA = new ArrayList();//creamos el primer conjuto y lo llenamos manualmente
        ConjuntoA.add(9);
        ConjuntoA.add(8);
        ConjuntoA.add(5);
        ConjuntoA.add(3);
        ConjuntoA.add(4);
        ConjuntoA.add(2);
        ConjuntoA.add(10);
        ArrayList <Integer> ConjuntoB = new ArrayList();//creamos el segundo conjunto y lo llenamos manualmente
        ConjuntoB.add(2);
        ConjuntoB.add(4);
        ConjuntoB.add(7);
        ConjuntoB.add(10);
        ConjuntoB.add(8);
        ConjuntoB.add(9);
        int opcion;
        do {
            Operaciones ob = new Operaciones();
            System.out.println("1.- Conjunto Vacio");
            System.out.println("2.- Es Vacio");
            System.out.println("3.- Agregar");
            System.out.println("4.- Eliminar elemento");
            System.out.println("5.- Buscar elemento");
            System.out.println("6.- Interseccion");
            System.out.println("7.- Diferencia");
            System.out.println("8.- Union");
            System.out.println("9.- Salir"); 
            System.out.print("Eliga una Opcion :");
            opcion = teclado.nextInt();
                if (opcion==1){
                    System.out.println(ConjuntoA);
                    ob.ConjuntoVacio(ConjuntoA);
                    System.out.println("");
                }
                else if(opcion ==2){ 
                    System.out.println(ConjuntoA);
                    ob.EsVacio(ConjuntoA);
                    System.out.println("");
                }else if(opcion==3){
                    System.out.println(ConjuntoA);
                    ob.Agregar(ConjuntoA);
                    System.out.println("");
                }else if(opcion ==4){
                        ob.Eliminar(ConjuntoA);
                        System.out.println("");
                }else if(opcion==5){
                    int z;
                    System.out.println(ConjuntoA);
                    System.out.println("Ingrese el numero a buscar: ");
                    z=teclado.nextInt();//elemento a buscar en el arreglo
                        ob.Buscar(ConjuntoA,z);
                        System.out.println("");
                }else if(opcion==6){
                        ob.Interseccion(ConjuntoA, ConjuntoB);
                        System.out.println("");
                }else if(opcion==7){
                        ob.Diferencia(ConjuntoA, ConjuntoB);
                        System.out.println("");
                }else if(opcion==8){
                        ob.Union(ConjuntoA,ConjuntoB);
                        System.out.println("");
                }else if(opcion==9){
                    System.out.println("El programa termino con exito"); 
                }
        }while(opcion!=9);
    
    }
}
