package algoritmo_Triangulo;

import java.util.Scanner;

public class equilatero {
    public static void main(String []args){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Lado 1: ");
        int Lado1 = entrada.nextInt();
        System.out.println("Lado 2: ");
        int Lado2 = entrada.nextInt();
        System.out.println("Lado 3: ");
        int Lado3 = entrada.nextInt();
        if ((Lado1 == Lado2) && (Lado1 == Lado3) && (Lado2 == Lado3)){
            System.out.println("os valores formam um triângulo");
        }
        else{
            System.out.println("os valores não foram um triângulo");
        }
    }
}