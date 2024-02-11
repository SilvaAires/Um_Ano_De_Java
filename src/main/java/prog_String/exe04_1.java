package prog_String;

import java.util.Scanner;

/*4. Escreva um programa que receba uma string e imprima
o número de ocorrências de cada caractere na string.
*/

public class exe04_1 {
    public static void main(String []args){
        char alfabeto [] = new char[26];
        for (int i = 97; i < alfabeto.length+97; i++){
            alfabeto[i-97]= (char)i;
        }
        Scanner e = new Scanner(System.in);
        System.out.print("Digite uma frase: ");
        String frase = e.nextLine();
        char vetletra[] = frase.toLowerCase().toCharArray();
        int cont[] = new int[26];
        for(int i=0; i<cont.length; i++){
            cont[i] = 0;
        }
        for(int i = 0; i<vetletra.length; i++){
            for(int j = 0; j<alfabeto.length; j++){
                if(vetletra[i] == alfabeto[j]){
                    cont[j]++;
                }
            }
        }
        for(int i = 0; i<cont.length; i++){
            if (cont[i] != 0){
                System.out.println((char)(i+97)+": "+cont[i]);
            }
        }
    }
}