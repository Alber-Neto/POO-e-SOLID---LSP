package br.uern.di.pa.abb.nobrega.antonio;

public class Papagaio extends Passaro{

	private int distancia;
	static private int distancia_maxima;

	public Papagaio(int distancia) {
		this.distancia = distancia;
		distancia_maxima=10;
	}

	public int getDistancia() {
		return distancia;
	}

	public void setDistancia(int distancia) {
		this.distancia = distancia;
	}
	
	public void cantar(){
		System.out.println("Papagaio legal");
	}
	
	public int voar(int distancia) {
		 
		int resultado;
		
		if(distancia<distancia_maxima) {
			resultado=distancia;
		 }
		 
		else {
			resultado=distancia_maxima; 
		}
		
		System.out.println(resultado);
		return resultado;
	}
}
