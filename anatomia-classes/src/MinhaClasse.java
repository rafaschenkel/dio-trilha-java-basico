public class MinhaClasse {

    public static void main(String[] args) {
        String nome = "Rafael";
        String sobrenome = "Schenkel de Souza";
        String nomeCompleto = nomeCompleto(nome, sobrenome);

        System.out.println(nomeCompleto);
    }

    public static String nomeCompleto(String nome, String sobrenome) {
        return "Nome completo: " + nome.concat(" ").concat(sobrenome);
    }
}