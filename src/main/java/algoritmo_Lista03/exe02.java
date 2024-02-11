package algoritmo_Lista03;

import java.util.Scanner;

/*
2. Escreva um programa que solicite que o usuário digite dois números inteiros. O programa deve
calcular e mostrar o quociente e o resto da divisão entre eles. 
*/
public class exe02 {
    public static void main(String []args){
        Scanner e = new Scanner (System.in);
        System.out.println("Digite dois numeros para dividir, separados por espaco. ");
        int n1 = e.nextInt();
        int n2 = e.nextInt();
        int quo = n1/n2;
        int resto = n1%n2;
        System.out.println("Resultado do quociente: "+quo+"\nResultado do resto: " +resto);
    }
}
