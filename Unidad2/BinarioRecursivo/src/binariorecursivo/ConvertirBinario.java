
package binariorecursivo;
/*Autor: Marcos Abraham Caamal Tzuc*/

public class ConvertirBinario {
    ConvertirBinario(){
    }
    int Conversor(int num){
    if(num<2)
        return num;
    //else if(num%2!=1)
    else
        return num%2+Conversor(num/2)*10;
    
    
   // return r;
    }
}
