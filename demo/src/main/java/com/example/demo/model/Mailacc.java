package com.example.demo.model;


import javax.persistence.Entity;
import javax.persistence.Id;

//this one for mail account
@Entity
public class Mailacc {
    @Id
    private String Email;
    private String Username;
    private String Userpwd;
  

    public Mailacc(){
        
    }

    public Mailacc(String username, String userpwd,String email) {
        Username = username;
        Userpwd = userpwd;
        Email=email;
    }
    public String getUsername(){
        return Username;
    }
    public void setUsername(String Username){
        this.Username=Username;
    }
    public String getUsrpwd(){
        return Userpwd;
    }
    public void setUserpwd(String Userpwd){
        this.Userpwd=Userpwd;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        this.Email = email;
    }
    
}
