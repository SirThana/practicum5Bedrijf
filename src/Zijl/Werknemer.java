package Zijl;

public class Werknemer extends Persoon {
    private int personeelsNummer;
    private double maandSalaris;


    public Werknemer(String naam,int personeelsNummer,double maandSalaris){
        super(naam);
        this.personeelsNummer = personeelsNummer;
        this.maandSalaris = maandSalaris;
    }


}
