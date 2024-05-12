import java.util.concurrent.ThreadLocalRandom;

public class ExemploWhile {
    public static void main(String[] args) {
        int mesada = 50;

        while (mesada > 0) {
            int valorDoce = valorAleatorio();

            if (valorDoce > mesada) {
                valorDoce = mesada;
            }

            System.out.println("Doce de R$ " + valorDoce + " adicionado ao carrinho");

            mesada -= valorDoce;
        }

        System.out.println("Valor restante da mesada: " + mesada);
        System.out.println("Você gastou toda sua mesada com doces.");
    }

    private static int valorAleatorio() {
        return ThreadLocalRandom.current().nextInt(2, 15);
    }
}
