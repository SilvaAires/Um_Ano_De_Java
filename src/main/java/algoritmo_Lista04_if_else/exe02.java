package algoritmo_Lista04_if_else;

import java.util.Scanner;

/*
2. Escreva um programa que solicite que o usuário digite dois números inteiros. Se os números forem
iguais, seve exibir a mensagem “Os números são iguais! ”. Caso contrário, deve-se informar o MAIOR
valor. 
*/
public class exe02 {
    public static void main(String[]args){
        Scanner e = new Scanner(System.in);
        System.out.println("Digite dois numeros: ");
        int n1 = e.nextInt();
        int n2 = e.nextInt();
        if (n1 == n2){
            System.out.println("Números iguais");
        }
        else{
            if (n1 > n2){
                System.out.println("Maior: " + n1);
            }
            else{
                System.out.println("Maior: " + n2);
            }
        }
    }
}
