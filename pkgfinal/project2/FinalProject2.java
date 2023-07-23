/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgfinal.project2;

import java.sql.Connection;
import java.sql.SQLException;
import static javax.management.remote.JMXConnectorFactory.connect;

/**
 *
 * @author m
 */
public class FinalProject2 {

     static Connection s;
    public static void main(String[] args) throws SQLException {
        
        connect d = new connect();
        try {
           s = d.connect();
           System.out.println("connected");
        }
        catch(Exception e){
            
            System.out.println(e.getMessage());
        }
      
        
        
        
        
   login n=new login();
   n.show();
    
    }
    
}
