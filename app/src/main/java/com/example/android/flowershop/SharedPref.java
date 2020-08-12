package com.example.android.flowershop;

import android.content.Context;
import android.content.SharedPreferences;

public class SharedPref {

    SharedPreferences mySharedPref;
    public SharedPref(Context context){
        mySharedPref = context.getSharedPreferences("filename", Context.MODE_PRIVATE);

    }

    public void setDarkMode(Boolean state){
        SharedPreferences.Editor editor = mySharedPref.edit();
        editor.putBoolean("DarkMode", state);
        editor.commit();
    }
    public Boolean loadDarkMode(){
       Boolean state = mySharedPref.getBoolean("DarkMode", false);
       return state;
    }
}
