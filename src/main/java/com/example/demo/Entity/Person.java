package com.example.demo.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Person {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int Id;
    private String name;
    private int goldBonds;

    public Person(int id, String name, int goldBonds) {
        this.Id = id;
        this.name = name;
        this.goldBonds = goldBonds;
    }

    public Person() {}

    public int getId() {
        return this.Id;
    }

    public void setId(int id) {
        this.Id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGoldBonds() {
        return goldBonds;
    }

    public void setGoldBonds(int goldBonds) {
        this.goldBonds = goldBonds;
    }
}
