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
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.RecyclerView;
import no.hartvigor.superskurkebasen.MainActivity;
import no.hartvigor.superskurkebasen.R;
import no.hartvigor.superskurkebasen.classes.SuperSkurk;
import no.hartvigor.superskurkebasen.VillainDetailsActivity;
import no.hartvigor.superskurkebasen.databinding.LayoutItemListBinding;

// Extends Adapter<Type> = ViewHolder laget i klassen. Lager en Adapter
public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder> {
    private List<SuperSkurk> skurker;
    private LayoutInflater layoutInflater;
    private Context context;

    public class ViewHolder extends RecyclerView.ViewHolder {
        // Data Binding - Holder alle variabler for viewet
        private LayoutItemListBinding binding;

        public ViewHolder(@NonNull LayoutItemListBinding itemListBinding) {
            super(itemListBinding.getRoot());
            this.binding = itemListBinding;
        }
    }

    public RecyclerViewAdapter(Context context, List<SuperSkurk> superSkurks) {
        this.context = context;
        this.skurker = superSkurks;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        if(layoutInflater == null) {
            layoutInflater = LayoutInflater.from(parent.getContext());
        }
        LayoutItemListBinding binding = DataBindingUtil.inflate(layoutInflater, R.layout.layout_item_list, parent, false);
        return new ViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        SuperSkurk skurk = skurker.get(position);
        holder.binding.setItemSkurk(skurk);
        holder.binding.executePendingBindings();

        holder.binding.parentLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Bundle b = new Bundle();
                b.putSerializable("data", skurk);
                Intent i = new Intent(context, VillainDetailsActivity.class);
                i.putExtras(b);
                context.startActivity(i);
            }
        });
    }

    @Override
    public int getItemCount() {
        return skurker.size();
    }


}
