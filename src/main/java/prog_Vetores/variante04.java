package prog_Vetores;

import java.util.Scanner;

public class variante04 {
    public static void main (String []args){
        Scanner e = new Scanner(System.in);
        String nome [] = new String[2];
        int idade[]=new int[2];
        int maiores = 0;
        for (int i = 0; i < idade.length; i++){
        System.out.println("Digite a idade: ");
        idade[i]=e.nextInt();
        System.out.println("Digite seu nome: ");
        nome[i] = e.nextLine();
        if ( idade[i] > 18){
            maiores ++;
        }
        e = new Scanner(System.in);
    }
       
       for (int i = 0; i < idade.length; i++){
           if ( idade[i] > 18){
               System.out.println("Idade maior " + idade[i] + "\n Nome: " + nome[i]);
           }
       }
    }
}
