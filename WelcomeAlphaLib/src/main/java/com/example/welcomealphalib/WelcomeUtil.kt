package com.example.welcomealphalib

import android.util.Log


class WelcomeUtil() {
     val welcomeInstant = Welcome()

    companion object{
        private const val TAG = "WelcomeUtil"
    }

    init {
        callMethods()
        callParams()
    }

     fun callMethods(){
        welcomeInstant.greatEveryone()
         welcomeInstant.sayHi()
         Welcome.sayHi()
    }

     fun callParams(){
         Log.e(TAG,welcomeInstant.welcomeName)
         Log.e(TAG,welcomeInstant.iso_param.toString())
     }

}