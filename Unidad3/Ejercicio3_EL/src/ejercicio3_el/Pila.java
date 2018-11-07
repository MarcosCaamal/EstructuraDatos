/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3_el;

/**
 *
 * @author Marcos
 * @param <T>
 */
public class Pila<T> {
    //Atributos
    private NodoPila<T> top; //Ultimo nodo que se ha incluido
    private int tamanio;
    
    //Constructores
    public Pila(){
        top = null; //No hay elementos
        this.tamanio = 0;
    }

    //Metodos
    /**
     * Indica si esta vacia o no
     * @return 
     */
    public boolean isEmpty(){
        return top == null;
    }
    
    public int size(){
        return this.tamanio;
    }
    
    public T top(){
        if(isEmpty()){
            return null;
        }else{
            return top.getElemento();
        }
    }
    
    public T pop(){
        if(isEmpty()){
            return null;
        }else{
            T elemento = top.getElemento();
            NodoPila<T> aux = top.getSiguiente();
            top = null;
            top = aux;
            this.tamanio--;
            return elemento;
        }
    }
    
    public T push(T elemento){
        
        NodoPila<T> aux = new NodoPila<>(elemento, top);
        top = aux;
        this.tamanio++;
        return aux.getElemento();
    }
    
    public String toString(){
        
        if(isEmpty()){
            return "La pila esta vacia";
        }else{
            
            String resultado="";
            NodoPila<T> aux = top;
            while(aux!=null){
                resultado += aux.toString();
                aux = aux.getSiguiente();
            }
            
            return resultado;
            
        }
    }
    public void Imprimir(){
    NodoPila aux=top;
    if(isEmpty()){
            System.out.println("La pila esta vacia");}
    while(aux!=null){
        System.out.println(aux.getElemento());
        aux=aux.getSiguiente();
    
    }
    }
}
