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
public class Cola <T> {
    private NodoCola<T> primero;
    private NodoCola<T> ultimo;
    private int tamanio;

    public Cola() {
        primero = null;
        ultimo = null;
        tamanio = 0;

    }

    /**
     * Indica si la cola esta vacia
     * @return 
     */
    public boolean isEmpty() {
        return primero == null;
    }

    /**
     * Indica el tamaño de la cola
     * @return 
     */
    public int size() {
        return tamanio;
    }

    /**
     * Devuelve el primer elemento en la cola
     * @return 
     */
    public T primero() {
        if (isEmpty()) {
            return null;
        }

        return primero.getElemento();
    }

    /**
     * Elimina y devuelve el primer elemento de la cola
     * @return 
     */
    public T dequeue() {

        if (isEmpty()) {
            return null;
        }

        T elemento = primero.getElemento();
        NodoCola<T> aux = primero.getSiguiente();
        primero = null;

        primero = aux;
        tamanio--;
        if (isEmpty()) {
            ultimo = null;
        }

        return elemento;
    }

    /**
     * Añade un nuevo elemento a la cola
     * @param elemento
     * @return 
     */
    public T enqueue(T elemento) {

        NodoCola<T> aux = new NodoCola(elemento, null);

        if (isEmpty()) {
            primero = aux;
            ultimo = aux;
        } else {
            if (size() == 1) {
                primero.setSiguiente(aux);
            } else {
                ultimo.setSiguiente(aux);
            }
            ultimo = aux;
        }

        tamanio++;
        return aux.getElemento();

    }

    /**
     * Muestra el contenido
     * @return 
     */
    public String toString() {

        if (isEmpty()) {
            return "La cola esta vacia";
        } else {

            String cadena = "";

            NodoCola<T> aux = primero;
            while (aux != null) {
                cadena += aux;
                aux = aux.getSiguiente();
            }

            return cadena;

        }

    }
    public void LlenarCola (Pila <Integer> pilaN){
        Cola<Integer> colaNumeros=new Cola<>();
        while(!pilaN.isEmpty()==true){
        colaNumeros.enqueue(pilaN.pop());
        }
        System.out.println(colaNumeros);
        pilaN.size();
    }

    
}
