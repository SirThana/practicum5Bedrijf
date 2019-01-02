package Zijl;

public class Vrijwilliger extends Persoon implements Oproepbaar{
    private int urenGewerkt;

    public Vrijwilliger(String naam){
        super(naam);

    }

    @Override
    public void huurIn(int uren){
        this.urenGewerkt = uren;
    }

    public String toString(){
        String a = super.toString() + " Aantal uren gewerkt " + this.urenGewerkt;
        return a;
    }


}
