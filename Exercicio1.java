package traducaoJava_Vetores_e_Matrizes;

/*1 -	Fa�a um programa que crie um vetor por leitura com 5 
 * valores de pontua��o de uma atividade e o escreva em seguida. 
 * Encontre ap�s a maior pontua��o e a apresente. 
 */

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		double[] pont = new double[5];
		double maior=0;
		
		for (int i=0; i<pont.length;i++) {
		System.out.println("Digite a "+(i+1)+"� pontua��o");
		pont[i]=leia.nextDouble();
		
		if(maior<pont[i]) {
		maior=pont[i];		
		}
		
		}
		System.out.println("Maior nota �:"+maior);
		

	}

}
