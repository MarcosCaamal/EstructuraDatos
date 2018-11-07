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
public class Lista {
    private Nodo inicio;
    private Nodo fin;
    
    public Lista(){
    inicio=null;
    fin=null;
    }
    public boolean estaVacia(){
    if (inicio==null){
        return true;
    }
    else
        return false;
    }
    public void insertar(Persona persona){
    Nodo actual;
    if (estaVacia())
    {
        actual=new Nodo(persona, null);
        inicio=actual;
        fin=actual;
    }
    else
    {
        actual=new Nodo(persona, null);
        fin.setSiguiente(actual);
        fin=actual;
    }
   }
    public void mostrar(){
    if(estaVacia())
    {
        System.out.println("La lista esta vacia");

    }else{
        Nodo temporal;
        temporal=inicio;
        while(temporal!=null){
            System.out.println(temporal.getDato().toString());
            temporal=temporal.getSiguiente();
        }
    
    }
    
    }
    public void mostrarRegalos(){
    if(estaVacia())
    {
        System.out.println("La lista esta vacia");

    }else{
        Nodo temporal;
        temporal=inicio;
        while(temporal!=null){
            System.out.println(temporal.getDato().toString2());
            temporal=temporal.getSiguiente();
        }
    
    }
    
    }
    
    public void buscar(int numero)
    {
    if(estaVacia())
    {
        System.out.println("La lista esta vacia");

    }else{
        Nodo temporal;
        temporal=inicio;
        while(temporal!=null){
            if (numero==temporal.getDato().getNumero()){
             System.out.println(temporal.getDato().toString());
             break;
            }
          
            temporal=temporal.getSiguiente();
        }
    
    }
    
    }
    public void AsignarRegalos()
    {
        Pila<String> pila=new Pila();
        pila.push("Pastel");
        pila.push("Tableta");
        pila.push("Laptop");
        pila.push("Estufa");
        pila.push("Refigerador");
        pila.push("Microondas");
        pila.push("Smartphone");
        pila.push("Libreta");
        pila.push("Coche");
        pila.push("Motocicleta");
        Lista l2=new Lista();
        Nodo temporal;
        Nodo aux=inicio;
        temporal=inicio;
        while(aux!=null){
              while(temporal!=null){
                  if (aux.getDato().getaNombre().equals(temporal.getDato().getaNombre())){
                    if(l2.lista2(aux.getDato().getaNombre())){
                        if(!pila.isEmpty()==true){
                          l2.insertar(new Persona(aux.getDato().getaNombre(),pila.pop()));
                        }
                        else
                            l2.insertar(new Persona(aux.getDato().getaNombre(), "No obtuvo regalo"));

                    }
                         
                    break;
                  }

                  temporal=temporal.getSiguiente();
                }
                aux=aux.getSiguiente();

       }
            l2.mostrarRegalos();
        
    }
    public boolean lista2(String nombre){
        Nodo aux=inicio;
        while(aux!=null){
            if(nombre.equals(aux.getDato().getaNombre())){
                return false;
            }
            aux=aux.getSiguiente();
        }
        return true;
    }
    
}
