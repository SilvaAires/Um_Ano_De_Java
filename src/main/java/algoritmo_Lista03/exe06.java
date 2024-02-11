package algoritmo_Lista03;

/*
6. Luiz e seus quatro filhos herdaram uma fazenda de 65 hectares que, conforme o testamento, deveria
ser dividida da seguinte maneira: as terras seriam divididas igualmente em hectares entre os filhos de Luiz,
e ele ficaria com o resto dessa divisão. Escreva um programa que calcule o total de hectares que Luiz e cada
um dos seus quatro filhos receberá.
*/
public class exe06 {
    public static void main(String []args){
        System.out.println("Total de ha para cada um dos seus filhos: " + (65/4)+"\nTotal para seu Luiz: "+(65%4));
    }
}
