package com.example.welcomealphalib

import android.util.Log

 class Welcome{
    companion object{
         fun sayHi(){
            Log.e("WELCOME","Hi everyone")
        }
    }

     val welcomeName : String = "ISO"
     val iso_param = 10

     fun greatEveryone(){
        Log.e("WELCOME","Hi everyone")
    }

     fun sayHi():String{
        return "Hi dear teammate"
    }

}