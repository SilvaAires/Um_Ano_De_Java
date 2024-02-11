/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prog_String;

import java.util.Scanner;

/**
 *
 * @author Silva
 */
public class exe12_Certa {
    public static void main(String[] args) {
		Scanner e = new Scanner(System.in);
		System.out.print("Digite uma palavra: ");
		String ss1 = e.next();
		System.out.print("Digite outra palavra: ");
		String ss2 = e.next();
		
		char s1[] = ss1.toCharArray();
		char s2[] = ss2.toCharArray();
		char s3[] = new char[s1.length+s2.length];
		int cs1=0;
		int cs2=0;
		for(int i=0; i<s3.length; i++) {
			if(i%2==0) {
				if(cs1 < s1.length) {
					s3[i] = s1[cs1];
					cs1++;								
				}else {
					s3[i] = s2[cs2];
					cs2++;
				}
			}else {	
				if(cs2 < s2.length) {
					s3[i] = s2[cs2];
					cs2++;
				}else {
					s3[i] = s1[cs1];
					cs1++;
				}
			}
		}
		
		for(int i=0; i<s3.length; i++) {
			System.out.print(s3[i] + " ");
		}
		
	}
}
