package prog_String;

import java.util.Scanner;

/*
5. Escreva um programa que receba uma string econverta
todos os caracteres dos índices pares para maiúsculo e
todos os caracteres dos índices ímpares para minúsculo
– exibindo o resultado na tela. (Ex: "arara“ => "aRaRa").
*/

public class exe05 {
    public static void main(String [] args){
        Scanner e = new Scanner(System.in);
        System.out.println("Digite uma String: ");
        String s = e.nextLine();
        String f ="";
        char frasem[] = s.toLowerCase().toCharArray();
        char fraseM[] = s.toLowerCase().toCharArray();
        for (int i = 0; i<frasem.length;i++){
            if(i%2==0){
                f +=fraseM[i];
            }else{ 
                f +=frasem[i];
            }
        }
        System.out.println(f);
    }
}