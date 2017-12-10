package controller;

import dao.ExameDao;
import dao.MedicoDao;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JOptionPane;

import model.Exame;
import model.Medico;


public class ExameController {
    
    public ExameController(){
        
    }
    
    public void cadastrarExame(Exame exame){
       ExameDao daoExame = new ExameDao();
        if(daoExame.cadastrarExame(exame)){
              JOptionPane.showMessageDialog(null, "Cadastro realizado com sucesso!!!", "Reposta do servidor", JOptionPane.PLAIN_MESSAGE);
        }       
    }
    
    public ArrayList<Exame> pesquisarExame(){
        ExameDao daoExame= new ExameDao();
        return daoExame.pesquisarExame();
    }
    
    public Exame pesquisarExamePorNome(String nome){
        ExameDao daoExame= new ExameDao();
        return daoExame.pesquisarExamePorNome(nome);
    }
}
