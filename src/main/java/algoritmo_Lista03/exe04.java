package algoritmo_Lista03;

import java.util.Scanner;
 
/*
4. Escreva um programa que solicite que o usuário digite o ano do seu nascimento. O programa deve
calcular e exibir a idade do usuário ao final do ano de 2022.
*/

public class exe04 {
    public static void main (String []args){
        Scanner e = new Scanner (System.in);
        System.out.println("Digite o ano de seu nascimento: ");
        int nasc = e.nextInt();
        System.out.println("Sua idade: " + (2022-nasc));
    }
}
