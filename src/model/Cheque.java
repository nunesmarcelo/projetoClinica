package model;
import java.util.Random;

public class Cheque implements Pagamento{
	
	public Boolean autoriza() {
		Random gerador = new Random();
		int x ;
		x = gerador.nextInt(2);
		
		return  (x == 0) ? false : true; 
	}

}
