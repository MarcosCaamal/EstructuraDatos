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
public class Nodo {
    private Nodo siguiente;
    private Persona dato;
    public Nodo(Persona dato, Nodo siguiente){
    this.siguiente=siguiente;
    this.dato=dato;
    }
    public Nodo getSiguiente(){
    return siguiente;
    }
    public void setSiguiente(Nodo siguiente){
    this.siguiente=siguiente;
    }
    public Persona getDato(){
        return dato;
    }
    public void setDato(Persona dato){
    this.dato=dato;
}
}
