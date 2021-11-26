package no.hartvigor.superskurkebasen.adapter;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import no.hartvigor.superskurkebasen.R;
import no.hartvigor.superskurkebasen.SuperSkurk;
import no.hartvigor.superskurkebasen.VillainDetailsActivity;

// Extends Adapter<Type> = ViewHolder laget i klassen. Lager en Adapter
public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder> {
    private static final String TAG = "RecyclerViewAdapter";
    //deklare variabler som trengs for klassen
    private Context context;
    private List<SuperSkurk> items;

    public RecyclerViewAdapter(Context context, List<SuperSkurk> items) {
        this.context = context;
        this.items = items;
    }

    // @Override obligatoriske metoder for klassen
    @NonNull

    // Recycler viewholds og setter de der de skal
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.layout_item_list, parent, false);
        ViewHolder holder = new ViewHolder(view);
        return holder;
    }

    //Kalles hver gang en ny item blir lagt til
    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, @SuppressLint("RecyclerView") final int position) {

        // Henter ut en skurk (item) fra listen av skurker (items) - bruker position for å hente ut skurken
        SuperSkurk item = items.get(position);

        holder.profileImg.setImageResource(item.getSkurkImg());

        holder.name.setText(item.getSkurkNavn());

        holder.parentLayout.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Bundle b = new Bundle();
                b.putSerializable("data", item);
                Intent i = new Intent(context, VillainDetailsActivity.class);
                i.putExtras(b);
                context.startActivity(i);
            }
        });
    }

    // Forteller adapteren hvor mange items er i listen
    @Override
    public int getItemCount() {
        return items.size();
    }

    // Henter og setter referanser for bruk widgets i liste
    public class ViewHolder extends RecyclerView.ViewHolder {
        // Deklarer widgets for view
        ImageView profileImg;
        TextView name;
        ConstraintLayout parentLayout;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            profileImg = itemView.findViewById(R.id.img);
            name = itemView.findViewById(R.id.profile_name);
            parentLayout = itemView.findViewById(R.id.parent_layout);
        }
    }
}
