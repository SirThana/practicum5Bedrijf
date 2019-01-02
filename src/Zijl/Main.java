package Zijl;
import java.util.Arrays;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {


        /**
         * Objecten van diverse klassen
         */
        Bedrijf a = new Bedrijf("HvA");
        Werknemer martijn = new Werknemer("Martijn",561674,1300);
        Vrijwilliger emily = new Vrijwilliger("Emily");
        Zzper lucie = new Zzper("Lucie",10);


        /**
         * gevalletje van testen en printen van objecten en z'n functies
         */

        System.out.println(martijn + " " + emily);
        a.neemInDienst(martijn);
        System.out.println(a);
        System.out.println(lucie);




    }
}
