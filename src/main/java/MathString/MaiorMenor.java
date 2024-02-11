package MathString;
import java.util.Scanner;

public class MaiorMenor {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int maior = 0;
        int menor = 0;
        for (int i = 1; i <= 5; i++) {
            System.out.print(i + "º número: ");
            int num = entrada.nextInt();
            maior = Math.max(num, maior);
            menor = Math.min(num, menor);
            System.out.println("Maior: " + maior);
            System.out.println("Menor: " + menor);
            System.out.println("");
        }
    }
}
