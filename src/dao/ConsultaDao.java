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
    
    
    public boolean cadastrarConsulta(Consulta consulta){
               
        String sql = "INSERT INTO consulta (horario,dia,especialidade,exame,tipo,id_medico,id_cliente,nome_cliente,nome_medico) VALUES ( ?,?,?,?,?,?,?,?,?);";

        PreparedStatement stmt = null;
        
        
        
        try {       
            stmt = con.prepareStatement(sql);
            stmt.setString(1, consulta.getHorario()); 
            SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
            stmt.setDate(2, new java.sql.Date(format.parse(consulta.getDia()).getTime()));
            stmt.setString(3, consulta.getEspecialidade());
            stmt.setString(4, consulta.getExame());
            stmt.setString(5,  consulta.getTipo());
            stmt.setString(6, consulta.getId_medico());
            stmt.setString(7, consulta.getId_cliente());
            stmt.setString(8, consulta.getNomeCliente());
            stmt.setString(9, consulta.getNomeMedico());
            
            
            
            stmt.executeUpdate();
            return true;
        
        } catch (SQLException | ParseException ex) {
            System.err.println("Erro: " + ex);
            return false;
        }finally {
            ConnectionFactory.closeConnection(con, stmt);
        }              
    }
    
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
