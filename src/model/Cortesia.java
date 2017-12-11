package model;

public class Cortesia implements Pagamento{
	
	int contador;
	
	public Cortesia() {
		super();
		this.contador = 0;
	}

	public Boolean autoriza() {
		
		contador++;
		if(contador==5) {
			contador = 0;
			return false;
		}
		
		return true;
	}
}
