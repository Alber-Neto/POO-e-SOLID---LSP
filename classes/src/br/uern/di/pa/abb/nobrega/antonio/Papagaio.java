package br.uern.di.pa.abb.nobrega.antonio;
import br.uern.di.pa.abb.nobrega.antonio.Passaro;

public class Papagaio extends Passaro{

	private int distancia_maxima=0;

	public Papagaio(int distancia) {
		this.distancia_maxima = distancia;
		
	}

	public int getDistancia_maxima() {
		return distancia_maxima;
	}

	public void setDistancia_maxima(int distancia_maxima) {
		this.distancia_maxima = distancia_maxima;
	}
	
	public void cantar(){
		System.out.println("Papagaio legal");
	}
	
	public int voar(int valor) {
		 
		int distancia=0;
		if( valor >this.distancia_maxima){
			distancia=this.distancia_maxima;
		}
		else {
			distancia=valor;
		}
		
		return distancia;
	}
}
