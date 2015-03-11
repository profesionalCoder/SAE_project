/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author sfey
 */
public class loginchecker {
    
    public static int logincheck(String eingabe_name,String eingabe_password) throws SQLException{
        Connection dbprojekt; //Variabler Name für die Verbindung
            Statement statement; //Befehlskanal
            ResultSet rs_zugriff; //Result Set
            dbprojekt = DriverManager.getConnection("jdbc:postgresql://localhost:5432/projekt", "postgres", "123");
        statement = dbprojekt.createStatement();
        String sql_zugriff = "SELECT * FROM login WHERE login_name='"+eingabe_name+"' AND password='"+eingabe_password+"'";
        rs_zugriff=statement.executeQuery(sql_zugriff);        
         int zugriff=0;
         if(rs_zugriff.next()){
             zugriff=1;
         }        
        return zugriff;
    }   
    
    public static void setloginId(String eingabe_name,String eingabe_password) throws SQLException{
        Connection dbprojekt;
        Statement statement;
        ResultSet rs_id;
        dbprojekt = DriverManager.getConnection("jdbc:postgresql://localhost:5432/projekt", "postgres", "123");
        statement = dbprojekt.createStatement();
        String sql_id = "SELECT login_id FROM login WHERE login_name='"+eingabe_name+"' AND password='"+eingabe_password+"'";
        rs_id=statement.executeQuery(sql_id);
        int id=0;
        while (rs_id.next()){
            id=Integer.parseInt(rs_id.getString("login_id"));
        }
        user.GetInstance().setUser_id(id);
    }
}
