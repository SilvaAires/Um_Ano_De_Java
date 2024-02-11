package prog_Algoritmo;

import java.util.Scanner;

/*
4. Codifique um algoritmo para elevar um número informado
pelo usuário a qualquer expoente (também informado pelo
usuário). Deve-se calcular o valor do nº elevado ao expoente.
*/

public class exe04 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite uma base: ");
        int base = entrada.nextInt();
        System.out.print("Digite uma potencia: ");
        int potencia = entrada.nextInt();
        int soma = 1;
        for (int i = 1; i <= potencia; i ++){
            soma = soma * base;
        }
        System.out.println("final: " + soma);
    } 
}
