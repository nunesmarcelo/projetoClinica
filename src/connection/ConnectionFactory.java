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
        			+ "PossÌveis problemas: \n "
        			+ "1∫ -> Seu XAMPP, LAMP ou WAMP podem estar desligados.\n"
        			+ "2∫ -> Se tudo estiver bem, talvez a importaÁ„o da biblioteca de conex„o "
        			+ "n„o foi feita corretamente.\n"
        			+ "		2.1 -> Clique com o bot„o direito no projeto, e depois em 'Build Path' e"
        			+ " v· em 'Add External Archives'.\n"
        			+ "		2.2 -> Caminhe atÈ a pasta onde o projeto est· instalado, v· na pasta 'lib'"
        			+ " e selecione todos os arquivos de l·.\n"
        			+ "		2.3 -> rode novamente o programa. =) ");
            throw new RuntimeException("Erro na conex√£o!",ex);
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
