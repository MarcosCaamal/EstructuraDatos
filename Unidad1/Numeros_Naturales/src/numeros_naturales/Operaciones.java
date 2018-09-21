/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numeros_naturales;

/**
 *
 * @author Marcos
 */
 class Operaciones {
    int numero;
    Operaciones(int n){
    this.numero=n;
}
    int Cero(){
        numero=0;
    return numero;
    }
    int Sucesor()
    {
        numero++;
        return numero;
    }
    int Antecesor(){
        numero--;
        return numero;
    }
   String Escero()
   {
       String r;
       if (numero==0)
           r=" Es cero";
       else 
           r=" No es cero";
       return r;
   }
   String Igual(int n)
   {
       String r;
       if (numero==n)
           r=" Es igual ";
       else
           r=" No es igual ";
       return r;
   }
   int Suma(int n){
       int r;
       r=numero+n;
       return r;
   }
   String Menor(int n){
       String r;
       if (numero<n){
           r=" Es menor ";
       }
       else if (numero> n)
       {
           r=" Es mayor";
       }
       else 
           r=" Es igual";
       return r;
   }
   int Diferencia(int n){
       int r;
       r=numero-n;
       return r;
   }
 }
