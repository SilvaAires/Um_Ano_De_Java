package prog_Métodos;

/*
3. Escreva um programa para verificar se um número é par
ou ímpar. Crie um método para cada verificação, pois se
o número informado pelo usuário através da linha de
execução for par, o sistema deverá mostrar o dobro
desse número, caso contrário deverá ser mostrado o
triplo do número informado. Crie métodos de leitura,
comparação e exibição na tela.
*/

public class exe03 {
    public static boolean par(int n){
        if (n%2==0){
            return true;
        }
        return false;
    }
    public static boolean impar(int n){
        if (n%2!=0){
            return true;
        }
        return false;
    }
    public static void imprimir (int n){
        if (par(n)){
            System.out.println("É par: "+n*2);
        }
        if (impar(n)){
            System.out.println("É par: "+n*3);
        }
    }
    
    public static void main(String[]args){
        int n = exe02.lernum();
        imprimir(n);
    }
}

