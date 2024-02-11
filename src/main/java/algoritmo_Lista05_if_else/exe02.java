
package algoritmo_Lista05_if_else;

import java.util.Scanner;

/*
2. Faça um programa que solicite que o usuário digite a sua idade. O programa deve exibir uma das
seguintes mensagens: “Não pode nem votar e nem dirigir”, “Pode votar, mas não pode dirigir”, “Pode
votar e pode dirigir”. 
*/

public class exe02 {
    public static void main(String[] args) {
        Scanner e = new Scanner(System.in);
        System.out.print("Idade: ");
        int idade = e.nextInt();
        if (idade < 16){
            System.out.println("Não pode votar!");
            System.out.println("Não pode dirigir");
        }
        else{
            if ((idade >= 16) && (idade < 18)){
                System.out.println("Pode votar");
                System.out.println("Não pode dirigir");
            }
            else{
                System.out.println("Pode votar");
                System.out.println("Pode dirigir");
            }
        }
    }
}
