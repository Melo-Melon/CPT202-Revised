package com.example.demo.model;


import javax.persistence.Entity;
import javax.persistence.Id;

//This one for account using verify code
@Entity
public class Codeacc {
    @Id
    private String Email;
    private String Username;
    private String Userpwd;
    private String Code;

    public Codeacc(){
        
    }

    public Codeacc(String username, String userpwd,String email,String code) {
        Username = username;
        Userpwd = userpwd;
        Email=email;
        Code=code;
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

    public String getCode() {
        return Code;
    }

    public void setCode(String code) {
        this.Code = code;
    }
    
}
