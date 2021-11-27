package no.hartvigor.superskurkebasen;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;
import no.hartvigor.superskurkebasen.classes.SuperSkurk;
import no.hartvigor.superskurkebasen.databinding.ActivityVillainDetailsBinding;
import no.hartvigor.superskurkebasen.viewmodels.VillainDetailsViewModel;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class VillainDetailsActivity extends AppCompatActivity {

    private SuperSkurk skurk;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_villain_details);

        // Setter aktivitetes binding layout med auto-generete binding klassen "ActivityVillainDetailsBinding".
        // Tilgjengeligjør alle binding id'er i layouten
        ActivityVillainDetailsBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_villain_details);

        // Hente bundle med skurk fra forrige aktivitet
        if (getIntent().getExtras() != null && getIntent().hasExtra("data")) {
            Bundle b = getIntent().getExtras();
            skurk = (SuperSkurk) b.getSerializable("data");
        }

        // Binder skurk objektet til layouten
        binding.setSuperSkurk(skurk);

    }
}