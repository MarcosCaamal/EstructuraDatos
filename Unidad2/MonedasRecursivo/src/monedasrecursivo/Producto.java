/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package monedasrecursivo;

/**
 *
 * @author Marcos
 */
public class Producto {
    Producto(){}
    int []CalcularCambio(int [] cal,int c){
        if(c==0){
            return cal;
        }
        else if(c>=200){
            cal[7]++;
            return CalcularCambio(cal, c-200);
        }
        else if(c>=100){
            cal[6]++;
            return CalcularCambio(cal, c-100);
        }
        else if(c>=50){
            cal[5]++;
            return CalcularCambio(cal, c-50);
        }
        else if(c>=20){
            cal[4]++;
            return CalcularCambio(cal, c-20);
        }
        else if(c>=10){
            cal[3]++;
            return CalcularCambio(cal, c-10);
        }
        else if(c>=5){
            cal[2]++;
            return CalcularCambio(cal, c-5);
        }
        else if(c>=2){
            cal[1]++;
            return CalcularCambio(cal, c-2);
        }
        else{
            cal[0]++;
            return CalcularCambio(cal, c-1);
        }
    }
    public void Cambio(int c){
    int [] calcular=new int[8];
    CalcularCambio(calcular, c);
    if(c>0){
        System.out.println("Su cambio es de $"+c+". Se divide en: ");
        if(calcular[7]>0)
                System.out.println("Billetes de 200: "+calcular[7]);
        if(calcular[6]>0)
                System.out.println("Billetes de 100: "+calcular[6]);
        if(calcular[5]>0)
                System.out.println("Billetes de 50: "+calcular[5]);
        if(calcular[4]>0)
                System.out.println("Billetes de 20: "+calcular[4]);
        if(calcular[3]>0)
                System.out.println("Monedas de 10: "+calcular[3]);
        if(calcular[2]>0)
                System.out.println("Monedas de 5: "+calcular[2]);
        if(calcular[1]>0)
                System.out.println("Monedas de 2: "+calcular[1]);
        if(calcular[0]>0)
                System.out.println("Monedas de 1: "+calcular[0]);
    }
    else
            System.out.println("Usted no tiene cambio");
    
    
    }
    
    
    
}
