package controller;

import dao.MedicoDao;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import model.Medico;


public class MedicoController {
    
    public MedicoController(){
        
    }
    
    public void cadastrarMedico(Medico medico){
       MedicoDao daoMedico = new MedicoDao();
        if(daoMedico.cadastrarMedico(medico)){
              JOptionPane.showMessageDialog(null, "Cadastro realizado com sucesso!!!", "Reposta do servidor", JOptionPane.PLAIN_MESSAGE);
        }       
    }
    
    public ArrayList<Medico> pesquisarMedico(){
        MedicoDao daoMedico = new MedicoDao();
        return daoMedico.pesquisarMedico();
    }
}
