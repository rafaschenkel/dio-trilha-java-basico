package candidatura;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
    public static void main(String[] args) {
        System.out.println("Processo Seletivo");
        String[] candidatos = { "FELIPE", "MÁRCIA", "JULIA", "PAULO", "AUGUSTO" };

        for (String candidato : candidatos) {
            entrarEmContato(candidato);
        }

    }

    static void entrarEmContato(String candidato) {
        int tentativas = 1;
        boolean atendeu = false;
        boolean continuarTentando = true;
        do {
            atendeu = atender();
            continuarTentando = !atendeu;

            if (continuarTentando) {
                tentativas++;
            } else {
                System.out.println("Contato realizado com sucesso");
            }

        } while (continuarTentando && tentativas <= 3);

        if (atendeu) {
            System.out.println("Conseguimos contato com " + candidato + " na " + tentativas + "° tentativa");
        } else {
            System.out.println("Não foi possivel contatar o candidato " + candidato);
        }
    }

    static boolean atender() {
        return new Random().nextInt(3) == 1;
    }

    static void imprimirSelecionados() {
        String[] candidatos = { "FELIPE", "MÁRCIA", "JULIA", "PAULO", "AUGUSTO" };

        for (int i = 0; i < candidatos.length; i++) {
            System.out.println("O candidato n°" + (i + 1) + " é o " + candidatos[i]);
        }
    }

    static void selecaoCandidatos() {
        double salarioBase = 2000.0;
        String[] candidatos = { "FELIPE", "MÁRCIA", "JULIA", "PAULO", "AUGUSTO", "MÔNICA", "FABRÍCIO", "MIRELA",
                "DANIELA", "JORGE" };

        int candidatosSelecionados = 0;
        int candidatoAtual = 0;

        while (candidatosSelecionados < 5 && candidatoAtual < candidatos.length) {
            String candidato = candidatos[candidatoAtual];
            double salarioPretendido = salarioPretendido();
            System.out.println("O candidato " + candidato + " solicitou o salário de: " + salarioPretendido);

            if (salarioBase >= salarioPretendido) {
                System.out.println("O candidato " + candidato + " foi selecionado para a vaga");
                candidatosSelecionados++;
            }
            candidatoAtual++;
        }
    }

    static void analisarCandidato(double salarioPretendido) {
        double salarioBase = 2000.0;

        if (salarioBase > salarioPretendido) {
            System.out.println("Ligar para o candidato");
        } else if (salarioBase == salarioPretendido) {
            System.out.println("Ligar para o candidato, com contra proposta");
        } else {
            System.out.println("Aguardar resultados dos demais candidatos");
        }
    }

    static double salarioPretendido() {
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }
}
