package controller;

import dao.AtendimentoDao;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import model.Atendimento;
import controller.AutorizacaoController;;

public class ConsultaController {
    
    public ConsultaController(){
        
    }
    
    
    public void cadastrarConsulta(Atendimento consulta){
    	AutorizacaoController autorizar =  new AutorizacaoController(); 
    	
    	if (autorizar.autorizacao(consulta.getTipo())) {
	    	AtendimentoDao daoConsulta = new AtendimentoDao();
	        if(daoConsulta.cadastrarAtendimento(consulta)){
	              JOptionPane.showMessageDialog(null, "Cadastro realizado com sucesso!!!", "Reposta do servidor", JOptionPane.PLAIN_MESSAGE);
	        }       
    	}
    
    }
    
    
    public ArrayList<Atendimento> pesquisarConsulta(String dia, String id_medico){
        AtendimentoDao dao = new AtendimentoDao();
        return dao.pesquisarAtendimento(dia, id_medico);
    }
    
    public ArrayList<Atendimento> pesquisarConsultaCPF(String cpf){
        AtendimentoDao dao = new AtendimentoDao();
        return dao.pesquisarAtendimentoCPF(cpf, " IS NULL", " IS NOT NULL");
    }
    
    public Boolean cancelarContulta(int idConsulta) {
    	AtendimentoDao dao = new AtendimentoDao();
        return dao.cancelarAtendimento(idConsulta);
    	
    }
}
