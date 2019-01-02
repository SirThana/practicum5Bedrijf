package Zijl;

public class Manager extends Werknemer implements Oproepbaar{

    private double bonus;
    private int urenGewerkt;
    private double uurTarief;


    public Manager(String naam, int personeelsNummer, double maandSalaris,double uurTarief,double bonus) {
        super(naam, personeelsNummer, maandSalaris);
        this.uurTarief = uurTarief;
        this.bonus = bonus;

    }


    @Override
    public void huurIn(int uren){
        this.urenGewerkt = uren;
    }

    public double berekenInkomsten(){
        double a;
        a = this.urenGewerkt * uurTarief;
        return a;
    }

    public String toString(){
        String a = super.toString() + " Aantal uren gewerkt " + this.urenGewerkt;

        return a;
    }

}
