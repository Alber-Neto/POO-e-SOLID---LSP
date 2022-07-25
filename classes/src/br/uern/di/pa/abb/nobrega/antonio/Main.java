package br.uern.di.pa.abb.nobrega.antonio;



public class Main {

	public static void main(String[] args) {
		
	Passaro papagaio=new Papagaio(10);
	Passaro currupio=new Currupio(20);
	
	papagaio.cantar();
	System.out.println("papagaio voa: " + papagaio.voar(10));
	System.out.println("papagaio voa: " + papagaio.voar(20));
	
	currupio.cantar();
	System.out.println("currupio voa: " + currupio.voar(5));
	System.out.println("papagaio voa: " + currupio.voar(10));
		
	}
}
