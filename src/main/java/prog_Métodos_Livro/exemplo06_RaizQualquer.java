package prog_Métodos_Livro;

/*
Criar uma função que possa calculara raiz de três números positivos em qualquer
índice. (Esta é uma função importante, pois a maioria das linguagens só oferece a
função raiz quadrada.) A saída deverá ser assim: PAREI NA PAG 408
*/

public class exemplo06_RaizQualquer {
    public static double raiz(double base, double expo){
        double y = Math.ceil((Math.exp((1/expo) * (Math.log(base)))));
        return y;
    }
    public static void main (String[]args){
        for (int i = 0; i<3;i++){
            System.out.println("Digite primeiro o radicando e depois o indice: ");
            double R = exemplo01.lerDouble();
            double I = exemplo01.lerDouble();
            if (R<0){
                System.out.println("Radicando invalido.Digitado radicando: " +R);
                i--;
            }else{
                if(I <= 1){
                    System.out.println("Indice invalido.Digitado indice: " +I);
                    i--;
                }else{
                    System.out.println("Resultado: "+raiz(R, I));
                }
            }
            System.out.println("\n");
        }
    }
}
