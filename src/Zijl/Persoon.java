package Zijl;


public abstract class Persoon {
    private String naam = "";



    public Persoon(String naam){
        this.naam = naam;
    }

    public String toString(){
        String a = this.naam;
        return a;
    }

    public void setNaam(String naam){
        this.naam = naam;
    }

}
