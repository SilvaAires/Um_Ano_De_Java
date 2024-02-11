package variantes_Exe;

import java.util.Scanner;

public class caixa_Ele00 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("1 - Saldo");
        System.out.println("2 - Saque");
        System.out.println("3 - Depósito");
        System.out.println("4 - Sair");
        System.out.print("Escolha uma opção: ");
        int op = entrada.nextInt();
        double saldo = 1000;
        switch(op){
            case 1:
                System.out.println("Saldo: " + saldo);
                break;
            case 2:
                System.out.print("Valor do saque: ");
                double saque = entrada.nextDouble();
                if (saque <= saldo){
                    saldo = saldo - saque;
                }
                else{
                    System.out.println("Saldo insuficiente!");
                }
                System.out.println("Saldo: " + saldo);
                break;
            case 3:
                System.out.print("Valor do Depósito: ");
                double deposito = entrada.nextDouble();
                saldo = saldo + deposito;
                System.out.println("Saldo: " + saldo);
                break;
            case 4:
                System.out.println("Encerrando...");
                break;
            default: 
                System.out.println("Opção inválida!");
        }
    }
}
