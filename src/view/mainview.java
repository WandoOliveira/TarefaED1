package view;

import Controller.Controller;

public class mainview {
	
	public static void main(String[] args) {
		Controller x = new Controller();
		
		fatorial(x);
		vetorNegativo(x);
		stringInvertida(x);
	}
	
	public static void fatorial(Controller x) {
		int resultado = x.fatorial(12);
		System.out.println("Fatorial = " + resultado);
	}
	
	public static void vetorNegativo(Controller x) {
		int[] vetor = {1, -1, 1, -1, 1, 1, -1};
		int resultado =  x.vetorNegativo(vetor, vetor.length);
		System.out.println("Elementos Negativos = "+resultado);
	}
	
	public static void stringInvertida(Controller x) {
		String palavra = "FATECZL2022";
		String resultado = x.stringInvertida(palavra, palavra.length());
		System.out.println("String Invertido = "+resultado);
	}

}
