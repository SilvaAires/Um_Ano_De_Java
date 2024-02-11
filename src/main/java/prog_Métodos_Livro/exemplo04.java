package prog_Métodos_Livro;

import static prog_Métodos_Livro.exemplo03.rad;

/*
Criar uma função que converta radianos para graus 
*/

public class exemplo04 {
    public static double graus(double n){
        double r = n*180/Math.PI;
        return r;
    }
    public static void main(String[]args){
        System.out.println("Conversor de radianos (Rad) em graus (Angulos)");
        System.out.println("Resultado em graus: "+graus(exemplo01.lerDouble())+" º");
    }
}
