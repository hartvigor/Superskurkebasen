package no.hartvigor.superskurkebasen.viewmodel;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import no.hartvigor.superskurkebasen.classes.SuperSkurk;

public class VillainDetailsModel extends ViewModel {
    public MutableLiveData<SuperSkurk> skurk = new MutableLiveData<>();

}
