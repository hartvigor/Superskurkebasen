package no.hartvigor.superskurkebasen.data;

import java.util.ArrayList;
import java.util.List;

import no.hartvigor.superskurkebasen.R;
import no.hartvigor.superskurkebasen.SuperSkurk;

public class Skurkeliste {
    public List<SuperSkurk> getList(){
        // Kun for testdata - ville ikke gjort dette i en prod app
        return new ArrayList<SuperSkurk>() {{
            add(new SuperSkurk("The Joker", R.drawable.the_joker, "15.04.1940", R.string.joker_desc, true));
            add(new SuperSkurk("Thanos", R.drawable.thanosinfinity, "", R.string.thanos_desc, true));
            add(new SuperSkurk("Green Goblin", R.drawable.green_goblin, "", R.string.goblin_desc, true));
            add(new SuperSkurk("Harley Quinn", R.drawable.harleyquinn, "", R.string.harley_quinn_desc, true));
            add(new SuperSkurk("Riddler", R.drawable.riddler, "", R.string.riddler_desc, true));
            add(new SuperSkurk("Venom", R.drawable.venom, "", R.string.venon_desc, true));
           }};
    }

}
