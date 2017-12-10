package dao;

import java.sql.Connection;
import connection.ConnectionFactory;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

import model.Exame;
import model.Medico;

public class ExameDao {
    Connection con = null;
    
    
    public ExameDao(){
        con = ConnectionFactory.getConnection();
    }
    
    public boolean cadastrarExame(Exame exame){
               
        String sql = "INSERT INTO exame (id,nome) VALUES ( null,?);";

        PreparedStatement stmt = null;
        
        
        
        try {       
            stmt = con.prepareStatement(sql);
            stmt.setString(1, exame.getNome());
            
            stmt.executeUpdate();
            return true;
        
        } catch (SQLException ex) {
            System.err.println("Erro: " + ex);
            return false;
        }finally {
            ConnectionFactory.closeConnection(con, stmt);
        }              
    }
    
    public ArrayList<Exame> pesquisarExame(){
        String sql;
        PreparedStatement stmt = null;
        
        sql = "SELECT * FROM exame";
        try {
            stmt = con.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            ArrayList<Exame> exame = new ArrayList<Exame>();
            while(rs.next()){
                Exame exa = new Exame();
                exa.setNome(rs.getString("nome"));
                exa.setId(rs.getInt("idexame"));
                exame.add(exa);
            }
            return exame;
        } catch (SQLException ex) {
            System.err.println("Erro: " + ex);
            return null;
        }finally {
            ConnectionFactory.closeConnection(con, stmt);
            
        }  
        
        
    }
}
