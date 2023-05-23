package arrayListTypeDemo;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> sehirler=new ArrayList<String>();
        sehirler.add("Diyarbakır");
        sehirler.add("İstanbul");
        Collections.sort(sehirler);

        for (String sehir:sehirler) {
            System.out.println(sehir);
        }
    }
}
