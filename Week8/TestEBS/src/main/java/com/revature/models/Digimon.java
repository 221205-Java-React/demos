package com.revature.models;

import org.springframework.stereotype.Component;

import javax.persistence.*;

//All of these annotations come from the JPA (Java Persistence API)
@Entity //This annotation makes this class a DB table (or database entity in other words)
@Table(name="digimon") //This annotation lets us give the DB table a different name
@Component //We want this class to be a bean
public class Digimon {

    @Id //This will make this field the primary key
    @GeneratedValue(strategy = GenerationType.IDENTITY) //This makes our PK serial
    private int digimonId;

    //non-id columns don't technically need any annotation at all
    //BUT @Column is good for clarity and any constraints you may need

    @Column(nullable = false) //now this column has a not null constraint
    private String digimonName;

    @Column
    private String digimonType;

    @Column
    private String digimonLevel;

    public Digimon() {
    }

    public Digimon(int digimonId, String digimonName, String digimonType, String digimonLevel) {
        this.digimonId = digimonId;
        this.digimonName = digimonName;
        this.digimonType = digimonType;
        this.digimonLevel = digimonLevel;
    }

    public int getDigimonId() {
        return digimonId;
    }

    public void setDigimonId(int digimonId) {
        this.digimonId = digimonId;
    }

    public String getDigimonName() {
        return digimonName;
    }

    public void setDigimonName(String digimonName) {
        this.digimonName = digimonName;
    }

    public String getDigimonType() {
        return digimonType;
    }

    public void setDigimonType(String digimonType) {
        this.digimonType = digimonType;
    }

    public String getDigimonLevel() {
        return digimonLevel;
    }

    public void setDigimonLevel(String digimonLevel) {
        this.digimonLevel = digimonLevel;
    }

    @Override
    public String toString() {
        return "Digimon{" +
                "digimonId=" + digimonId +
                ", digimonName='" + digimonName + '\'' +
                ", digimonType='" + digimonType + '\'' +
                ", digimonLevel='" + digimonLevel + '\'' +
                '}';
    }
}