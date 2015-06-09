/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package database;

/**
 *
 * @author sfey
 */
public class user{
//private String name;
private int user_id;

private static final user userObjekt = new user();

public user (int id){
this.user_id=id;
}

    private user() {
        }
    
    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }
    
     public static user GetInstance()
    {
        return userObjekt;
    }
}