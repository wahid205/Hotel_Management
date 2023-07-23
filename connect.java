import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;


public class connect {
    String qee;
       Statement d ;
    private String user="root";
    private  String password="";
    private String url="jdbc:mysql://localhost/hotel";
    
     public Connection connect() throws SQLException{
        
         Connection c = DriverManager.getConnection(url,user,password);
         return c;

}
     
        
      
  
}