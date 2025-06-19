import java.util.Scanner;
import java.text.NumberFormat;
import java.util.Locale;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Formato de moeda brasileira
        Locale brasil = new Locale("pt", "BR");
        NumberFormat moeda = NumberFormat.getCurrencyInstance(brasil);

        // Recebe o nome do usuário
        System.out.println("Olá, seja bem-vindo! Por favor, digite o seu nome:");
        String nomeTitular = scanner.nextLine();

        // Recebe o número da agência
        System.out.println("Número da Agência:");
        String agencia = scanner.nextLine();

        // Recebe o número da conta
        System.out.println("Agora, digite o número da conta:");
        String numeroConta = scanner.nextLine();

        // Recebe o saldo
        System.out.println("Quanto quer depositar?");
        float saldo = scanner.nextFloat();

        // Mensagem final
        System.out.println("\nTudo certo " + nomeTitular + ", sua conta foi criada!");
        System.out.println("Agência: " + agencia + " | Conta: " + numeroConta);
        System.out.println("Saldo atual: " + moeda.format(saldo));

        scanner.close();
    }
}