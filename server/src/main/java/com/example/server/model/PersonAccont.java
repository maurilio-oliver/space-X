package com.example.server.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;

@Entity
public class PersonAccont {
   
    @Id
    private int id;
   // private Date creat_at = new Date();
    private String email;
    private String senha;
   
    @ManyToOne
    @JoinColumn(name="person_id")
   private Person person;
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    // public Date getCreat_at() {
    //     return creat_at;
    // }

    // public void setCreat_at(Date creat_at) {
    //     this.creat_at = creat_at;
    // }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    
    public Person getPerson() {
        return person;
    }
    public void setPerson(Person person) {
        this.person = person;
    }
}
