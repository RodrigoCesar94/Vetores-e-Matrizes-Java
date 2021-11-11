package traducaoJava_Vetores_e_Matrizes;

import java.util.Scanner;

/*3.	Escreve um programa que lê duas matrizes N1 (4,6) e N2(4,6) e cria:
a) Uma matriz M1 cujos elementos 
   serão as somas dos elementos de mesma posição das matrizes N1 e N2;
b) Uma matriz M2 cujos elementos 
serão as diferenças dos elementos de mesma posição das matrizes N1 e N2.
*/

public class Exercicio3 {

	public static void main(String[] args) {
		
	Scanner leia = new Scanner(System.in);
	
	int n1 [][] = new int[2][3];
	int n2 [][] = new int[2][3];
	int m1 [][] = new int[2][3];
	int m2 [][] = new int[2][3];
	int l ,c = 0;
	
	for(l=0; l <n1.length;l++) {
		for(c = 0; c<n1[l].length; c++) {
		System.out.printf("Digite os valores da Matriz N1 [%d] [%d] : ", l,c );
		n1[l][c]=leia.nextInt();	
	}
	}
	
	System.out.println("\n");
	
	for(l=0; l <n2.length;l++) {
		for(c = 0; c<n2[l].length; c++) {
		System.out.printf("Digite os valores da Matriz N2 [%d] [%d] : ", l,c );
		n2[l][c]=leia.nextInt();	
		
		m1[l][c] = n1[l][c] + n2[l][c];
		m2[l][c] = n1[l][c] - n2[l][c];
    }	
	}
	System.out.println("==Matriz M1==");
	for(l=0; l <m1.length;l++) {
		for(c = 0; c<m1[l].length; c++) {
			System.out.print(m1[l][c] + " | ");	
	}
		System.out.println("\n");	
	}
	System.out.println("==Matriz M2==");
	for(l=0; l <m2.length;l++) {
		for(c = 0; c<m2[l].length; c++) {
			System.out.print(m2[l][c] + " | ");	
	}
		System.out.println("\n");	
	}
	}
	}
	
