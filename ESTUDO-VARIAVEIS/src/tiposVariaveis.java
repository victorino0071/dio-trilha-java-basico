public class tiposVariaveis {
    public static void main(String[] args) throws Exception {
        //O "." representa uma virgula, ou seja, padrão americano
        double salarioMinimo = 2500;
        salarioMinimo = 2.500;

        short numeroCurto = 1;
        int numeroNormal = numeroCurto;
        //short numeroCurto2 = (short) numeroNormal;

        int numero = 5;
        numero = 10;

        System.out.println(numero);

        //Variaveis com CAPS_LOCK devem ser constantes, o valor não pode mudar.
        final double NUMERO_PI = 3.14;
        //NUMERO_PI = 10.25;

        System.out.println(NUMERO_PI);

    }
}
