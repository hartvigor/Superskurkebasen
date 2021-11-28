package no.hartvigor.superskurkebasen.adapter;

import android.graphics.drawable.Drawable;
import android.widget.ImageView;

import androidx.databinding.BindingAdapter;

public class DataBinderAdapters {
    @BindingAdapter("android:src")
    public static void setImageDrawable(ImageView view, Drawable drawable) {
        view.setImageDrawable(drawable);
    }

}
