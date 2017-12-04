package controller;

import dao.ConsultaDao;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import model.Consulta;


public class ConsultaController {
    
    public ConsultaController(){
        
    }
    
    /*
    public void cadastrarCliente(Cliente cliente){
       ClienteDao daoCliente = new ClienteDao();
        if(daoCliente.cadastrarCliente(cliente)){
              JOptionPane.showMessageDialog(null, "Cadastro realizado com sucesso!!!", "Reposta do servidor", JOptionPane.PLAIN_MESSAGE);
        }       
    }
    */
    
    public ArrayList<Consulta> pesquisarConsulta(String dia, String id_medico){
        ConsultaDao dao = new ConsultaDao();
        return dao.pesquisarConsulta(dia, id_medico);
    }
}
