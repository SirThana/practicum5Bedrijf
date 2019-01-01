package Zijl;

import java.util.ArrayList;

public class Bedrijf {
    private String naam = "";
    private ArrayList<String> werknemers;


    public Bedrijf(String naam){
        this.naam = naam;
    }

    public void addWerknemer(Persoon persoon){


    }

    public ArrayList<String> getWerknemers(){
        return this.werknemers;
    }

    public String toString(){
        String a = this.naam;
        return a;
    }




}
