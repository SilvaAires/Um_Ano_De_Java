package algoritmo_Lista09_laço_while;

import java.util.Scanner;

public class exe022 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int fulano = 0;
        int cicrano = 0;
        int beltrano = 0;
        int nulos = 0;
        int brancos = 0;
        for (int i = 1; i <= 10; i++) {
            System.out.println("1 - Fulano");
            System.out.println("2 - Cicrano");
            System.out.println("3 - Beltrano");
            System.out.println("4 - Branco");
            System.out.println("5 - Nulo");
            System.out.print("Voto: ");
            int voto = entrada.nextInt();
            switch(voto){
                case 1: fulano++; break;
                case 2: cicrano++; break;
                case 3: beltrano++; break;
                case 4: brancos++; break;
                case 5: nulos++; break;
                default: 
                    i--;
                    System.out.println("Candidato não existe!");
                    System.out.println("Vote novamente");
            }
        }
        System.out.println("Total de votos");
        System.out.println("Fulano: " + fulano);
        System.out.println("Cicrano: " + cicrano);
        System.out.println("Beltrano: " + beltrano);
        System.out.println("Votos brancos: " + brancos);
        System.out.println("Votos nulos: " + nulos);
    }
}
