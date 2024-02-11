package algoritmo_Lista07_laço_for;

import java.util.Scanner;

/*
1. Escreva uma classe em Java que solicite que o usuário digite um valor inteiro entre 1 e 10. A classe
deve calcular e exibir a tabuada deste número. 
*/

public class exe01 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite um valor entre 1 e 10: ");
        int numero = entrada.nextInt();
        if ((numero >= 1) && (numero <= 10)){
            for(int i = 1; i <= 10; i++){
                int tabuada = numero * i;
                System.out.println(numero+" * "+ i +" = "+ tabuada);
            }
        }
        else{
            System.out.println("O número precisa estar entre 1 e 10");
        }
    }
}
