package algoritmo_Trabalho;

import java.util.Scanner;

public class radarVelocidade {
    public static void main(String []args){
        int quant = 0;
        int maior_Vel = 0;
        for (int i = 1; i <= 15; i ++){
            Scanner entrada = new Scanner (System.in);
            System.out.print ("Digite a velocidade em que o carro passou no radar: ");
            int vel = entrada.nextInt();
            if (vel < 40 ){
                System.out.println("Velocidade dentro do limete");
            }
            else{
                if ((vel > 40) && (vel <= 48)){
                    System.out.println("Velocidade até 20 % acima do limite permitido, multa de R$ 85,13 e 4 pontos.");
                    quant = quant +1;
                    if (maior_Vel < vel){
                        maior_Vel = vel;
                    }
                }
                else{
                    if ((vel > 48) && (vel <= 60)){
                        System.out.println("velocidade maior que 20% até 50% acima do "
                                + "limite permitido, multa de R$ 127,69 e 5 pontos.");
                        quant = quant +1;
                        if (maior_Vel < vel){
                            maior_Vel = vel;
                        }
                    }
                    else{
                        if (vel > 60){
                            System.out.println("Velocidade acima de 50% do limite "
                                    + "permitido, multa de R$ 321,45 e 8 pontos.");
                            quant = quant +1;
                            if (maior_Vel < vel){
                                maior_Vel = vel;
                            }
                        }
                    }
                }
            }
        }
        System.out.println("Total de carros que ultrapassou o limite de velocidade = " + quant);
        System.out.println("Maior velocidade registrada no sistema = " + maior_Vel);
    }
}
