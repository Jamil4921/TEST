package Opdracht2;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.TreeSet;

public class Snack implements Comparable<Snack>, Serializable {
    private String naam;
    private int id;
    private double prijs;
    private boolean ondatHetKan;

    public Snack() {
    }

    public Snack(String naam, int id, double prijs) {
        this.naam = naam;
        this.id = id;
        this.prijs = prijs;

    }

    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getPrijs() {
        return prijs;
    }

    public void setPrijs(double prijs) {
        this.prijs = prijs;
    }

    @Override
    public int compareTo(Snack o) {
        return this.naam.compareTo(o.naam);
    }


    @Override
    public String toString() {
        return "Snack : " + this.naam + " ID : " + this.id + " Prijs : " + this.prijs;
    }
}
