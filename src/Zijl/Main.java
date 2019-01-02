package Zijl;
import java.util.Arrays;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Bedrijf a = new Bedrijf("HvA");
        Werknemer c = new Werknemer("Martijn",561674,1300);
        System.out.println(c);
        a.addWerknemer(c);
        System.out.println(a);
    }
}
