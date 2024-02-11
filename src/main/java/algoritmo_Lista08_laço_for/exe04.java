package algoritmo_Lista08_laço_for;

import java.util.Scanner;

/*
4. Escreva uma classe em Java que solicite que o usuário digite 5 números. A classe deve
verificar e exibir o maior e o menor número digitado. 
*/

public class exe04 {
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
