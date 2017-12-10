package connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;

public class ConnectionFactory {
    private static final String DRIVER = "com.mysql.jdbc.Driver";
    private static final String URL = "jdbc:mysql://localhost:3306/clinica";
    private static final String USER = "root";
    private static final String PASS = "";
    
    public static Connection getConnection(){
        try {
            Class.forName(DRIVER);
            
             return DriverManager.getConnection(URL, USER, PASS);
        } catch (ClassNotFoundException | SQLException ex) {
        	JOptionPane.showMessageDialog(null, "Houve um erro ao conectar ao banco de dados!\n "
        			+ "Possíveis problemas: \n "
        			+ "1 -> Seu XAMPP, LAMP ou WAMP podem estar desligados.\n"
        			+ "2 -> Se tudo estiver bem, talvez a importação da biblioteca de conexão "
        			+ "não foi feita corretamente.\n"
        			+ "		2.1 -> Clique com o botão direito no projeto, e depois em 'Build Path' e"
        			+ " vá em 'Add External Archives'.\n"
        			+ "		2.2 -> Caminhe até a pasta onde o projeto está instalado, vá na pasta 'lib'"
        			+ " e selecione todos os arquivos de lá.\n"
        			+ "		2.3 -> rode novamente o programa. =) ");
            throw new RuntimeException("Erro na conexão!",ex);
        }
    }
    
    public static void closeConnection(Connection con){
         if(con != null){
             try {
                 con.close();
             } catch (SQLException ex) {
                 System.err.println("Erro ao sair!"+ ex);
             }
         }
    }
    
    public static void closeConnection(Connection con, PreparedStatement stmt){
         closeConnection(con);
         if(stmt != null){
             try {
                 stmt.close();
             } catch (SQLException ex) {
                 System.err.println("Erro ao sair!"+ ex);
             }
         }
         
    }
    public static void closeConnection(Connection con, PreparedStatement stmt, ResultSet rs){
         closeConnection(con,stmt);
         if(rs != null){
             try {
                 rs.close();
             } catch (SQLException ex) {
                System.err.println("Erro ao sair!"+ ex);
             }
         }
         
    }
}
