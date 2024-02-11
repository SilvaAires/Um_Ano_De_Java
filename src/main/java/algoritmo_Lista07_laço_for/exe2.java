package algoritmo_Lista07_laço_for;

/*
2. Escreva uma classe em Java que verifique e exiba todos os números múltiplos de 8 entre 1 e 100. 
*/

public class exe2 {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            int resto = i % 8;
            if (resto == 0){
                System.out.println(i + " é múltiplo de 8");
            }
        }
    }
}
