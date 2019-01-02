package Zijl;

import java.util.ArrayList;

public class Bedrijf {
    private String naam = "";
    private ArrayList<String> medewerkers = new ArrayList<>();


    public Bedrijf(String naam){
        this.naam = naam;
    }

    public void addWerknemer(Persoon persoon){
        medewerkers.add(persoon.toString());

    }

    public ArrayList<String> getWerknemers(){
        return this.medewerkers;
    }

    public String toString(){
        String a = "Bedrijf: " + this.naam + " Heeft als werknemers: " + this.medewerkers;
        return a;
    }




}
