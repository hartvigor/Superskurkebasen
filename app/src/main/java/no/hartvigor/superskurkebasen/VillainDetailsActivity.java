package no.hartvigor.superskurkebasen;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;
import no.hartvigor.superskurkebasen.classes.SuperSkurk;
import no.hartvigor.superskurkebasen.databinding.ActivityVillainDetailsBinding;
import no.hartvigor.superskurkebasen.viewmodel.VillainDetailsModel;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class VillainDetailsActivity extends AppCompatActivity {

    private SuperSkurk skurk;
    private VillainDetailsModel model;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        /**
         * Setter aktivitetes binding layout med auto-generete binding klassen "ActivityVillainDetailsBinding".
         *         // Tilgjengeligjør alle binding id'er i layouten
         */
        ActivityVillainDetailsBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_villain_details);
        model = new VillainDetailsModel();
        binding.setVariable(BR.model, model);
        binding.setLifecycleOwner(this);

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

        model.skurk.observe(this, superSkurk -> model.skurk.postValue(superSkurk));
        model.skurk.setValue(skurk);

        new Handler(Looper.myLooper()).postDelayed((Runnable) () -> {
            runOnUiThread(new Runnable() {
                @Override
                public void run() {
                    SuperSkurk skurk = model.skurk.getValue();
                    skurk.setSkurkNavn("PotetJagern");
                    Toast.makeText(VillainDetailsActivity.this, "Oppdatert", Toast.LENGTH_LONG).show();
                }
            });
        }, 350);


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