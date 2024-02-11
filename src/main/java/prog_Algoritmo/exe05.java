package prog_Algoritmo;

/*
5. Escreva um programa que apresente na tela a seguinte
sequencia de números variando de 1 até 10.
*/

public class exe05 {
    public static void main(String[] args) {
        for (int j = 0; j <= 10; j++) {
            System.out.println("    ");
        for (int i = 1; i <= j; i++) {
            System.out.print(" " + i);   
        }
        }
        for (int j = 9; j >= 0; j--) {
            System.out.println("    ");
        for (int i = j; i >= 0; i--) {
            System.out.print(" " + i); 
        }
        }
    }
}
