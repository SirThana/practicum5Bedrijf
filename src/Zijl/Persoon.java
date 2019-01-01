package Zijl;

import java.util.Collections;

public class Persoon {
    private String naam = "";



    public Persoon(String naam){
        this.naam = naam;
    }

    public String toString(){
        String a = this.naam;
        return a;
    }

    public String getNaam(){
        return this.naam;
    }

}
