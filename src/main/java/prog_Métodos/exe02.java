package prog_Métodos;

import java.util.Scanner;

/*
2. Escreva um programa para armazenar em um vetor os
100 primeiros números pares, a partir de um número
informado (pela linha de execução) pelo usuário. Crie
um método para ler o número, outro método para
armazenar os valores no vetor e outro método para
imprimir o conteúdo vetor na tela.
*/

public class exe02 {
    
    public static int lernum(){
        Scanner e = new Scanner (System.in);
        System.out.println("Digite um numero");
        int n = e.nextInt();
        return n;
    }
    public static int [] armazenar(int n){
        int vetor [] = new int [100];
        int inicio = n;
        if(n%2!=0){
            inicio = n + 1;
        }
        int j = 0;
        for (int i = inicio; i < 200 + inicio; i+=2){
            vetor[j]=i;
            j ++;
        }
        return vetor;
    } 
    public static void imprimir(int vetor[]){
        for(int i = 0; i<vetor.length;i++){
            System.out.println("["+vetor[i]+"]");
        }
    }
    
    public static void main(String[] args){
        int n = lernum();
        int v[] = armazenar(n);
        imprimir(v);
        
    }
      
}