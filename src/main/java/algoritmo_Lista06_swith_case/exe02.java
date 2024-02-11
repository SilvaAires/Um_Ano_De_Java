
package algoritmo_Lista06_swith_case;

import java.util.Scanner;

/*
2. Uma loja está fazendo promoção e oferece 30% de desconto nas compras em DINHEIRO, 25% de
desconto nas compras pagas com CARTÃO DE DÉBITO e 20% de desconto nas compras pagas com
CARTÃO DE CRÉDITO. Escreva uma classe em Java que solicite que o usuário informe o valor da
compra e a forma de pagamento (1 – Em dinheiro; 2 – Cartão Débito; 3 – Cartão Crédito). Caso seja
uma opção diferente para a forma de pagamento, deve-se exibir a mensagem: “Não é possível realizar
a compra!”. Ao final, deve-se exibir o valor a ser pago pelo cliente. 
*/

public class exe02 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Valor da Compra: ");
        double totalCompra = entrada.nextDouble();
        System.out.println("");
        System.out.println("Formas de Pagamento");
        System.out.println("1 - Dinheiro");
        System.out.println("2 - Cartão de Débito");
        System.out.println("3 - Cartão de Crédito");
        System.out.print("Escolha a forma de pgto.: ");
        int formaPagto = entrada.nextInt();
        double desconto = 0;
        switch(formaPagto){
            case 1:
                System.out.println("PGTO. EM DINHEIRO");
                desconto = totalCompra * 0.3;
                break;
            case 2:
                System.out.println("PGTO. COM C. DÉBIDO");
                desconto = totalCompra * 0.25;
                break;
            case 3:
                System.out.println("PAGOT. COM C. CRÉDITO");
                desconto = totalCompra * 0.2;                
            default: 
                System.out.println("Não é possível realizar a compra!");
        }
        double totalPagar = totalCompra - desconto;
        System.out.println("");
        if ((formaPagto >= 1) && (formaPagto <= 3)){
            System.out.println("Total da Compra: " + totalCompra);
            System.out.println("Desconto: " + desconto);
            System.out.println("Total a Pagar: " + totalPagar);
        }
    }
}
