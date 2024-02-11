package algoritmo_Triangulo;

import java.util.Scanner;

public class cod_Tri {
    public static void main(String []args){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Lado 1: ");
        int Lado1 = entrada.nextInt();
        System.out.println("Lado 2: ");
        int Lado2 = entrada.nextInt();
        System.out.println("Lado 3: ");
        int Lado3 = entrada.nextInt();
        if ((Lado1 < Lado2 + Lado3) && (Lado2 < Lado1 + Lado3) && (Lado3 < Lado1 + Lado2)){
            System.out.println("os valores formam um triângulo");
        }
        else{
            if ((Lado1 == Lado2) && (Lado1 == Lado3) && (Lado2 == Lado3)){
                System.out.println("os valores formam um triângulo equilatero");
            }
            else{
                if ((Lado1 == Lado2) || (Lado1 == Lado3) || (Lado2 == Lado3)){
                    System.out.println("os valores formam um triângulo isosceles");
                }
                else{
                    System.out.println("os valores foram um triângulo escaleno");
                }
            }
        }
    }
}