package com.example.welcomealphalib

import android.util.Log

class Greating private constructor(){
    companion object{
        const val GREATING_TAG = "GREATING"
        public fun greatEveryone(names : List<String>){
            val welcomeUtil = WelcomeUtil()
            for(i in names){
                Log.e(GREATING_TAG,"$i , ${welcomeUtil.welcomeInstant.sayHi()}")
            }
        }
    }
}