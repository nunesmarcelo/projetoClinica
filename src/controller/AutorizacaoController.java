package controller;

import model.Consulta;
import model.Convenio;
import model.Cortesia;
import model.Cartao;
import model.Cheque;
import model.Convenio;
import model.Dinheiro;

public class AutorizacaoController {
	
	Convenio convenio;
	Cortesia cortesia;
	Cartao cartao;
	Cheque cheque;
	Dinheiro dinheiro;																				
	
	public AutorizacaoController() {
		super();
		this.convenio = new Convenio();
		this.cortesia = new Cortesia();
		this.cartao = new Cartao();
		this.cheque = new Cheque();
		this.dinheiro = new Dinheiro();
	}
	
	public Boolean autorizacao(String tipoPagamento) {
		Boolean aux = true;
		switch (tipoPagamento) {
		case "Convênio":
			//return autorizaConvenio(this.convenio);
			aux = false;
			break;
		case "Cortesia":
			aux =  autorizaCortesia(this.cortesia);
			break;
		case "Dinheiro":
			aux =  autorizaParticular(this.dinheiro);
			break;
		case "Cartão":
			aux =  autorizaParticular(this.cartao);
			break;
		case "Cheque":
			aux =  autorizaParticular(this.cheque);
			break;
		}
		return aux ;
	}
	
	
	public Boolean autorizaCortesia(Cortesia cortesia) {
		cortesia.autoriza();		
		return true;
	}
	
	public Boolean autorizaParticular(Cheque cheque) {
		cheque.autoriza();
		return true;
	}
	
	public Boolean autorizaParticular(Cartao cartao) {
		cartao.autoriza();
		return true;
	}
	
	public Boolean autorizaParticular(Dinheiro dinheiro) {
		dinheiro.autoriza();
		return true;
	}	

	public Boolean autorizaConvenio(Convenio convenio) {
		return convenio.autoriza();		
	}
}
