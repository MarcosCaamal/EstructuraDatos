
package ahorcado_ed;

import java.util.Arrays;
import java.util.Scanner;
public class Metodos {
    char cadena[];
    char cadenaJuego[];
    char intento;
    int posicion;
    String[] palabra;
    Metodos(){}//Constructor
    public char[] getCadena() {
        return cadena;
    }

    public char[] getCadenaJuego() {
        return cadenaJuego;
    }
    
    public void Cadena(String[] palabras, int tamaño){
        this.palabra= palabras;//Guarda las palabras en un arreglo
        this.posicion=tamaño;//Guarda la posicion en el arreglo en donde se encuentra la palabra a adivinar
        cadena = palabras[tamaño].toCharArray(); //Metodo para convertir un String en un Char.
        cadenaJuego = palabras[tamaño].toCharArray();
    }
    
    public void OcultarCadena(){
        for(int i = 0; i< cadenaJuego.length; i++){ //Oculta la palabra.
            cadenaJuego[i] = '*';
        }
        System.out.println("Adivina la palabra " + Arrays.toString(cadenaJuego));
    }
    
    public void Juego(Scanner en, int i){
        System.out.print(i + " -Intento: ");
        intento = en.next().charAt(0);
          for(int x = 0; x < cadena.length ;x++){ //Verificacion de la letra ingresada por el usuario con la palabra escondida.
                if(cadena[x]==intento){
                 cadenaJuego[x] = intento;
                }
           } 
    }
    
    public void Verificacion(int i){
         if(Arrays.equals(cadena, cadenaJuego)){
                System.out.println("\nFelicidades has adivinado la palabra: "+palabra[posicion]);
                 System.exit(0); //Finaliza el programa.
            }else if(i==8){
                System.out.println("\nLo siento. ¡Haz perdido!. No pudiste adivinar la palabra: "+palabra[posicion]);
                System.exit(0); //Finaliza un programa.
          }
    }
}
