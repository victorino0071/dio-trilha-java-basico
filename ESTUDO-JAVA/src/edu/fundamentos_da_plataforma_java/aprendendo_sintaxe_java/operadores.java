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
        

        //operadores lógicos "e" e "ou"
        boolean condicao1 = true;

        boolean condicao2 = false;
        
        if (condicao1 && condicao2){
            System.err.println("Ambas as condições são verdadeiras");
        }

        if (condicao1 || condicao2){
            System.out.println("Uma das condições é verdadeira");
        }

        if (condicao1 && (a == b)){
            System.out.println("Primeira condição verdadeira e 'a' é igual a 'b'");
        }
    }
    
}
