package prog_Métodos;

/*
6. Elaborar um programa que leia um ano qualquer
escolhido pelo usuário. O programa deverá implementar
um método que escreva se o respectivo ano é bissexto
ou não.
◦ Dica: um ano é bissexto se:
◦ For divisível por 4 e não for divisível por 100 ou
◦ For divisível por 4 e por 400.
*/

public class exe06 {
    public static boolean b6 (int n){
        if(((n%4==0)&&(n%100!=0))||((n%4==0)&&(n%400==0))){
            System.out.println("É bissexto");
            return true;
        }
        else{
            System.out.println("Não é bissexto");
            return false;
        }
    }
    public static void main(String []args){
        int n = exe02.lernum();
        b6(n);
    }
}
