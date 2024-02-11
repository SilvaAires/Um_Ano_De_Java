package algoritmo_Lista09_laço_while;

import java.util.Scanner;

public class exe033 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int num = entrada.nextInt();
        boolean primo = true;
        if (num > 1){
            for (int i = 2; i < num; i++) {
                int resto = num % i;
                if (resto == 0){
                    primo = false;
                    break;
                }
            }
            if (primo == true){
                System.out.println(num + " é Número PRIMO");
            }
            else{
                System.out.println(num + " não é Número PRIMO");
            }
        }
        else{
            System.out.println("O nº deve ser maior que 1");
        }
    }
}
