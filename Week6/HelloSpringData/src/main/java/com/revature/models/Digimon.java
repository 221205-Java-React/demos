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

    //Sorry digimon purists - in this universe we assume a human can have many digimon

    //We are establishing a @ManyToOne relationship - one human can have many digimon
    //We will make this field a FK to the Human table
    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "humanId") //This is how we specify the PK that this FK points to
    //the name attribute of the @JoinColumn annotation will name the column in your table.
    //IMPORTANT NOTE: using @Column will break this, @JoinColumn already fills that role.
    private Human human;

    /* WHAT are fetch and cascade??

     fetch - sets whether we want the Human to be eagerly or lazily loaded
     (typically we want eager loading so that the object/relationship is ready before we even need it)

     cascade - sets how changes in a table cascade to dependent records
     (with CascadeType.ALL, if a Human is updated/deleted, that update/delete will cascade down)

     */

    //boilerplate code----------------

    public Digimon() {
    }

    public Digimon(int digimonId, String digimonName, String digimonType, String digimonLevel, Human human) {
        this.digimonId = digimonId;
        this.digimonName = digimonName;
        this.digimonType = digimonType;
        this.digimonLevel = digimonLevel;
        this.human = human;
    }

    public Digimon(String digimonName, String digimonType, String digimonLevel, Human human) {
        this.digimonName = digimonName;
        this.digimonType = digimonType;
        this.digimonLevel = digimonLevel;
        this.human = human;
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

    public Human getHuman() {
        return human;
    }

    public void setHuman(Human human) {
        this.human = human;
    }

    @Override
    public String toString() {
        return "Digimon{" +
                "digimonId=" + digimonId +
                ", digimonName='" + digimonName + '\'' +
                ", digimonType='" + digimonType + '\'' +
                ", digimonLevel='" + digimonLevel + '\'' +
                ", human=" + human +
                '}';
    }
}
