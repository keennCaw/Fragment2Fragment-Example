package com.keennhoward.fragmenttofragmentviewmodel;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class SharedViewModel extends ViewModel {

    //mutable live data for setValue(UI THREAD) and postValue(BACKGROUND THREAD)
    private MutableLiveData<CharSequence> text = new MutableLiveData<>();

    public void setText(CharSequence input){
        text.setValue(input);
    }

    //access and add observer
    public LiveData<CharSequence> getText(){
        return text;
    }
}
