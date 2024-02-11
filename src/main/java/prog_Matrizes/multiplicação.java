package prog_Matrizes;

import java.util.Scanner;

public class multiplicação {
    public static void main(String[] args) {
		Scanner e = new Scanner(System.in);
		int la, ca, lb, cb;
		System.out.print("Quantidade de linhas (A): ");
		la = e.nextInt();
		System.out.print("Quantidade de colunas (A): ");
		ca = e.nextInt();		
		int a[][] = new int[la][ca];
		System.out.print("Quantidade de linhas (B): ");
		lb = e.nextInt();
		System.out.print("Quantidade de colunas (B): ");
		cb = e.nextInt();		
		int b[][] = new int[lb][cb];
		
		if(ca == lb) {
			int linhas = la;
			int colunas = cb;
			int m[][] = new int[linhas][colunas];
			
			System.out.println("Matriz A:");
			for(int i=0; i<a.length; i++) {		
				for(int j=0; j<a[0].length; j++) {				
					System.out.print("Elemento ["+ i +"]["+j+"]: ");
					a[i][j] = e.nextInt();
				}
			}
			System.out.println("\nMatriz B:");
			for(int i=0; i<b.length; i++) {		
				for(int j=0; j<b[0].length; j++) {				
					System.out.print("Elemento ["+ i +"]["+j+"]: ");
					b[i][j] = e.nextInt();
				}
			}
			
			for(int i=0; i<linhas; i++) {
				for(int j=0; j<colunas; j++) {
					for(int k=0; k<a[0].length; k++) {
						m[i][j] = m[i][j] + a[i][k] * b[k][j];
					}
				}
			}
			
			System.out.println("\nMatriz A:");
			for(int i=0; i<a.length; i++) {
				System.out.println();
				for(int j=0; j<a[0].length; j++) {				
					System.out.print(a[i][j] + " ");					
				}
			}
			
			System.out.println("\nMatriz B:");
			for(int i=0; i<b.length; i++) {
				System.out.println();
				for(int j=0; j<b[0].length; j++) {				
					System.out.print(b[i][j] + " ");					
				}
			}
			
			System.out.println("\nMatriz M:");
			for(int i=0; i<m.length; i++) {
				System.out.println();
				for(int j=0; j<m[0].length; j++) {				
					System.out.print(m[i][j] + " ");					
				}
			}
			
		}else {
			System.out.println("Dimensões não suportadas");
		}
		
		
		
		
	}
}
