 package algoritmo_Lista03;

import java.util.Scanner;

/*
3. Escreva um programa que solicite que o usuário digite a distância total (em km) percorrida por um
automóvel e a quantidade de combustível (em litros) consumida para percorrê-la. O programa deve calcular
e mostrar o consumo médio de combustível. 
*/

public class exe03 {
    public static void main(String []args){
        Scanner e = new Scanner (System.in);
        System.out.println("Digite a distancia total e a quantidade de combustivel, separado por espaco: ");
        int dT = e.nextInt();
        int qC = e.nextInt();
        //*int cM = dT/qC;
        System.out.println("Consumo medio de combustivel em litros por km: " + (dT/qC));
    }
}
