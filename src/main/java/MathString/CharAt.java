package MathString;

public class CharAt {
    public static void main(String[] args) {
        String alfabeto = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        for (int i = 0; i <= 25; i++) {
            String letra = String.valueOf(alfabeto.charAt(i));
            System.out.println("Posição: " + i + " - Letra: " + letra);
        }
    }
}
