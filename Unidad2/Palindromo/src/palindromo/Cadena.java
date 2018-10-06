
package palindromo;

public class Cadena {
    String palabra;//variable para la palabra ingresada
    Cadena(String p){//constructor
        this.palabra=p;
    }
    public  boolean ComprobarPalindromo(String p)
    {
        if(p.length() == 1)//si la palabra contiene un caracter es palindromo
            return true; 
        else if(p.charAt(0) == p.charAt(p.length()-1))//si la primera y ultima letra de la palabra es igual
            return ComprobarPalindromo(p.substring(1, p.length()-1));
            //se llama la funcion de manera recursiva mandanle la palabra de nueva cuenta a la funcion
            //pero le exluimos la primera y ultima letra con el metodo substring
            //de esta forma volvemos a comparar la letra inicial y final de la palabra sin que se repitan las letras
        return false;//en caso de que no sea palindromo
    }

    public String Respuesta(){
        if (palabra.equals(""))//en caso de que el usuario no haya ingresado una palabra
            return "No escribio nada";
        else{
        boolean r=ComprobarPalindromo(palabra); //llamamos a la funcion recursiva y le mandamos la palabra
        if(r==true)
            return "La palabra o frase es Palindromo";
        else
            return "La palabra o frase no es Palindromo";
        }
    }
    
}
