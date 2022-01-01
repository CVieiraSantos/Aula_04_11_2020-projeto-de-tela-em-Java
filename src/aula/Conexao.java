package aula;


import java.sql.Connection;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Conexao {
	
	private Connection connection;
    private Statement statement;

    public Conexao() {
    	try {
			Class.forName("org.gjt.mm.mysql.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	
    	try {
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3311/aulap", "root", "root");
			statement = connection.createStatement();
		} 
    	
    	catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}    	    	    	
    	
    }
    
    public void cadastrar(String email, String nome, double telefone) {
		
    	  try
          {
              statement.executeUpdate("insert into Agenda values('"+email+"','"+nome+"','"+telefone+"')");
          }
          catch(SQLException e)
          {
              e.printStackTrace();
          } 
    	    			  
	}
    
    public String consultarNome(String nome) {
    	
    	 try
         {
             ResultSet rs = statement.executeQuery("select * from Agenda where nome="+nome);
             rs.next();
             return rs.getString("nome");
         }
         
         catch(SQLException e)
         {
             e.printStackTrace();
         }
         
         return "";
    	
    }
    
    
    public double consultarTelefone(double email) {
    	
    	try
        {
            ResultSet rs = statement.executeQuery("select * from Agenda where email='"+email+"'");
            rs.next();
            return rs.getDouble("telefone");
        }
        
        catch(SQLException e)
        {
            e.printStackTrace();
        }
        
        return 0.0;
    	
    }
    
    
}
