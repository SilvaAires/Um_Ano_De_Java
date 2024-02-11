package algoritmo_Lista06_swith_case;

import java.util.Scanner;

/*
1. Elabore uma classe em Java que solicite que o usuário informe dois valores. A seguir, deve-se solicitar
que o usuário escolha uma das seguintes operações: (1) soma, (2) subtração, (3) divisão ou (4)
multiplicação). Execute a operação desejada e exiba o resultado na tela. 
*/

public class exe01 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Primeiro valor: ");
        double valor1 = entrada.nextDouble();
        System.out.print("Segundo valor: ");
        double valor2 = entrada.nextDouble();
        System.out.println("");
        System.out.println("1 - Adição");
        System.out.println("2 - Subtração");
        System.out.println("3 - Divisão");
        System.out.println("4 - Multiplicação\n");
        System.out.print("Escolha um operação: ");
        int op = entrada.nextInt();
        double resultado = 0;
        switch(op){
            case 1:
                System.out.println("ADIÇÃO");
                resultado = valor1 + valor2;
                break;
            case 2:
                System.out.println("SUBTRAÇÃO");
                resultado = valor1 - valor2;
                break;
            case 3:
                System.out.println("DIVISÃO");
                if (valor2 == 0)
                    System.out.println("Não é possível dividir por zero");                
                else{
                    resultado = valor1/valor2;
                }
                break;
            case 4:
                System.out.println("MULTIPLICAÇÃO");
                resultado = valor1 * valor2;
                break;
            default:
                System.out.println("Operação indisponível");
        }
        if ((op >= 1) && (op <= 4))
            System.out.println("Resultado: " + resultado);
    }
}
