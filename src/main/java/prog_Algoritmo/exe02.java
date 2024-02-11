package prog_Algoritmo;

/*
2. Faça um algoritmo para calcular e escrever a tabuada dos
números de 1 a 10.
*/

public class exe02 {
    public static void main(String []args){
        for (int n = 1; n <=10 ; n++){
            System.out.println("tabuada do " + n);
            for (int i = 0; i <= 10; i++ ){
            System.out.println(n +" * " + i + " = " + (n*i));
        }
        }
    }
}
