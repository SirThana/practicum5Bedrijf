package Zijl;

public class Zzper extends Persoon implements Oproepbaar{
    private double uurTarief;
    private int urenGewerkt;


    /**
     * This is the constructor
     * @param naam This is gonna be the name in object Persoon
     * @param uurTarief Ammount paid per hour
     */
    public Zzper(String naam,double uurTarief){
        super(naam);
        this.uurTarief = uurTarief;
    }

    @Override
    public void huurIn(int uren){
        this.urenGewerkt = uren;
    }

    public String toString(){
        String a = super.toString() + " Aantal uren gewerkt " + this.urenGewerkt;
        return a;
    }

    public double berekenInkomsten(){
        double a;
        a = this.urenGewerkt * this.uurTarief;
        return a;


    }



}
