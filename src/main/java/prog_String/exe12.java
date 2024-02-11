package prog_String;

import java.util.Scanner;

/*
12. Construir um programa que seja capaz de embaralhar
uma string s1 com uma string s2 e colocar o resultado
em uma string s3. Para embaralhar s1 com s2 é
necessário preencher os índices pares de s3 com os
elementos de s1 e os ímpares com os elementos de s2
até que os elementos de uma das duas strings termine e
os demais elementos de S3 serão preenchidos com os
elementos da string restante. Considere o índice 0 (zero)
como sendo par.
◦ Por exemplo:
◦ s1=local
◦ s2=misterio
◦ Nova string s3= lmoicsatlerio
*/

public class exe12 {
    public static void main (String []args){
        Scanner e = new Scanner(System.in);
        System.out.println("Digite uma String1: ");
        String s1 = e.nextLine();
        System.out.println("Digite uma String2: ");
        String s2 = e.nextLine();
        char v [] = s1.toLowerCase().toCharArray();
        char v2 [] = s2.toLowerCase().toCharArray();
        char v3 [] = new char[v.length+v2.length];
        int cs1 = 0;
        int cs2 = 0;
        for(int i = 0; i<v3.length;i++){
            if (i%2==0){
                v3[i] = v[cs1];
                cs1++;
            }else{
                if(cs2 < v2.length){
                    v3 [i]=v2[cs2];
                    cs2++;
                }
            }
        }
        for(int i=0; i<v3.length; i++){
            System.out.print(v3[i]+" ");
        }
    }
}
