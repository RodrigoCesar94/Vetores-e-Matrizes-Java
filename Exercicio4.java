package traducaoJava_Vetores_e_Matrizes;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int valor [][] = new int [3][3];
		int somavalor=0, somadiagonal=0;
		
		
		for(int l =0;l < valor.length;l++) {
		 for(int c = 0; c < valor[l].length;c++) {
		System.out.printf(" Digite os valores da Matriz: [%d]  [%d]", l,c);
		valor[l][c]=scan.nextInt();
		
		somavalor+=valor[l][c];
		if (l==c) {
		somadiagonal +=valor[l][c];	
		}
		
		}
	}
		
		System.out.println("soma dos valores da Matriz é: "+somavalor);
		System.out.println("Soma dos valores de Diagonal Principal: "+somadiagonal);
		scan.close();
	}
}
