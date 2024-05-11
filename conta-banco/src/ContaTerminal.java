import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite seu nome :");
        String nomeCliente = scanner.next();

        System.out.println("Digite o número da agência: (ex.: 0000)");
        int agencia = scanner.nextInt();

        System.out.println("Digite o número da conta: (ex.: 0000-0)");
        String numeroConta = scanner.next();

        System.out.println("Saldo inicial: (ex.: 000.00)");
        double saldo = scanner.nextDouble();

        scanner.close();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é: "
                + agencia + ", número da conta: " + numeroConta + " e seu saldo de: R$ " + saldo
                + ", já está disponível para saque.");
    }
}
