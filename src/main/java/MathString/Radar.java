package MathString;

import java.util.Scanner;

public class Radar {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int contUltLimite = 0;
        int maiorVeloc = 0;
        for (int i = 1; i <= 15; i++) {
            System.out.println(i + "º Veículo");
            System.out.print("Velocidade: ");
            int veloc = entrada.nextInt();
            if (veloc <= 40){
                System.out.println("Dentro do limite de velocidade!");
            }
            else{                
                if ((veloc >= 41) && (veloc <= 48)){
                    System.out.println("Multa: R$ 85,13");
                    System.out.println("4 pontos na carteira");
                    contUltLimite++;
                }
                else{
                    if ((veloc >= 49) && (veloc <= 60)){
                        System.out.println("Multa: R$ 127,69");
                        System.out.println("5 pontos na carteira");
                        contUltLimite++;
                    }
                    else{
                        System.out.println("Multa: R$ 321,45");
                        System.out.println("8 pontos na carteira");
                        contUltLimite++;
                    }
                }
            }
            if (i == 1){
                maiorVeloc = veloc;
            }
            else{
                if (veloc > maiorVeloc){
                    maiorVeloc = veloc;
                }
            }
        }
        System.out.println("Quant. Veic.: " + contUltLimite);
        System.out.println("Maior velocidade: " + maiorVeloc);
    }
}
