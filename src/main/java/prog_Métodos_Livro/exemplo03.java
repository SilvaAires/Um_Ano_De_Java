package prog_Métodos_Livro;

/*
Criar uma função que converta graus para radianos.
*/
public class exemplo03 {
    public static double rad (double n){
        double r = n*Math.PI/180;
        return r;
    }
    public static void main(String [] args){
        System.out.println("Conversor de graus (Angulos) em radianos (Rad)");
        //rad(exemplo01.lerDouble());
        System.out.println("Resultado em radiano: "+rad(exemplo01.lerDouble())+" rad");
    }
}
