package prog_Métodos_Livro;

/*
Criar um algoritmo para calcular o logaritmo de três números em qualquer base,
usando uma função. 
*/
public class exemplo05 {
    public static double Log(double l, double b){
        double r = Math.log(l)/Math.log(b);
        return r;
    }
    public static void main(String[] args){
        for (int i = 0; i <3; i++){
            System.out.println("Digite primeiro o logaritmando e depois a base");
            double l = exemplo01.lerDouble();
            double b = exemplo01.lerDouble();
            if(l<=0){
                System.out.println("lnvalido.Digite logaritmando maior do que O: " + l);
                i--;
            }else{
                if(b<=1){
                    System.out.println("lnvalido.digite base maior que O e diferente de 1: " +b);
                    i--;
                }else{
                    System.out.println("Resultado: "+Log(l, b));
                }
            }
            System.out.println("\n");
        }
    }
}
