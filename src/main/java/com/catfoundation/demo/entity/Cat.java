package com.catfoundation.demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Cat {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "cat_seq")
    private long catId;

    public enum CatStatus {
        ADOPTED,
        AT_SANCTUARY_ADOPTABLE,
        AT_SANCTUARY_NOT_ADOPTABLE,
        DECEASED
    }

    private String name;
    private int age;
    private String gender;
    private String description;
    private CatStatus catStatus;

    public Cat() {

    }

    public Cat(String name, int age, String gender, String description, CatStatus catStatus) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.description = description;
        this.catStatus = catStatus;
    }

    public long getCatId() {
        return catId;
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

    public CatStatus getCatStatus() {
        return catStatus;
    }

    public void setCatId(long catId) {
        this.catId = catId;
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

    public void setCatStatus(CatStatus catStatus) {
        this.catStatus = catStatus;
    }
}
