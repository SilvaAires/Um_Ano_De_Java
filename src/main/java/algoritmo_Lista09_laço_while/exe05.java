package algoritmo_Lista09_laço_while;

/*
5. Supondo a que a população de um país A seja da ordem de 90.000.000 habitantes, com uma taxa
anual de crescimento de 5% e que a população de um país B seja, aproximadamente, de 200.000.000
de habitantes, com a taxa anual de crescimento 2%. Escreva uma classe em Java que calcule e escreva
o número de anos necessários para que a população do país A ultrapasse ou se iguale a população do
país B, mantidas essas taxas de crescimento. 
*/
public class exe05 {
    public static void main(String[] args) {
        double paisA = 90000000;
        double paisB = 200000000;
        int anos = 0;
        while(paisB >= paisA){
            paisA = paisA + (paisA * 0.05); //paisA = paisA * 1.05;
            paisB = paisB + (paisB * 0.02); //paisB = paisB * 1.02;
            anos++;
        }
        System.out.println("País A: " + paisA);
        System.out.println("País B: " + paisB);
        System.out.println("Quant. Anos: " + anos);
    }

}
