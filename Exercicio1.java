package traducaoJava_Vetores_e_Matrizes;

/*1 -	Faça um programa que crie um vetor por leitura com 5 
 * valores de pontuação de uma atividade e o escreva em seguida. 
 * Encontre após a maior pontuação e a apresente. 
 */

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		double[] pont = new double[5];
		double maior=0;
		
		for (int i=0; i<pont.length;i++) {
		System.out.println("Digite a "+(i+1)+"ª pontuação");
		pont[i]=leia.nextDouble();
		
		if(maior<pont[i]) {
		maior=pont[i];		
		}
		
		}
		System.out.println("Maior nota é:"+maior);
		

	}

}
