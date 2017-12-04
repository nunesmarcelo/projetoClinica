package dao;

import java.sql.Connection;
import connection.ConnectionFactory;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import model.Consulta;

public class ConsultaDao {
    Connection con = null;
    
    
    public ConsultaDao(){
        con = ConnectionFactory.getConnection();
    }
    
    /*
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
    */
    public ArrayList<Consulta> pesquisarConsulta(String dia,String id_medico){
        String sql;
        PreparedStatement stmt = null;
        
        sql = "SELECT * FROM consulta WHERE dia = ? AND id_medico = ?";
        try {
            stmt = con.prepareStatement(sql);
            stmt.setString(1, dia);
            stmt.setString(2, id_medico);
            ResultSet rs = stmt.executeQuery();
            ArrayList<Consulta> consulta = null;
            while(rs.next()){
                consulta = new ArrayList<Consulta>();
                Consulta cons = new Consulta();
                
                cons.setId(Integer.toString(rs.getInt("id_consulta")));
                cons.setHorario(rs.getString("horario"));
                cons.setDia(rs.getString("dia"));
                cons.setEspecialidade(rs.getString("especialidade"));
                cons.setExame(rs.getString("exame"));
                cons.setTipo(rs.getString("tipo"));
                cons.setId_medico(rs.getString("id_medico"));
                cons.setId_cliente(rs.getString("id_cliente"));
                
                
                consulta.add(cons);
            }
            
            return consulta;
        } catch (SQLException ex) {
            System.err.println("Erro: " + ex);
            return null;
        }finally {
            ConnectionFactory.closeConnection(con, stmt);
            
        }  
        
        
    }
}
