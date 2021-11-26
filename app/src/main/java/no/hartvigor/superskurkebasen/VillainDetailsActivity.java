package no.hartvigor.superskurkebasen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

public class VillainDetailsActivity extends AppCompatActivity {

    private SuperSkurk skurk;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_villain_details);

        Intent i = getIntent();
        // Hente bundle med skurk fra forrige aktivitet
        if (getIntent().getExtras() != null && getIntent().hasExtra("data")) {
            Bundle b = getIntent().getExtras();
            skurk = (SuperSkurk) b.getSerializable("data");
            loadSkurk();
        }
    }

    private void loadSkurk() {
        ((TextView)findViewById(R.id.textWanted)).setText(skurk.getSkurkEtterlyst().toString());
        ((ImageView)findViewById(R.id.imgProfile)).setImageResource(skurk.getSkurkImg());
        ((TextView)findViewById(R.id.textName)).setText(skurk.getSkurkNavn());
        ((TextView)findViewById(R.id.textDate)).setText(skurk.getSkurkDato());
        ((TextView)findViewById(R.id.textDesc)).setText(skurk.getSkurkBesk());
    }
}