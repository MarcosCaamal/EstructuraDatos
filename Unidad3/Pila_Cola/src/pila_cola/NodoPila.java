/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pila_cola;

/**
 *
 * @author marco
 * @param <T>
 */
public class NodoPila<T> {
    //Atributos
    private T elemento;
    private NodoPila<T> siguiente; //Apunta al siguiente nodo
    
    //Contructor
    public NodoPila(T elemento, NodoPila<T> siguiente){
        this.elemento = elemento;
        this.siguiente = siguiente;
    }

    //Metodos
    public T getElemento() {
        return elemento;
    }

    public void setElemento(T elemento) {
        this.elemento = elemento;
    }

    public NodoPila<T> getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoPila<T> siguiente) {
        this.siguiente = siguiente;
    }

    @Override
    public String toString() {
        return elemento+"\n";
    }
    
}
