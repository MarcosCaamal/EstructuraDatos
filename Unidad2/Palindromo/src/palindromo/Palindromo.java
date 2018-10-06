
package palindromo;

import java.util.Scanner;
public class Palindromo {

    
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        String palabra;
        System.out.println("Introduzca una palabra");
        palabra=teclado.nextLine();//leemos el texto que introduzca el usuario
        palabra=palabra.replace(" ","");//quitamos los espacios introducidos por el usaurio
        Cadena ob1= new Cadena(palabra);//instaciamos el objeto
        System.out.println(ob1.Respuesta());
    }
    
}
