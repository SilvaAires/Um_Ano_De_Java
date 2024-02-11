package prog_Matrizes;

import java.util.Scanner;

public class jogo_da_velha {
    public static char tabuleiro[][] = new char[3][3];;
	public static void main(String[] args) {		
		Scanner e = new Scanner(System.in);
		for(int i=0; i<tabuleiro.length; i++) {
			for(int j=0; j<tabuleiro[0].length; j++) {
				tabuleiro[i][j] = '-';
			}
		}
		
		imprimir();
		int l, c;
		while(true) {
		System.out.print("\nUsuário X: (L C):");
		l = e.nextInt();
		c = e.nextInt();		
		tabuleiro[l][c] = 'X';
		imprimir();
		
		System.out.print("\nUsuário O: (L C):");
		l = e.nextInt();
		c = e.nextInt();		
		tabuleiro[l][c] = 'O';
		imprimir();
		}
	}
	
	public static void imprimir() {
		System.out.println("\n");
		for(int i=0; i<tabuleiro.length; i++) {
			System.out.println();
			for(int j=0; j<tabuleiro[0].length; j++) {
				System.out.print(tabuleiro[i][j] + " ");
			}
		}

	}
}
