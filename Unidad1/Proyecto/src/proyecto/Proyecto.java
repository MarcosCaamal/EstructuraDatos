
package proyecto;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner; 
public class Proyecto {
/*Autores:
    Caamal Tzuc Marcos Abraham 
    Calvrio Lopez Marcos 
    Diaz cupul Lili Mercedes 
    Xooc Balam Ingrid Lisset 
    */
    
    public static void main(String[] args) {
    int opcion;//variable para eligir la opcion de un menu
    Datos obj= new Datos();//instanciasion de un objeto
    Scanner teclado=new Scanner(System.in);
    ArrayList<String> Nombres = new ArrayList();//Creacion de un arreglo dinamico para guardar los noombres del archivo
    try {//try que maneja las excepciones de la elctura del archivo
         try (FileReader fr = new FileReader("Nombres.txt")) {//leeamos el archivo 
             BufferedReader br = new BufferedReader(fr);//se crea un buffer del tamaño del archivo
             
             String linea;//variable donde se guardaran los nombres linea por linea
             while((linea = br.readLine()) != null)
             {
                 Nombres.add(linea);//se guardarn todos los nombres del arhivo dentro del arreglo
             }
             fr.close();//Cerrramos nuestro archivo de texto         
         }
    }
    catch(Exception e) {//Captura la exeception de que no exista  el archivo que se lea
      System.out.println("El archivo no existe");
      
    }
   
    do{
        System.out.println("Bienvenido");
        System.out.println("1-Ordenar lista");
        System.out.println("2-Buscar nombre");
        System.out.println("3.-Salir");
        System.out.print("Elige una opcion: ");//El usuario ingresa un valor del 1 al 3 dependiendo de lo que elija
        opcion=teclado.nextInt();
        if(opcion==1)
        {
             obj.Ordenar(Nombres);
             System.out.println("");
        }
        else if(opcion==2)
        {
            String nom;
            System.out.print("Ingrese el nombre que desee buscar: ");
            nom=teclado.next();
            obj.Buscar(Nombres, nom);
            System.out.println("");
        }
             
     }while(opcion!=3);
   
    }
    
}
