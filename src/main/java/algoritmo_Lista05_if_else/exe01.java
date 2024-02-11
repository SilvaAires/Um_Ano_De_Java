
package algoritmo_Lista05_if_else;

import java.util.Scanner;

/*
1. Para doar sangue é necessário ter entre 18 e 67 anos. Escreva um programa que solicite que o usuário
digite a sua idade e informe se ela pode doar sangue ou não. Use alguns dos operadores lógicos OU (||)
e E (&&). 
*/

public class exe01 {
    public static void main(String[] args) {
        Scanner e = new Scanner(System.in);
        System.out.println("Idade: ");
        int idade = e.nextInt();
        if ((idade >= 18) && (idade <= 67)){
            System.out.println("Pode doar sangue");
        }
        else{
            System.out.println("Não pode doar");
        }
    }
}
