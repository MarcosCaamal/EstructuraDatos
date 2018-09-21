/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto;

import java.util.ArrayList;
import java.util.Collections;
public class Datos {
    Datos(){
    
    }
    public void Ordenar(ArrayList <String> nom){
       // String []nombres= nom.toArray();
        Collections.sort(nom);//metodo que oredena los nombres del arraylist
        String[] nombres = new String[nom.size()];//creacion de un arreglo string con el tamaño del arraylist
        nombres = nom.toArray(nombres);//Pasamos la lista en el arreglo 
        for (String n: nombres){//for ech para mostrar en pantalla los nombres ordenados
            System.out.println(n);//Imprimimos la lista en forma vertical
        }
    }
    public void Buscar(ArrayList <String> nom, String n)
    {
        if(nom.contains(n))//Con el métdo contains buscamos en la lista si el elemento se encuentra en ella
            System.out.println("El nombre "+n+ " si se encuentra en la lista");
        else 
            System.out.println("El nombre "+n+ " no se encuentra en la lista");
    }
}
