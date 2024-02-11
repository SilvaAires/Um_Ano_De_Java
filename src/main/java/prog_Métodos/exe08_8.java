package prog_Métodos;

import java.util.Scanner;

/*
8. Elabore um método que calcule o valor da expressão x³
+ sqrt(x) – 10y. O método deverá receber os valores de x
e y da main. O valor de x deve ser qualquer real maior
ou igual a zero. O de y pode ser qualquer real. Verifique
os valores.
*/

public class exe08_8 {
    public static double res(double a, double b){
        return Math.pow(a, 3)+ Math.sqrt(a) - 10*b;
    }
    public static void main(String []args){
        Scanner e = new Scanner(System.in);
        double x = -1;
        System.out.println("Digite um numero para armazenar no X: ");
        while (x<0){
            x = e.nextDouble();
        }
        System.out.println("Digite um numero para armazenar no Y: ");
        double y = e.nextDouble();
        if ((x >= 0)&&(y>=0)){
            System.out.print("resultado: " + res(x, y));
        }
    }
}