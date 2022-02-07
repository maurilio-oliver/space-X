package com.example.server.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
public class Person {
    @Id
    private int id;
    private String name;
    private String lastName;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "persona_id")
    private PersonAccont personAccont;
    
    public PersonAccont getPersonAccont() {
        return personAccont;
    }
    public void setPersonAccont(PersonAccont personAccont) {
        this.personAccont = personAccont;
    }
    
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
public int getId() {
    return id;
}
public void setId(int id) {
    this.id = id;
}

@Override
public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + id;
    return result;
}

@Override
public boolean equals(Object obj) {
    if (this == obj)
        return true;
    if (obj == null)
        return false;
    if (getClass() != obj.getClass())
        return false;
    Person other = (Person) obj;
    if (id != other.id)
        return false;
    return true;
}



    
}
