
package binariorecursivo;
import java.util.Scanner;
public class BinarioRecursivo {

    
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        int numero;
        System.out.print("Ingrese un numero decicmal: ");
        numero=teclado.nextInt();
        ConvertirBinario ob1=new ConvertirBinario();
        System.out.println(ob1.Conversor(numero));
    }
    
}
