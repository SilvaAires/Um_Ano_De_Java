package algoritmo_Lista04_if_else;

import java.util.Scanner;

/*
1. Escreva um programa que verifique a validade de uma senha fornecida pelo usuário. A senha válida é o
número 1234. Devem ser impressas as seguintes mensagens:
a. “ACESSO PERMITIDO! ”, caso a senha seja válida.
b. “ACESSO NEGADO! ”, caso a senha seja inválida. 

*/

public class exe01 {
    public static void main(String []args){
        Scanner e = new Scanner(System.in);
        System.out.println("Digite a senha: ");
        int s = e.nextInt();
        if (s == 1234 ){
            System.out.println("Correto");
        }else{ 
            System.out.println("Errado");
        }
    }
}
