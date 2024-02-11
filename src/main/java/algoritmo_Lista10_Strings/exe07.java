package algoritmo_Lista10_Strings;

import java.util.Scanner;

/*
7. Uma academia deseja fazer uma pesquisa entre seus clientes para descobrir:
a. A altura da pessoa mais alta mais alta e da pessoa mais baixa.
b. A idade da pessoa mais jovem e da pessoa mais velha.
*/

public class exe07 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int velha = 0;
        int jovem = 0;
        double alta = 0;
        double baixa = 0;
        int o = 0; 
        int p = 0; 
        int k = 0; 
        int l = 0;
        for (int i = 1; i <= 2; i++) {
            System.out.print("Digite sua idade: ");
            int valor = entrada.nextInt();
            System.out.print("Digite sua altura: ");
            int al = entrada.nextInt();
            if (i == 1){
                velha = valor;
                jovem = valor;
                alta = al;
                baixa = al;
            }
            else{
                if (valor > velha){
                    velha = valor;
                    o++;
                }
                if (valor < jovem){
                    jovem = valor;
                    p++;
                }
                if (al > alta){
                    alta = al;
                    k++;
                }
                if (al < baixa){
                    baixa = al;
                    l++;
                }
            }
        }
        System.out.println(o +" Maior: " + velha);
        System.out.println(p+" Menor: " + jovem);
        System.out.println(k+" Maior / alta: " + alta);
        System.out.println(l+" Menor / baixa: " + baixa);
    }
}
