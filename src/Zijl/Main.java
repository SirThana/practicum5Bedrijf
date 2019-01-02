package Zijl;
import java.util.Arrays;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {


        /**
         * Objecten van diverse klassen
         */
        Bedrijf a = new Bedrijf("HvA");
        Bedrijf b = new Bedrijf("Broadcom");
        Werknemer martijn = new Werknemer("Martijn",561674,1300);
        Vrijwilliger emily = new Vrijwilliger("Emily");
        Zzper lucie = new Zzper("Lucie",10);
        Manager Sean = new Manager("Sean",9000,5000,15,500);


        /**
         * gevalletje van testen en printen van objecten en z'n functies
         */

        b.neemInDienst(Sean);
        Sean.huurIn(36);
        System.out.println(Sean.toString());
        System.out.println(b.toString());


    }
}
