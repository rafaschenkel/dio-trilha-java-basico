public class PlanoOperadora {
    public static void main(String[] args) {
        String plano = "Turbo"; // Basico , Max, Turbo

        switch (plano) {
            case "Turbo":
                System.out.println("5GB de YouTube");
            case "Max":
                System.out.println("WhatsApp e Instagram ilimitados");
            case "Basico":
                System.out.println("100 min. de ligações para todo Brasil");
        }
    }
}
