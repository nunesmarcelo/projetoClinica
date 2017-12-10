package model;

import java.util.Random;

public class Convenio implements Pagamento{
	
	int contador;
	
	public Convenio() {
		super();
		this.contador = 0;
	}

	public Boolean autoriza() {
		
		contador++;
		if(contador>10) {
			contador = 0;			
			return  (this.escolhe() == 0) ? false : true; 
			
		}
		
		return false;
	}
	
	private int escolhe() {
		Random gerador = new Random();
		int x ;
		x = gerador.nextInt(2);
		return x;
		
	}

}
