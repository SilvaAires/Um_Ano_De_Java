package variantes_Exe;

import java.util.Scanner;

public class for_Media {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        for(int i = 1; i <= 5; i++){
            System.out.println(i + "º Estudante");
            System.out.print("1ª Nota: ");
            double nota1 = entrada.nextDouble();
            System.out.print("2ª Nota: ");
            double nota2 = entrada.nextDouble();
            System.out.print("3ª Nota: ");
            double nota3 = entrada.nextDouble();
            double media = (nota1 + nota2 + nota3)/3;
            System.out.println("Média: " + media);
            if (media >= 7)
                System.out.println("APROVADO");
            else
                System.out.println("EXAME");
        }
    }
}
