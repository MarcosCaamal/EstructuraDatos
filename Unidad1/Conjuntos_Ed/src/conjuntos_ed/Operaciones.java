
package conjuntos_ed;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
public class Operaciones {
    Operaciones(){//constructor 
        
    }
    public void ConjuntoVacio(ArrayList <Integer> CA){//Inicia metodo
            ArrayList <Integer> CV=new ArrayList();
            CV.addAll(CA);//Creamos una copia del conjunto a eliminar
            CV.clear();//Limpiamos todo el conjunto lo vaciamos
            System.out.println("El conjunto A = "+CV);
    }//termina metodo
    public void EsVacio(ArrayList <Integer> CA){
        boolean Vacio = CA.isEmpty();// retorna verdarero en caso de que el conjuto sea vacio
      if (Vacio == true) {// comprueba si el conjunto es vacio
         System.out.println("Este Conjunto no contiene elementos");
      } else {
         System.out.println("Este Conjunto si contiene elementos");
      }
    }
   public  void Union(ArrayList <Integer> CA, ArrayList <Integer> CB){// empieza el metodo Union
        List <Integer> CN = new ArrayList <Integer>();
         System.out.println("El conjunto A es: "+CA);
         System.out.println("El conjunto B es: "+CB);
         CN.addAll(CA);//agregamos todos los valores de del conjunto A al nuevo conjuto
         CN.addAll(CB);//agregamos todos los valores del conjunto B al nuevo conjuto
         HashSet<Integer> hashSet = new HashSet<Integer>(CN);//guarda todos los elementos que contiene el arreglo pero sin tomar en cuenta los repetidos
		CN.clear();//limpia el arreglo
		CN.addAll(hashSet);//añade los elementos 
         
         System.out.println("La union es: "+ CN);
        
   }//Fin del metodo Union
   
    public  void Agregar(ArrayList <Integer> CA){//Inicia Metodo Agregar
        Scanner teclado = new Scanner (System.in);
          System.out.println("Desea Agregar un nuevo numero S/N");
        char res=teclado.next().charAt(0);
        //Inicia if
        if (res=='S' || res=='s'){
            int x;
            System.out.println("Ingrese el nuevo valor: ");
            x=teclado.nextInt();
            CA.add(6,x);//Señalamos la posicion y el nuevo elemento que estara en el arreglo
            System.out.println("EL arreglo A con el nuevo elemento es : "+CA);
        }else if(res=='N' || res=='n'){
            System.out.println("Eiga otra opcion ");
            
        }//Termina if     
    }//Termina el metodo agregar
    
   public void Buscar(ArrayList <Integer> CA, int z){
       if(CA.contains(z))
           System.out.println("El numero ingresado "+z+ " si se encuentra en el conjunto");
       else 
           System.out.println("El numero ingresado "+z+ " no se encuentra en el conjunto");
   } 
    
   public  void Interseccion(ArrayList <Integer> CA, ArrayList <Integer>CB){
         ArrayList <Integer> Conjc= new ArrayList ();
         System.out.println("El conjunto A es: "+CA);
         System.out.println("El conjunto B es: "+CB);
    for(int i=0; i<CA.size(); i++)
    {
        if (CB.contains(CA.get(i)))//en caaso de que el conjunto B tenga los valores del Conjunto A
            {
                Conjc.add(CA.get(i));//Agrega los valores de la interseccion
            }
                
    }
       Collections.sort(Conjc);
       System.out.println("La intersección de AnB es: "+Conjc);
 }   
   public  void Eliminar(ArrayList <Integer>CA){
    Scanner teclado= new Scanner (System.in);
        System.out.println("¿Desea eliminar algun numero del arreglo? S/N");
        char respuesta=teclado.next().charAt(0);
        
        if (respuesta=='S' || respuesta=='s'){
            System.out.println("Los valores que tiene actualmente el Conjunto son: ");
            System.out.println(CA);
         int num, cont=0;
         System.out.println("¿Que valor desea eliminar?");//pide el numero a eliminar
         num=teclado.nextInt();
         for (int i=0; i<CA.size();i++){
        
           if (num==CA.get(i)){//comprueba la posicion en la que sse encuetra el numero que sse desea eliminar
              CA.remove(i); // borra el valor ingresado por el usuario
           }else{
           cont++;//contador para controlar si el valor ingresado por el usuario no se encuentra en el arreglo
           }
        }
           if(cont>0){//si no se encuentra el valor a eliminar manda el siguiente mensaje
               System.out.println("El numero que usted ha ingresado no se encuentra en el conjunto");
           }
         System.out.println("El nuevo Conjunto es: "+ CA);
         //cont=0;
         
   }else if (respuesta=='N' || respuesta=='n'){
        System.out.println("¡Has elegido no borrar ningun elemento! ");
   }
        
   }
   public  void Diferencia(ArrayList <Integer> CA, ArrayList <Integer>CB){
         ArrayList <Integer> Conjc= new ArrayList();
         System.out.println("El conjunto A es: "+CA);
         System.out.println("El conjunto B es: "+CB);
    for(int i=0; i<CA.size(); i++)
    {
            if (!CB.contains(CA.get(i)))//Cuando los valores del Conjunto B no estan en A
            {
                Conjc.add(CA.get(i));//Agrega los valores de la diferencia al nuevo conjunto
            }	 	
                
    }
       System.out.println("La Diferencia de A-B es: "+Conjc);
 } 
    
    
    
    
    
}
