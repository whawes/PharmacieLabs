package com.pharmacie.pharmacie.domain.entities;

import java.util.List;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class medecine {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int medecineID;
    double price;
    @ElementCollection(targetClass = String.class)
    List<String> allergiesList;
    boolean okayForPregnancy;
    boolean isOrdonnanceRequired;
    
    public medecine() {
    }

    public medecine(int medecineID, double price, List<String> allergiesList, boolean okayForPregnancy,
            boolean isOrdonnanceRequired) {
        this.medecineID = medecineID;
        this.price = price;
        this.allergiesList = allergiesList;
        this.okayForPregnancy = okayForPregnancy;
        this.isOrdonnanceRequired = isOrdonnanceRequired;
    }

    public int getMedecineID() {
        return medecineID;
    }

    public void setMedecineID(int medecineID) {
        this.medecineID = medecineID;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public List<String> getAllergiesList() {
        return allergiesList;
    }

    public void setAllergiesList(List<String> allergiesList) {
        this.allergiesList = allergiesList;
    }

    public boolean isOkayForPregnancy() {
        return okayForPregnancy;
    }

    public void setOkayForPregnancy(boolean okayForPregnancy) {
        this.okayForPregnancy = okayForPregnancy;
    }

    public boolean isOrdonnanceRequired() {
        return isOrdonnanceRequired;
    }

    public void setOrdonnanceRequired(boolean isOrdonnanceRequired) {
        this.isOrdonnanceRequired = isOrdonnanceRequired;
    }

    
}
