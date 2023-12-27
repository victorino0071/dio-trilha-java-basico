package edu.fundamentos_da_plataforma_java.aprendendo_sintaxe_java;

public class operadores {
    public static void main (String [] args){

        
        String nomeCompleto = "Victor " + "Emmanuel";

        System.out.println(nomeCompleto);

        int numero = 5;
        numero = - numero;

        System.out.println( - numero);
        System.out.println( numero);
        
        //x repetição
        numero = numero * -1;
        //numero = numero + 1 é igual a numero++;
        numero ++;


        System.out.println(numero);

        //Condição usando "? e :"
        int a, b;
        a = 6;
        b = 6;

        //É o mesmo que usar "if" e "else"
        String resultado = a==b ? "verdadeiro" : "falso";

        System.out.println(resultado);



    }
    
}
