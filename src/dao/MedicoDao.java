package dao;

import java.sql.Connection;
import connection.ConnectionFactory;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Medico;

public class MedicoDao {
    Connection con = null;
    
    
    public MedicoDao(){
        con = ConnectionFactory.getConnection();
    }
    
    public boolean cadastrarMedico(Medico medico){
               
        String sql = "INSERT INTO medico (nome,cpf,rg,endereco,bairro,cidade,celular,telefone,email,data_nasc,crm,especialidade,salario) VALUES ( ?,?,?,?,?,?,?,?,?,?,?,?,?);";

        PreparedStatement stmt = null;
        
        
        
        try {       
            stmt = con.prepareStatement(sql);
            stmt.setString(1, medico.getNome());
            stmt.setString(2, medico.getCpf());
            stmt.setString(3, medico.getRg());
            stmt.setString(4, medico.getEndereco());
            stmt.setString(5,  medico.getBairro());
            stmt.setString(6, medico.getCidade());
            stmt.setString(7, medico.getCelular());
            stmt.setString(8, medico.getTelefone());
            stmt.setString(9, medico.getEmail());
            SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
            stmt.setDate(10, new java.sql.Date(format.parse(medico.getDataNasc()).getTime()));
            stmt.setString(11,  medico.getCrm());
            stmt.setString(12, medico.getEspecialidade());
            stmt.setString(13, medico.getSalario());
            
            stmt.executeUpdate();
            return true;
        
        } catch (SQLException | ParseException ex) {
            System.err.println("Erro: " + ex);
            return false;
        }finally {
            ConnectionFactory.closeConnection(con, stmt);
        }              
    }
    
    public ArrayList<Medico> pesquisarMedico(){
        String sql;
        PreparedStatement stmt = null;
        
        sql = "SELECT * FROM medico";
        try {
            stmt = con.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            ArrayList<Medico> medico = new ArrayList<Medico>();
            while(rs.next()){
                Medico med = new Medico();
                med.setNome(rs.getString("nome"));
                med.setId(Integer.toString(rs.getInt("id_medico")));
                med.setEspecialidade(rs.getString("especialidade"));
                medico.add(med);
            }
            return medico;
        } catch (SQLException ex) {
            System.err.println("Erro: " + ex);
            return null;
        }finally {
            ConnectionFactory.closeConnection(con, stmt);
            
        }  
        
        
    }
}
