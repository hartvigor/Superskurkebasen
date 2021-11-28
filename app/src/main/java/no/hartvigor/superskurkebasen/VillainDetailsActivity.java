package no.hartvigor.superskurkebasen;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;
import no.hartvigor.superskurkebasen.classes.SuperSkurk;
import no.hartvigor.superskurkebasen.databinding.ActivityVillainDetailsBinding;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class VillainDetailsActivity extends AppCompatActivity {

    private SuperSkurk skurk;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        /**
         * Setter aktivitetes binding layout med auto-generete binding klassen "ActivityVillainDetailsBinding".
         *         // Tilgjengeligjør alle binding id'er i layouten
         */
        ActivityVillainDetailsBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_villain_details);

        /**
         * Setter tilbakeknapp aktiv i actionbar
         */
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        /**
         * Hente bundle med skurk fra forrige aktivitet
         */
        if (getIntent().getExtras() != null && getIntent().hasExtra("data")) {
            Bundle b = getIntent().getExtras();
            skurk = (SuperSkurk) b.getSerializable("data");
        }

        /**
         *  Binder skurk objektet til layouten
         */
        binding.setSuperSkurk(skurk);
    }

    /**
     * Override for at navigering tilbake skal fungere.
     * @return
     */
    @Override
    public boolean onSupportNavigateUp()
    {
        onBackPressed();
        return true;
    }
}