package MathString;

public class Random {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            int numInteiro = (int) (Math.random() * 10);
            System.out.println("Número inteiro: " + numInteiro);
        }
    }
}
