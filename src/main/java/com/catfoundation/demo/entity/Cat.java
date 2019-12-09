package com.catfoundation.demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Cat {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "cat_id_seq")
    private long id;

    public enum CatStatus {
        ADOPTED,
        AT_SANCTUARY_ADOPTABLE,
        AT_SANCTUARY_NOT_ADOPTABLE,
        DECEASED;
    }

    private String name;
    private int age;
    private String gender;
    private String description;
    private CatStatus status;

    public Cat() {

    }

    public Cat(String name, int age, String gender, String description, CatStatus status) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.description = description;
        this.status = status;


    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public String getDescription() {
        return description;
    }

    public CatStatus getStatus() {
        return status;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setStatus(CatStatus status) {
        this.status = status;
    }
}
