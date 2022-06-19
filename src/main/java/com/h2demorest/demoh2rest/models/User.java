package com.h2demorest.demoh2rest.models;

import javax.persistence.*;

@Entity
@Table(name = "Userss")
public class User {
    public long getId() {
        return id;
    }

    public User() {
    }

    public User(long id, String name, double age, String job) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.job = job;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAge() {
        return age;
    }

    public void setAge(double age) {
        this.age = age;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id ;
    @Column
    private String name ;
    @Column
    private double age ;
    @Column
    private String job ;

}
