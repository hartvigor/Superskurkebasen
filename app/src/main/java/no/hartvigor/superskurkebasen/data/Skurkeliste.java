package no.hartvigor.superskurkebasen.data;

import java.util.ArrayList;
import java.util.List;

import no.hartvigor.superskurkebasen.R;
import no.hartvigor.superskurkebasen.classes.SuperSkurk;

public class Skurkeliste {
    public List<SuperSkurk> getList(){
        /**
         * Testdata
         */
        return new ArrayList<SuperSkurk>() {{
            add(new SuperSkurk("The Joker", R.drawable.the_joker, "15.04.1940", R.string.joker_desc, "Etterlyst"));
            add(new SuperSkurk("Thanos", R.drawable.thanosinfinity, "01.01.1013", R.string.thanos_desc, "Ikke etterlyst"));
            add(new SuperSkurk("Green Goblin", R.drawable.green_goblin, "11.10.1945", R.string.goblin_desc, "Etterlyst"));
            add(new SuperSkurk("Harley Quinn", R.drawable.harleyquinn, "20.07.1990", R.string.harley_quinn_desc, "Ikke etterlyst"));
            add(new SuperSkurk("Riddler", R.drawable.riddler, "01.04.1988", R.string.riddler_desc, "Etterlyst"));
            add(new SuperSkurk("Venom", R.drawable.venom, "10.08.2001", R.string.venon_desc, "Etterlyst"));
           }};
    }

}
