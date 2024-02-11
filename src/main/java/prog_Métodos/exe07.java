package prog_Métodos;

/*
7. Elabore um programa que receba 3 valores inteiros e:
◦ Faça a sua soma;
◦ Calcule a raiz quadrada da soma;
◦ Eleve a soma à quarta potência
◦ Cada uma das operações deverá ser realizada por um método
distinta.
*/

public class exe07 {
    public static double soma (double a, double b, double c){
        double s = a + b + c;
        return s;
    }
    public static double raiz (double som){
        double re = 0;
        for(int i = 0; i < som; i++){
            if(i*i == som){
                re = i;
            }
        }
        return re;
    }
    public static double pot (double pote){
        double result = pote * pote * pote * pote;
        return result;
    } 
    public static void main(String []args){
        double n = exe02.lernum();
        double m = exe02.lernum();
        double p = exe02.lernum();
        double f = soma(n, m, p);
        System.out.println(f);
        System.out.println(raiz(f));
        System.out.println(pot(f));
        /*
        como fazer raiz
        double n = 16;
        double r = 0;
        double rr = 0;
        r = n/2;
        do{
            rr = r;
            r = (r *r + n)/(2*r);
        } while (Math.abs(r - rr)> 0);
        System.out.println(r);
        -------------------------------
        int x = 16; 
        double resultado = 0;
        for(int i = 0; i < x; i++){
            if(i*i == x){
                resultado = i;
            }
        }
        System.out.println(resultado);
        --------------------------------
        
        */
    }
}
