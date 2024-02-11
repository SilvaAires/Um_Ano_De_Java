package algoritmo_Trabalho;

import java.util.Scanner;

public class Triangulo {
    public static void main (String []args){
        Scanner entrada = new Scanner (System.in);
        System.out.print("Lado A: ");
        int ladoA = entrada.nextInt();
        System.out.print("Lado B: ");
        int ladoB = entrada.nextInt();
        System.out.print("Lado C: ");
        int ladoC = entrada.nextInt();
        if ((ladoA == ladoB) && (ladoA != ladoC) && (ladoB != ladoC)) {
            System.out.println("Os valores formam um triangulo");
        }
        else{
            if ((ladoB == ladoC) && (ladoB != ladoA) && (ladoC != ladoA)) {
                System.out.println("Os valores formam um triangulo");
            }
            else{
                if ((ladoA == ladoC) && (ladoA != ladoB) && (ladoC != ladoB)){
                    System.out.println("Os valores formam um triangulo");
                } 
                else{
                    System.out.println("Os valores não formam um triangulo");
                }
            }
        }
    }
}
