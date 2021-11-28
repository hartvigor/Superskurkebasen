package no.hartvigor.superskurkebasen;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import no.hartvigor.superskurkebasen.adapter.RecyclerViewAdapter;
import no.hartvigor.superskurkebasen.data.Skurkeliste;
import no.hartvigor.superskurkebasen.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private final String TAG = getClass().getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        /**
         * Oppretter layout med (data) binding og setter den som aktivitetens layout.
         */
        ActivityMainBinding activityMainBinding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(activityMainBinding.getRoot());

        /**
         *  Oppretter adapter til recycler view med data (Skurkeliste).
         *  Setter adapteren i recycler view og deretter settes Layout Manager for at den skal
         *  vite hvordan dataen skal presenteres.
         */
        RecyclerViewAdapter recyclerViewAdapter = new RecyclerViewAdapter(this, new Skurkeliste().getList());
        activityMainBinding.recyclerView.setAdapter(recyclerViewAdapter);
        activityMainBinding.recyclerView.setLayoutManager(new LinearLayoutManager(this));

    }
}