package variantes_Exe;

import java.util.Scanner;

public class variaveisContadoras {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int maiores18 = 0;
        int somaMenores = 0;
        for (int i = 1; i <= 5; i++) {
            System.out.print("Idade da " + i + "ª pessoa: ");
            int idade = entrada.nextInt();
            if (idade >= 18){
                maiores18++;
            }
            else{
                somaMenores = somaMenores + idade;
            }
        }
        System.out.println("Quant. > 18 anos: " + maiores18);
        System.out.println("Soma idade < 18 anos: " + somaMenores);
    }
}
