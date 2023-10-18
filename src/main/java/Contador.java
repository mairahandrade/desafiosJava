
import java.util.Locale;
import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

            System.out.println("Digite o primeiro parâmetro");
            int parametroUm = scanner.nextInt();

            System.out.println("Digite o segundo parâmetro");
            int parametroDois = scanner.nextInt();

            if (parametroUm > parametroDois) {
                try {
                    throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro.");
                } catch (ParametrosInvalidosException e) {
                    System.out.println(e.getMessage());
                }
                return;
            }
            int contagem = 0;
        //realizar o for para imprimir os números com base na variável contagem
                 for (int i = parametroUm; i <= parametroDois; i++) {
                    System.out.println("Imprimindo o número " + i);
                    contagem++;
                 }
        System.out.println( "Total de Iterações: " + contagem);


    }


}

