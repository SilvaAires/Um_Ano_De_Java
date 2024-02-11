package variantes_Exe;

import java.util.Random;
import java.util.Scanner;

public class jogoAdivinha {
    public static void main (String []agrs){
        Random rand = new Random();
        int upperbound = 2;
        int int_random = rand.nextInt(upperbound);
        int vida = 2;
        int pontos = 100;
        for(int i = 0; i <= 2; i ++){
            Scanner entrada = new Scanner(System.in);
            System.out.println("Digite o seu numero: ");
            int numero_Us = entrada.nextInt();
            if (numero_Us == int_random){
                System.out.println("Tenho duas palavras pra você PARA BENS, acertou em cheio");
                break;
            }
            else{
                int life = vida - i;
                pontos = pontos - 4;
                System.out.println("Infelizmente vc errou, agora você tem " + life + " de vida e tem " + pontos + " de pontos");
            }
        }
    }
}