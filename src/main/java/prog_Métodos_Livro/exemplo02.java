package prog_Métodos_Livro;

/*
Criar um algoritmo que receba notas de três provas e calcular a sua média, mas
utilizando uma função. 
*/

public class exemplo02 {
    public static double media(double n1, double n2, double n3){
        double m = (n1+n2+n3)/3;
        return m;
    }
    public static void imprimirVar(double a){
        System.out.println("Resultado: "+a);
    }
    public static void main (String []args){
        //*double v1 [] = {exemplo01.lerDouble(), exemplo01.lerDouble(), exemplo01.lerDouble()};
        //*double n = media(exemplo01.lerDouble(), exemplo01.lerDouble(), exemplo01.lerDouble());
        imprimirVar(media(exemplo01.lerDouble(), exemplo01.lerDouble(), exemplo01.lerDouble()));
    }
}
