package com.example.welcomealphalib

import android.util.Log

class Welcome private constructor(){
    companion object{
        fun sayHi(){
            Log.e("WELCOME","Hi everyone")
        }
    }
}