package com.example.welcomealphalib

import android.util.Log

public class Greating private constructor(){
    companion object{
        public const val GREATING_TAG = "GREATING"
        public fun greatEveryone(names : List<String>){
            val welcomeUtil = WelcomeUtil()
            for(i in names){
                Log.e(GREATING_TAG,"$i , ${welcomeUtil.welcomeInstant.sayHi()}")
            }
        }
    }
}