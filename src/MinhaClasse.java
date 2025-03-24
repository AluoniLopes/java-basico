
public class MinhaClasse {
    @SuppressWarnings("unused")
    public static void main(String[] args) {
        
        final String BR = "Brasil";
        final String US = "Estados Unidos";
        final String IL = "Israel";
        final String ES = "Espanha";
        final String AR = "Argentina";
        final String CH = "Chile";

        final Integer N = 12;

        for (int i = 0; i < 20; i++) {
            System.out.println(i + " : " + Math.pow(N, i) );
        }
    }
}
