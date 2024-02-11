package prog_Métodos_Livro;

import java.util.Scanner;

/*
Criar um algoritmo que possa entrar com três números e, para cada um, imprimir
o dobro. Usar uma função que retorne valor. 
*/

public class exemplo01 {
    public static double lerDouble(){
        Scanner e = new Scanner(System.in);
        System.out.print("Digite um numero: ");
        double n = e.nextDouble();
        return n;
    }
    public static double [] dobro(double n1, double n2, double n3){
        double [] vetor = {n1, n2, n3};
        for (int i = 0; i<vetor.length; i++){
            vetor [i] = vetor [i]*2;
        }
        return vetor;
    }
    public static void imprimirVetor(double v []){
        double a [] = v;
        for(int i = 0; i<a.length;i++){
            System.out.println("["+a[i]+"] ");
        }
    }
    public static void main(String[]args){
        double v [] = dobro(lerDouble(),lerDouble(),lerDouble());
        imprimirVetor(v);
    }
}
