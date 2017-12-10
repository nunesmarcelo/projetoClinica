package controller;

import dao.ConsultaDao;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import model.Consulta;
import controller.AutorizacaoController;;

public class ConsultaController {
    
    public ConsultaController(){
        
    }
    
    
    public void cadastrarConsulta(Consulta consulta){
    	AutorizacaoController autorizar =  new AutorizacaoController(); 
    	
    	if (autorizar.autorizacao(consulta.getTipo())) {
	    	ConsultaDao daoConsulta = new ConsultaDao();
	        if(daoConsulta.cadastrarConsulta(consulta)){
	              JOptionPane.showMessageDialog(null, "Cadastro realizado com sucesso!!!", "Reposta do servidor", JOptionPane.PLAIN_MESSAGE);
	        }       
    	}
    
    }
    
    
    public ArrayList<Consulta> pesquisarConsulta(String dia, String id_medico){
        ConsultaDao dao = new ConsultaDao();
        return dao.pesquisarConsulta(dia, id_medico);
    }
}
