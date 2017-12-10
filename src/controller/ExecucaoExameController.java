package controller;

import dao.AtendimentoDao;
import dao.ExameDao;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import model.Atendimento;
import controller.AutorizacaoController;;

public class ExecucaoExameController {
    
    public ExecucaoExameController(){
        
    }
    
    
    public void cadastrarExecucaoExame(Atendimento exame){
    	AutorizacaoController autorizar =  new AutorizacaoController(); 
    	
    	if (autorizar.autorizacao(exame.getTipo())) {
	    	AtendimentoDao daoExecExame = new AtendimentoDao();
	        if(daoExecExame.cadastrarAtendimento(exame)){
	              JOptionPane.showMessageDialog(null, "Cadastro realizado com sucesso!!!", "Reposta do servidor", JOptionPane.PLAIN_MESSAGE);
	        }       
    	}
    
    }
    
    
    
    public ArrayList<Atendimento> pesquisarExameCPF(String cpf){
    	AtendimentoDao dao = new AtendimentoDao();
        return dao.pesquisarAtendimentoCPF(cpf, " IS NOT NULL", " IS NULL");
    }
    
    public Boolean cancelarExame(int idConsulta) {
    	AtendimentoDao dao = new AtendimentoDao();
        return dao.cancelarAtendimento(idConsulta);
    	
    }
}
