/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp.model;

/**
 *
 * @author Harbit
 */
public class Person {
    
    private String  nom;
    private String profession;

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public Person(String nom, String profession) {
        this.nom = nom;
        this.profession = profession;
    }    
    
}
