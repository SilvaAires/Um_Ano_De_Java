package prog_Métodos;

/*
5. Criar um método que receba um número real qualquer
e calcule e retorne o valor do cubo deste número.
*/

public class exe05 {
    public static int cubo(int n){
        int s = n * n * n;
        return s;
    }
    public static void main(String [] args){
        int num = exe02.lernum();
        exe04.imprimir(cubo(num));
    }
}

/*
public static double cubo(double a){
    double s = a*a*a; 
    return s; Math.pow(num, 3);
}
public static int lernum(){
    Scanner e = new Scanner (System.in);
    System.out.println("Digite um numero");
    double n = e.nextDouble();
    return n;
}
public static void main(String [] args){
    lernum();
    exe04.imprimir(cubo(num));
}
*/

