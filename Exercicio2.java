package traducaoJava_Vetores_e_Matrizes;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		
		Scanner result = new Scanner(System.in);
		
		double dado[] = new double[10];
		double media=0, maior=0, cont=0, soma=0;
		
		
		for(int i=0; i<dado.length;i++) {
		 System.out.println("Digite o valor do "+(i+1)+"º lançamento: ");	
		 dado[i]=result.nextDouble();
		 
		 soma +=dado[i];
		 media=soma/10;
		 
		 if(maior<dado[i]) {
		 maior = dado[i];	 
		 }
		 if(maior==dado[i]) {
		 cont++;	
		 }
		
		 }
		System.out.println("Maior valor: "+maior+" apareceu: "+cont+" vezes");
		System.out.println("Média dos lançamento é: "+media);
		
		
	}

}
