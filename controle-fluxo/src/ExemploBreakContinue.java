public class ExemploBreakContinue {
    public static void main(String[] args) {
        for (int i = 1; i <= 20; i++) {
            if (i == 4)
                continue;

            if (i == 13)
                break;

            System.out.println(i);
        }
    }
}
