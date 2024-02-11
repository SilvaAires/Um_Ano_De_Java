package algoritmo_Lista09_laço_while;

import java.util.Scanner;

/*
2. Escreva uma classe em Java que leia o voto de 10 eleitores, com base nas seguintes opções:
1 – Candidato Fulano
2 – Candidato Cicrano
3 – Candidato Beltrano
4 – Voto em Branco
5 – Voto Nulo
A classe deve determinar e exibir o total de votos para cada candidato. 
*/

public class exe02 {
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
            int op = entrada.nextInt();
            switch(op){
            case 1:
                System.out.println("1 - Fulano");
                fulano ++;
                break;
            case 2:
                System.out.println("2 - Cicrano");
                cicrano++;
                break;
            case 3:
                System.out.println("3 - Beltrano");
                beltrano++;
                break;
            case 4:
                System.out.println("4 - Branco");
                nulos++;
                break;
            case 5:
                System.out.println("5 - Nulo");
                brancos++;
                break;
            default:
                System.out.println("Operação indisponível");
            }
        }
       System.out.println("\n1 +"+fulano+"\n2 +"+cicrano+"\n3 +"+beltrano+"\n4 +"+nulos+"\n5 +"+brancos);
    }
}
