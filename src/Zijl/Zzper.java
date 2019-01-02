package Zijl;

public class Zzper extends Persoon implements Oproepbaar{
    private double uurTarief;
    private int urenGewerkt;

    public Zzper(String naam,double uurTarief){
        super(naam);
        this.uurTarief = uurTarief;
    }

    public String toString(){
        String a = super.toString() + " Aantal uren gewerkt " + this.urenGewerkt;
        return a;
    }


}
