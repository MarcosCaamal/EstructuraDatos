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
public class Persona {
    private String aNombre, telefono, Regalo;
    private int aEdad, numero;
    public Persona(String aNombre, String telefono, int numero){
        this.aNombre=aNombre;
        this.telefono=telefono;
        this.numero=numero;
    
    }
    public Persona(String aNombre, String Regalo){
        this.aNombre=aNombre;
        this.Regalo=Regalo;
    }
    @Override
    public String toString(){
    return "Cliente"
            +"\nNumero Cliente: " +getNumero()
            +"\nNombre: "+getaNombre()
            +"\nNumero de telefono: "+getTelefono();
            
    }
    public String toString2(){
    return "Cliente"
            +"\nNombre: "+getaNombre()
            +"\nRegalo: "+getRegalo();
    }
    public String getaNombre(){
        return aNombre;
    }
    public void setaNombre(String aNombre){
        this.aNombre=aNombre;
    }
    public int getNumero(){
        return numero;
    }
    public void setNumero(int numero){
        this.numero=numero;
    }
    public String getTelefono(){
        return telefono;
    }
    public void setTelefono(String telefono){
        this.telefono=telefono;
    }
   /* public int getaEdad(){
        return aEdad;
    }
    public void setaEdad(int aEdad){
        this.aEdad=aEdad;
    }*/
    public String getRegalo(){
        return Regalo;
    }
    public void setRegalo(String Regalo){
        this.Regalo=Regalo;
    }
   
    
    
}
