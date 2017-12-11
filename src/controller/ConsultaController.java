package controller;

import dao.AtendimentoDao;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import model.Atendimento;
import controller.AutorizacaoController;import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
;

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
    
    public ArrayList<Atendimento> pesquisarConsultaExame(String dia, String exame){
        AtendimentoDao dao = new AtendimentoDao();
        try {
            return dao.pesquisarAtendimentoExame(dia, exame);
        } catch (ParseException ex) {
            System.err.println("Erro ao converter a data do JCalendar: "+ ex);
            return null;
        }
    }
    /*
     public ArrayList<Atendimento> pesquisarConsultaExame(String dia, String id_medico){
        AtendimentoDao dao = new AtendimentoDao();
        return dao.pesquisarAtendimento(dia, id_medico);
    }
    */
    public ArrayList<Atendimento> pesquisarConsultaCPF(String cpf){
        AtendimentoDao dao = new AtendimentoDao();
        return dao.pesquisarConsultaCPF(cpf);
    }
    
    public ArrayList<Atendimento> pesquisarExameCPF(String cpf){
        AtendimentoDao dao = new AtendimentoDao();
        return dao.pesquisarExameCPF(cpf);
    }
    
    
    public Boolean cancelarConsulta(String idConsulta) {
    	AtendimentoDao dao = new AtendimentoDao();
        return dao.cancelarAtendimento(idConsulta);
    	
    }
}
