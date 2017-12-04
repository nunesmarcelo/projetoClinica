package controller;

import dao.ClienteDao;
import javax.swing.JOptionPane;
import model.Cliente;


public class ClienteController {
    
    public ClienteController(){
        
    }
    
    public void cadastrarCliente(Cliente cliente){
       ClienteDao daoCliente = new ClienteDao();
        if(daoCliente.cadastrarCliente(cliente)){
              JOptionPane.showMessageDialog(null, "Cadastro realizado com sucesso!!!", "Reposta do servidor", JOptionPane.PLAIN_MESSAGE);
        }       
    }
    
    public Cliente pesquisarCliente(String nome, String cpf){
        ClienteDao dao = new ClienteDao();
        return dao.pesquisarCliente(nome, cpf);
    }
}
