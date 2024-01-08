import java.util.Scanner;
import java.util.Locale;
import java.util.concurrent.ThreadLocalRandom;

public class Case1 {
    public static void main(String[] args) throws Exception {

    }

        static void selecaoCandidatos(){
            String candidatos[] = {"LUCIANA","VICTOR","GUSTAVO","NATHAN","SIRINO", "LUCILENE", "KAINA", "ANGELA", "CLAYTON"};
            int candidatoAtual = 0;
            int salarioBase = 2000;
            int candidatosSelecionados = 0;

            while( candidatosSelecionados < 5 && candidatoAtual < candidatos.length){
                String candidato = candidatos[candidatoAtual];
                int salarioProposto = valorPretendido();
                System.out.println("O candidato " + candidato + " solicitou " + salarioProposto + "de salario");
                
                if (salarioProposto <= salarioBase){
                    candidatosSelecionados ++;
                }
                candidatoAtual ++;
            }



        } 

        static int valorPretendido(){
            return ThreadLocalRandom.current().nextInt(1500, 3000);
        }
        static void analisarCandidatos(){
            int baseSalarial = 2000;
            Scanner Leitor = new Scanner(System.in).useLocale(Locale.US);

            System.out.println("Qual e o seu salario pretendido.");
            Integer salarioPretendido = Leitor.nextInt();

            if (baseSalarial > salarioPretendido){
                System.out.println("LIGAR PARA O CANDIDATO");
            }
            else if (baseSalarial == salarioPretendido){
                System.out.println("LIGAR PARA O CANDIDATO COM CONTRA PROPOSTA");
            }
            else {
                System.out.println("AGUARDANDO RESULTADO DEMAIS CANDIDATOS");
            }
        }

    }

