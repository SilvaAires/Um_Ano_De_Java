package prog_Métodos_Livro;

/*
Criar uma função que verifique se um número é primo. 
*/

public class exemplo07 {
    public static double primo(double a){
        int s = 0;
        for(int i = 1; i <= a; i++){
            if (a%i == 0){
                s++;
            }
        }
        return s;
    }
    public static void main (String []args){
        System.out.println("Digite um numero para ver se é primo: ");
        double g = primo(exemplo01.lerDouble());
        if ( g == 2){
            System.out.print("Primo");
        }else System.out.print("Não é primo");
    }
}
