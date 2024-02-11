package algoritmo_Lista10_Strings;

import java.util.Scanner;

/*
6. Escreva uma classe em Java que solicite que o usuário digite vários números inteiros positivos. A classe deve
verificar e exibir a quantidade de números pares e a soma dos números ímpares digitados. O programa deve
encerrar quando o usuário digitar um número maior que 1000.
*/

public class exe06 {
    public static void main (String [] args){
        Scanner e = new Scanner (System.in);
        int n = 0;
        int p = 0;
        int im = 0;
        do{
            System.out.println("Digite um numero inteiro: ");
                n = e.nextInt();
                if((n<1000)&&(n>0)){
                    if(n%2==0){
                        System.out.println("Par");
                        p++;
                    }
                    if(n%2!=0){
                        System.out.println("Impar");
                        im += n;
                    }
                }else System.out.println("O numero ditado e maior que 1000 ou menor 0, Erro");break;
        }while(n<1000);
        System.out.println("Quantidade de par: "+p);
        System.out.println("Soma de impar: "+im);
    }
}
