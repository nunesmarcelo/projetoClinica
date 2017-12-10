package controller;

import dao.ExameDao;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import model.Atendimento;
import controller.AutorizacaoController;;

public class ExameController {
    
    public ExameController(){
        
    }
    
    
    public void cadastrarExame(Atendimento Exame){
    	AutorizacaoController autorizar =  new AutorizacaoController(); 
    	
    	if (autorizar.autorizacao(Exame.getTipo())) {
	    	ExameDao daoConsulta = new ExameDao();
	        if(daoConsulta.cadastrarExame(Exame)){
	              JOptionPane.showMessageDialog(null, "Cadastro realizado com sucesso!!!", "Reposta do servidor", JOptionPane.PLAIN_MESSAGE);
	        }       
    	}
    
    }
    
    
    public ArrayList<Atendimento> pesquisarExame(String dia, String id_medico){
        ExameDao dao = new ExameDao();
        return dao.pesquisarExame(dia, id_medico);
    }
    
    public ArrayList<Atendimento> pesquisarExameCPF(String cpf){
    	ExameDao dao = new ExameDao();
        return dao.pesquisarExameCPF(cpf);
    }
    
    public Boolean cancelarExame(int idConsuta) {
    	ExameDao dao = new ExameDao();
        return dao.cancelarExame(idConsuta);
    	
    }
}
