package com.example.welcomealphalib

import android.util.Log

class WelcomeUtil() {
    val welcomeInstant = Welcome()

    public fun callMethods(){
        Log.e("PARAM",welcomeInstant.iso_param.toString())
        welcomeInstant.greatEveryone()
    }

    init {
        callMethods()
    }
}