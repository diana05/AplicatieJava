/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package agenda.mea;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;



/**
 *
 * @author Dya_Bia
 */
public class AgendaMea {
    

    /**
     * @param args the command line arguments
     */
   public static void main(String[] args) {
        // TODO code application logic here
       try {
           String host="jdbc:derby://localhost:1527/Georgiana";
           String uName="Georgiana";
           String uPass="55555";
           Connection con=DriverManager.getConnection(host,uName, uPass);
           
           Statement stmt = con.createStatement( );
           String SQL = "SELECT * FROM Persoana";
           ResultSet rs = stmt.executeQuery( SQL );
           
         while(rs.next()){
           int id_col=rs.getInt("ID");
           String NumePer = rs.getString("NumePer");
           String PrenumePer = rs.getString("PrenumePer");
          
           
           String p=id_col + " " + NumePer + " " + PrenumePer;
           System.out.println(p);
           
    }
         
       }
       catch  (SQLException err){
           System.out.println( err.getMessage());
       }
    
}
}
