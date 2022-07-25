package br.uern.di.pa.abb.nobrega.antonio;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int distancia;
		int opcao;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("digite 1 para papagaio e 2 para currupio");
		opcao=input.nextInt();
		
		if(opcao == 1) {
			
			System.out.println("digite uma distancia");
			distancia=input.nextInt();
			
			Papagaio papagaio= new Papagaio(distancia);
			papagaio.setDistancia(distancia);
			
			papagaio.cantar();
			System.out.println("distancia :");
			papagaio.voar(distancia);
			
		}
		if(opcao == 2) {
			
			System.out.println("digite uma distancia");
			distancia=input.nextInt();
			
			Currupio currupio= new Currupio(distancia);
			currupio.setDistancia(distancia);
			currupio.setDistancia(distancia);
			
			currupio.cantar();
			System.out.println("distancia :");
			currupio.voar(distancia);
			
		}
		

	}

}
