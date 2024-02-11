package MathString;

import java.util.Scanner;

public class RaizQuadrada {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite um número positivo: ");
        int num = entrada.nextInt();
        if (num > 0){
            int sub = 1;
            int resultSub = num;
            int cont = 0;
            do{
                resultSub = resultSub - sub;
                sub = sub + 2;  //sub += 2;
                cont++;
            }while(resultSub > 0);
            if (resultSub == 0){
                System.out.println("Raiz Quadra de " + num + 
                        " = " + cont);
            }else{
                System.out.println(num + " não possui RQ");
            }}
        else{
            System.out.println("Não é possível calcular!");
        }
    }
}