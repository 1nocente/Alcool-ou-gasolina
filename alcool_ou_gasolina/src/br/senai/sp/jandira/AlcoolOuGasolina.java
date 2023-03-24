package br.senai.sp.jandira;

import java.util.Scanner;

public class AlcoolOuGasolina {

	public static void main(String[] args) {
		
		Scanner input =  new Scanner(System.in);
		
		  System.out.println("*************************************");
	      System.out.println("          ÁLCOOL OU GASOLINA         ");
	      System.out.println("*************************************");
	      
	      System.out.print("Preço da gasolina em R$: ");
		     double custogasolina = input.nextDouble();
		     
		     System.out.print("Preço do álcool em R$: ");
		     double custoalcool = input.nextDouble();
		     
		     double eficiencia = custogasolina * 0.7;
		     if (eficiencia < custoalcool){
		    	 System.out.println("O melhor custo benefício é gasolina");
		     } else {
		    	 System.out.println("O melhor custo benefício é álcool");
		     }
	      
		
		

	}

}
