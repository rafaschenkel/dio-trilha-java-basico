public class ExemploCustomException {
    public static void main(String[] args) {
        try {
            String cep = formatarCep("1234567");
            System.out.println(cep);
        } catch (CepInvalidException e) {
            System.err.println("Cep precisa ter 8 digitos.");
        }
    }

    private static String formatarCep(String cep) throws CepInvalidException {
        if (cep.length() != 8) {
            throw new CepInvalidException();
        }
        return cep;
    }
}
