package Zijl;
import java.util.Arrays;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Bedrijf a = new Bedrijf("HvA");
        System.out.println(a.toString());
        Persoon martijn = new Persoon("Martijn");
        Persoon emily = new Persoon("Emily");


        a.addWerknemer(martijn);
        a.addWerknemer(emily);
        System.out.println(a.getWerknemers());

    }
}
