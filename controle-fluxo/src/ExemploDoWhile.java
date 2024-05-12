import java.util.Random;

public class ExemploDoWhile {
    public static void main(String[] args) {
        do {
            System.out.println("Telefone tocando...");
        } while (atendeu());

        System.out.println("Alô...");
    }

    private static boolean atendeu() {
        boolean atendeu = new Random().nextInt(3) == 1; // verifica se o valor é gerado aleatoriamente é 1, retornando
                                                        // true ou false para a variavel
        System.out.println("Atendeu ? " + atendeu);
        return !atendeu;
    }
}
