package prog_Métodos;

import java.util.Scanner;

/*
9. Crie uma classe com os seguintes métodos, utilizandoas e testando-as na main.
◦ Método 1 – imprimir seu nome completo.
◦ Método 2 – somar dois valores x e y passados por parâmetros. A soma deve
ser devolvida ao método main, que mostrará o resultado.
◦ Métodos 3 – receber dois valores passados por parâmetros e devolver ao
método main todos os números ímpares que estão no intervalo dado,
imprimindo-os na tela. Para esta tarefa, utilize os mesmos dois valores vindos
do formulário do item anterior.
*/

public class exe09_Errado { //**ERRADO
    public static String nome(){
        Scanner e = new Scanner(System.in);
        System.out.print("Digite seu nome: ");
        String nome = e.nextLine();
        System.out.println("Seu nome: \n" + nome);
        return nome;
    }
    public static int soma(int x, int y){
        int s = x + y;
        return s;
    }
    public static int [] vetor (int a, int b){
        //*int n [] = new int [0];

        int n [] = new int [0];
        if ( a > b){
            int r [] = new int [a-b];
            int j = 0;
            for (int i = a; i <=b; i++){
                if(a-b!=0){
                r[j]=i;
                j ++;
                }
            }
            return r;
        }
        return n;
    }
    public static void main (String []args){
        Scanner e = new Scanner(System.in);
        nome();
        System.out.print("Digite um num pra A: ");
        int A = e.nextInt();
        System.out.print("Digite um num pra B:");
        int B = e.nextInt();
        System.out.println("Soma: "+soma(A, B));
        System.out.print("vetor: " +(vetor(A, B)));
    }
    
}
