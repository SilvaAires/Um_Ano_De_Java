package prog_Vetores;

import java.util.Scanner;

public class variante01 {
    public static void main (String []args){
        int vetor []= new int []{19,1,9,10,15,199 };
        for (int i = vetor.length-1; i >= 0 ; i--){
            System.out.println("elemento " + vetor[i]);
        }
        
        System.out.println("Novo codigo ");
        
        Scanner e = new Scanner(System.in);
        System.out.println("Qual o tamanho do vetor que vc que?");
        int ve = e.nextInt();
        int tamnho []= new int [ve];
        for (int k = 0; k < tamnho.length; k ++){
            System.out.println("Digite um numero para o vetor:");
            tamnho[k] = e.nextInt();
        }
        for (int k = 0; k < tamnho.length; k ++){
            System.out.print("Numero : " + tamnho[k]);
        }
       
        System.out.println("Novo codigo ");
        
        double media_1 [] = new double [2];
        double jo = 0;
        for (int i = 0 ; i < media_1.length; i++){
            System.out.println("Digite uma nota: ");
            media_1[i] = e.nextInt();
            jo = jo + media_1[i];
        }
        double med = jo/media_1.length;
        System.out.println("Media das notas: " + med);
        System.out.println(" ");
        
        int idade[]=new int[2];
        for (int i = 0; i < idade.length; i++){
        System.out.println("Digite a idade ");
        idade[i]=e.nextInt();
        if ( idade[i] > 18){
            System.out.println("E maior de idade" + idade[i]);
        }
    }
    }
}
