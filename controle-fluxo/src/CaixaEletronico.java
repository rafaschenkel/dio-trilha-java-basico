public class CaixaEletronico {
    public static void main(String[] args) {
        int saldo = 25;
        int saque = 17;

        if (saldo > saque) {
            saldo -= saque;
            System.out.println(saldo);
        } else {
            System.out.println("Saldo insuficiente!");
        }
    }
}
