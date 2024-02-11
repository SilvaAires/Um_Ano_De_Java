package variantes_Exe;

import java.util.Scanner;

public class caixa_Ele {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int op = 0;
        for (int i = 0; op != 4; i++) {
            System.out.println("1 - Saldo");
            System.out.println("2 - Depósito");
            System.out.println("3 - Saque");
            System.out.println("4 - Sair");
            System.out.print("Escolha: ");
            op = entrada.nextInt();
            switch(op){
                case 1: System.out.println("SALDO"); break;
                case 2: System.out.println("DEPÓSITO"); break;
                case 3: System.out.println("SAQUE"); break;
                default: System.out.println("ENCERRANDO...");
            }
        }
    }
}
