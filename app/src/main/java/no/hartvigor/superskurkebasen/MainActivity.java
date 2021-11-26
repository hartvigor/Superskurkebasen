package no.hartvigor.superskurkebasen;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import no.hartvigor.superskurkebasen.adapter.RecyclerViewAdapter;
import no.hartvigor.superskurkebasen.data.Skurkeliste;

import android.os.Bundle;
import android.util.Log;
import android.widget.RelativeLayout;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private final String TAG = getClass().getSimpleName();


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG, "onCreate: started.");

        initRecyclerView();
    }

    private void initRecyclerView() {
        Log.d(TAG, "initRecyclerView: init rycylerview");
        RecyclerView recyclerView = findViewById(R.id.recycler_view);

        // Henter data (skurkeliste) til adapter og oppretter liste
        RecyclerViewAdapter adapter = new RecyclerViewAdapter(this, new Skurkeliste().getList());
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }

}