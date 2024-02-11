package algoritmo_Lista08_laço_for;

import java.util.Scanner;

/*
3. Escreva uma classe em Java para ler um valor inteiro e positivo. A classe deve calcular e
mostrar o fatorial deste número.
OBSERVAÇÃO: O fatorial do número é calculado multiplicando todos os números inteiros
começando de um e incluindo o número fornecido.
EXEMPLO: Fatorial de 5 (5!) = 5 * 4 * 2 *3 * 1 = 120
*/

public class exe03 {
    public static void main(String []args){
        Scanner e = new Scanner(System.in);
        System.out.println("Digite um numero:");
        int n = e.nextInt();
        int a = 1;
        for (int i = 1; i <= n; i++){
            a = i * a;
        }
        System.out.println("Resultado: " + a);
    }
}
