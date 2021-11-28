package no.hartvigor.superskurkebasen;

import android.os.Bundle;
import android.util.Log;

import java.util.List;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import no.hartvigor.superskurkebasen.adapter.RecyclerViewAdapter;
import no.hartvigor.superskurkebasen.classes.SuperSkurk;
import no.hartvigor.superskurkebasen.data.Skurkeliste;
import no.hartvigor.superskurkebasen.databinding.ActivityMainBinding;
import no.hartvigor.superskurkebasen.databinding.LayoutItemListBinding;
import no.hartvigor.superskurkebasen.viewmodels.MainActivityViewModel;

public class MainActivity extends AppCompatActivity {

    private final String TAG = getClass().getSimpleName();

    // Global ojekt for å kunne gjøre endringer i data
    //private MainActivityViewModel mainActivityViewModel;


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);

        LayoutItemListBinding layoutItemListBinding = LayoutItemListBinding.inflate(getLayoutInflater());
        setContentView(layoutItemListBinding.getRoot());

        ActivityMainBinding activityMainBinding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(activityMainBinding.getRoot());

        RecyclerViewAdapter recyclerViewAdapter = new RecyclerViewAdapter(this, new Skurkeliste().getList());
        activityMainBinding.recyclerView.setAdapter(recyclerViewAdapter);
        activityMainBinding.recyclerView.setLayoutManager(new LinearLayoutManager(this));
        /*
        setContentView(R.layout.activity_main);
        Log.d(TAG, "onCreate: started.");

        // Oppstart recycler viewer
        initRecyclerView();

        // Initilaliserer ViewModel
        mainActivityViewModel = ViewModelProviders.of(this).get(MainActivityViewModel.class);*/

    }

    /*
    private void initRecyclerView() {
        Log.d(TAG, "initRecyclerView: init rycylerview");
        RecyclerView recyclerView = findViewById(R.id.recycler_view);

        // Henter data (skurkeliste) til adapter og oppretter liste
        RecyclerViewAdapter adapter = new RecyclerViewAdapter(this, new Skurkeliste().getList());
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }*/

}