package variantes_Exe;

import java.util.Scanner;

public class maior_Menor {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int maior = 0;
        int menor = 0;
        for (int i = 1; i <= 5; i++) {
            System.out.print(i + "º Valor: ");
            int valor = entrada.nextInt();
            if (i == 1){
                maior = valor;
                menor = valor;
            }
            else{
                if (valor > maior)
                    maior = valor;
                if (valor < menor)
                    menor = valor;
            }
        }
        System.out.println("Maior: " + maior);
        System.out.println("Menor: " + menor);
    }
}
