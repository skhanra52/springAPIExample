package com.skhanra52.springapi.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Customer {

    @Id // to mark the cid as primary key in the database mapping we used @ID annotation.
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int cid;
    String name;
    String email;

    public Customer(int cid, String name, String email) {
        this.cid = cid;
        this.name = name;
        this.email = email;
    }

    public Customer(){
        super();
    }

    public int getCid() {
        return cid;
    }

    public void setCid(int cid) {
        this.cid = cid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "cid=" + cid +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
