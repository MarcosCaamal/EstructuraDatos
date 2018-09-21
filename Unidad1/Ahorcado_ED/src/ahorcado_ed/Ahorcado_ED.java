
package ahorcado_ed;

/*Autor: Marcos Abraham Caamal Tzuc
Fecha: 16/09/2018
 */
import java.util.Scanner;
import java.util.Random;
public class Ahorcado_ED {

    public static void main(String[] args) {
       Scanner entrada = new Scanner(System.in);
       Random num = new Random(); //Numero ramdom.
       String[] palabras = {"casa","pelota","manzana","pera", "cancion", "exceso", "ahorcado", "lapiz", "oso"}; //Arreglo de palabras.
       int n_azar = num.nextInt(palabras.length); //Convercion variable  en integer.
       Metodos ob1 = new Metodos(); 
       //Llamada de los metodos del objeto
       ob1.Cadena(palabras, n_azar); //Convierte la cadena string a char.
       ob1.OcultarCadena(); //Oculta la palabra.
       System.out.println("¡Bienvenido! Al juego del ahoracado");
        System.out.println("¡Tienes 8 intentos! para adividar la palabra");
       for(int i = 1; i <= 8; i++){
           ob1.Juego(entrada, i);
           ob1.Verificacion(i);
           System.out.println(ob1.getCadenaJuego()); 
       }
    }
    
}
