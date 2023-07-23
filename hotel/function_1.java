package pkgfinal.project2;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;


public class function {
     Connection c ;
       String qee;
       Statement d;
  int number;
  int floor;
  String tybe ;
  int id ;
    public void addroom( int number ,int floor,String tybe , int id   ){
         this.number=number;
         this.floor=floor;
         this.tybe=tybe;
         this.id=id ;
        try{
           // System.out.println(number,floor,tybe,id);
           
            d=c.createStatement();
            qee="INSERT INTO room (number,floor,tybe,id)" + "VALUES('"+number+"','"+floor+"','"+tybe+"','"+id+"')";
           d.executeUpdate(qee);
             
           System.out.println("add");
           
        }
        catch(SQLException e){
            
            System.out.print(e.getMessage());
        }
        
        
}
}
