package com.example.welcomealphalib

import android.util.Log

public class GreatingUtil {
    private val greating = Greating()

    init {
        greatIso()
    }
    public fun greatIso(){
        Log.e(Greating.TAG,"greatIso() is called")
        greating.greatIsoBala()
    }
}