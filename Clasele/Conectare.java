/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clasele;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Dya_Bia
 */
public class Conectare {
    Connection con; 
    Statement st;
    ResultSet rs; 
   
     String host="jdbc:derby://localhost:1527/Georgiana";
     String uName="Georgiana";
     String uPass="55555";
    
    public static Conectare conexiune=null;
    private Conectare(){
        try {
            Class.forName("org.apache.derby.jdbc.ClientDriver").newInstance(); 
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Conectare.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) { 
            Logger.getLogger(Conectare.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(Conectare.class.getName()).log(Level.SEVERE, null, ex); 
        }
        try{ this.con=DriverManager.getConnection(host,uName, uPass);
        System.out.println("conectat"); 
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    public static Conectare getConnection(){ 
        if(conexiune == null) conexiune = new Conectare(); 
    return conexiune; }
    
    public ArrayList<Eveniment> getEvenimente(){ 
        ArrayList<Eveniment> ret1 = new ArrayList<Eveniment>();
    
    try { 
    String sql="select * from GEORGIANA.EVENIMENTE";

    st = con.createStatement(); 
    rs =st.executeQuery(sql); 
    while(rs.next()) 
    {
            int id=rs.getInt("ID");
          
            String first=rs.getString("TipEveniment");
            String second=rs.getString("LocEveniment");
            String third=rs.getString("ZiuaEveniment");
            String fourth=rs.getString("LunaEveniment");
            String fifth=rs.getString("AnulEveniment");
            String sixth=rs.getString("OraEveniment");
            Eveniment even = new Eveniment (id, first , second, third , fourth , fifth, sixth );
            ret1.add(even);
    }
    }catch (SQLException ex) {
        Logger.getLogger(Conectare.class.getName()).log(Level.SEVERE, null, ex); 
    }

    return ret1;
    }
}