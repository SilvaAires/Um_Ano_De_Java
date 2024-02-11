package algoritmo_Lista09_laço_while;

import java.util.Scanner;

/*
3. Um Número Primo é um número natural maior do que 1 que possui somente dois divisores: 1 e ele
mesmo. Escreva uma classe em Java que solicite que o usuário digite um número inteiro maior que 1 e
verifique se o número digitado é um número primo.
Por exemplo: 
*/

public class exe03 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int num = entrada.nextInt();
        int quant = 0;
        if (num > 1){
            for (int i = 1; i <= num; i++) {
                int resto = num % i;
                if (resto == 0){
                    quant++;
                }
            }
            if (quant == 2){
                System.out.println(num + " é Número PRIMO");
            }
            else{
                System.out.println(num + " não é Número PRIMO");
            }
        }
        else{
            System.out.println("O nº deve ser maior que 1");
        }
    }
}
