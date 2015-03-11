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
public class databaseexecutes {
    Connection dbprojekt;
    Statement statement;
    
    public void DatabaseConnection(){
        try {
            Class.forName("org.postgresql.Driver").newInstance();
            dbprojekt = DriverManager.getConnection("jdbc:postgresql://localhost:5432/projekt","postgres","123");
            statement = dbprojekt.createStatement();
        } catch (Exception ex) {
            Logger.getLogger(databaseexecutes.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public ResultSet SQLQuerry(String query){
        ResultSet result;
        try {
            result=statement.executeQuery(query);
            return result;
        } catch (SQLException ex) {
           System.out.println("Bei der Abfrage " + query + "ist folgender Fehler " + ex.getMessage() + " aufgetreten");
        }
        return null;
    }   
    
    public int SQLUpdate(String query){
       return 0; 
    }
    
    public void disconnectDatabase (){
        try {
            statement.close();
            dbprojekt.close();
        } catch (SQLException ex) {
            Logger.getLogger(databaseexecutes.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
