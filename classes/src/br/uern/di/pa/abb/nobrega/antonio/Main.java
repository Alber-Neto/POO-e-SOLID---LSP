package br.uern.di.pa.abb.nobrega.antonio;

import java.util.Scanner;
import br.uern.di.pa.abb.nobrega.antonio.Papagaio;
import br.uern.di.pa.abb.nobrega.antonio.Currupio;

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
			papagaio.setDistancia_maxima(distancia);
			
			papagaio.cantar();
			papagaio.voar(distancia);
			
		}
		if(opcao == 2) {
			
			System.out.println("digite uma distancia");
			distancia=input.nextInt();
			
			Currupio currupio= new Currupio(distancia);
			currupio.setDistancia_maxima(distancia);
			
			currupio.cantar();
			currupio.voar(distancia);
			
		}
		

	}

}
