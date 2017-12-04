package dao;

import java.sql.Connection;
import connection.ConnectionFactory;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Cliente;

public class ClienteDao {
    Connection con = null;
    
    
    public ClienteDao(){
        con = ConnectionFactory.getConnection();
    }
    
    public boolean cadastrarCliente(Cliente cliente){
               
        String sql = "INSERT INTO cliente (nome,cpf,rg,endereco,bairro,cidade,celular,telefone,email,data_nasc) VALUES ( ?,?,?,?,?,?,?,?,?,?);";

        PreparedStatement stmt = null;
        
        try {       
            stmt = con.prepareStatement(sql);
            stmt.setString(1, cliente.getNome());
            stmt.setString(2, cliente.getCpf());
            stmt.setString(3, cliente.getRg());
            stmt.setString(4, cliente.getEndereco());
            stmt.setString(5,  cliente.getBairro());
            stmt.setString(6, cliente.getCidade());
            stmt.setString(7, cliente.getCelular());
            stmt.setString(8, cliente.getTelefone());
            stmt.setString(9, cliente.getEmail());
            SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
            stmt.setDate(10, new java.sql.Date(format.parse(cliente.getDataNasc()).getTime()));
            
            stmt.executeUpdate();
            return true;
        
        } catch (SQLException | ParseException ex) {
            System.err.println("Erro: " + ex);
            return false;
        }finally {
            ConnectionFactory.closeConnection(con, stmt);
        }              
    }
    
    public Cliente pesquisarCliente(String nome , String cpf){
           String sql = "SELECT * FROM cliente WHERE nome = ? AND cpf = ?;";
           
           PreparedStatement stmt = null;
           
        try {
            stmt = con.prepareStatement(sql);
            stmt.setString(1,nome);
            stmt.setString(2,cpf);
            ResultSet rs = stmt.executeQuery();
            Cliente cliente = null;
            while(rs.next()){
                cliente = new Cliente();
                cliente.setNome(rs.getString("nome"));
                cliente.setBairro(rs.getString("bairro"));
                cliente.setCelular(rs.getString("celular"));
                cliente.setCidade(rs.getString("cidade"));
                cliente.setCpf(rs.getString("cpf"));
                cliente.setDataNasc(rs.getString("data_nasc"));
                cliente.setEmail(rs.getString("email"));
                cliente.setEndereco(rs.getString("endereco"));
                cliente.setId(rs.getString("id_cliente"));
                cliente.setTelefone(rs.getString("telefone"));
                cliente.setRg(rs.getString("rg"));
                
            }
            return cliente;
            
        } catch (SQLException ex) {
            System.err.println("Erro: " + ex);
            return null;
        }
    }
}
