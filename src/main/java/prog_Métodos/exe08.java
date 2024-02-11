package prog_Métodos;

import java.util.Scanner;

/*
8. Elabore um método que calcule o valor da expressão x³
+ sqrt(x) – 10y. O método deverá receber os valores de x
e y da main. O valor de x deve ser qualquer real maior
ou igual a zero. O de y pode ser qualquer real. Verifique
os valores.
*/

public class exe08 {
    public static double xCubo (double a){
        double pot = a * a * a;
        return pot;
    }
    public static double mult (double x){
        double m = 10 * x;
        return m;
    }
    public static double reEq (double a, double b, double c){
        double result = a + b - c;
        return result;
    }
    public static void main (String[]args){
        Scanner e = new Scanner (System.in);
        System.out.println("Digite um numero para armazenar no X: ");
        double x = e.nextDouble();
        System.out.println("Digite um numero para armazenar no Y: ");
        double y = e.nextDouble();
        if ((x >= 0)&&(y>=0)){
           double d = Math.sqrt(y);//*exe07.raiz(y)
           System.out.print("resultado: " + reEq((xCubo(x)), d, (mult(x))));
        }
    }
}
