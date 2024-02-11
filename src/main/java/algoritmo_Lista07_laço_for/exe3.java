package algoritmo_Lista07_laço_for;

import java.util.Scanner;

/*Escreva uma classe em Java que solicite que o usuário 
informe 10 números inteiros positivos. A classe deve 
verificar e exibir, para cada número lido, quais são 
pares e quais são ímpares. */

public class exe3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        for (int i = 1; i <= 10; i++) {
            System.out.print(i + "º Valor: ");
            int valor = entrada.nextInt();
            if (valor <= 0){
                System.out.println("Valor inválido!");  
                i--;
            }
            else{
                int resto = valor % 2;
                if (resto == 0)
                    System.out.println("PAR");
                else
                    System.out.println("IMPAR");
            }
            System.out.println("");
        }
    }
}

