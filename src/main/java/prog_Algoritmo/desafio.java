package prog_Algoritmo;

public class desafio {
    public static void main(String[] args) {
        for(int j=1; j<=9; j++) {           
            System.out.println();           
            for(int k=9; k>=j; k--) {
                System.out.print(" ");
            }           
            for(int i=1; i<=j; i++) {              
                System.out.print(i);           
            }           
            for(int k=j-1; k>0; k--) {
                System.out.print(k);
            }
        }       
        for(int j=8; j>=1; j--) {           
            System.out.println();           
            for(int k=9; k>=j; k--) {
                System.out.print(" ");
            }           
            for(int i=1; i<=j; i++) {              
                System.out.print(i);               
            }           
            for(int k=j-1; k>0; k--) {
                System.out.print(k);
            }
        }
    }
}
