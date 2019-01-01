package Zijl;
import java.util.Arrays;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Bedrijf a = new Bedrijf("HvA");
        System.out.println(a.toString());
        Persoon martijn = new Persoon("Martijn");


        a.addWerknemer(martijn);
//        System.out.println(a.getWerknemers());

    }
}
