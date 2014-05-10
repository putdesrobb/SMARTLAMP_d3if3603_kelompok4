/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author ocid
 */
public class Admin {
    private String id ;
    String nama ;
    String username ; // username untuk login
    String password ; // password untuk login
    public Admin(String nama , String newUsername , String newPassword ){
        this.nama = nama ;
        this.username = newUsername ;
        this.password = newPassword ;
    }// Konstruktor
    public Admin(){};
    public void login(){};
    

    
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    
}

    public void setId(String id) {
        this.id = id ;
    }

    /**
     * @return the id
     */
    public String getId() {
        return id;
    }
}