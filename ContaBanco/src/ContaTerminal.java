import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        
        Scanner scan = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Por favor, digite o seu nome: ");
        String nome = scan.next();

        System.out.println("Por favor, digite o sua agencia: ");
        String agencia = scan.next();

        System.out.println("Por favor, digite o seu número: ");
        int numero = scan.nextInt();

        System.out.println("Por favor, digite o seu saldo: ");
        Double saldo = scan.nextDouble();

        System.out.println("");

        System.out.println(
            "Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta "+ numero +" e seu saldo "+ saldo +" já está disponível para saque"
            );


    }
}
