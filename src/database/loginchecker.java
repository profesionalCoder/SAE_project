/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package database;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author sfey
 */
public class loginchecker {
    
    public static int logincheck(String eingabe_name,String eingabe_password) throws SQLException{
        databaseexecutes dbverbindung=new databaseexecutes();
        dbverbindung.DatabaseConnection();
        String sql_zugriff = "SELECT * FROM login WHERE login_name='"+eingabe_name+"' AND password='"+eingabe_password+"'";              
         int zugriff=0;
         if(dbverbindung.SQLQuerry(sql_zugriff).next()){
             zugriff=1;
         }        
        return zugriff;
    }   
    
    public static void setloginId(String eingabe_name,String eingabe_password) throws SQLException{
        databaseexecutes dbverbindung= new databaseexecutes();
        dbverbindung.DatabaseConnection();
        String sql_id = "SELECT login_id FROM login WHERE login_name='"+eingabe_name+"' AND password='"+eingabe_password+"'";
        ResultSet rs_id=dbverbindung.SQLQuerry(sql_id);
        int id=0;
        while (rs_id.next()){
            id=Integer.parseInt(rs_id.getString("login_id"));
        }
        user.GetInstance().setUser_id(id);
    }
}
