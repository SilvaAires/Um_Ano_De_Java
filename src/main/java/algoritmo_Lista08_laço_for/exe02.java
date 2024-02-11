package algoritmo_Lista08_laço_for;

import java.util.Scanner;

/*
2. Escreva uma classe em Java para ler 10 valores inteiros. A classe deve calcular e exibir a
média aritmética dos números digitados. 
*/

public class exe02 {
    public static void main(String []args){
        Scanner e = new Scanner(System.in);
        int s = 0;
        for (int i = 0; i <= 10; i++){
            System.out.println("Digite um numero:"); 
            int n = e.nextInt();
            s += n;
        }
        System.out.println("Media: " +(s/10));
    }
}
