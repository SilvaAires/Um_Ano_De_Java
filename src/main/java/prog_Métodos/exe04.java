package prog_Métodos;

/*
4. Escreva um programa para calcular o fatorial de um
número informado pelo usuário. Deverão ser criados
métodos para leitura de teclado, cálculo e exibição do
resultado na tela.
*/

public class exe04 {
     public static int fatorial (int n){
        int a = 1;
        for (int i = 1; i <= n; i++){
            a = i * a;
        }
        return a;
    }
    public static void imprimir(int i){
        System.out.println("Fatorial: " + i);
    }
    public static void main(String []args){
        int n = exe02.lernum();
        imprimir(fatorial(n));
    }
}
