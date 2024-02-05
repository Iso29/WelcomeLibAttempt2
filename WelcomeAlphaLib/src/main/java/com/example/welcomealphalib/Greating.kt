package com.example.welcomealphalib

import android.util.Log


public class Greating : IGreating{
    companion object{
         val TAG = "GREATING_TAG"
    }

    override fun greatIsoBala(){
        Log.e(TAG,"greatIsoBala() is called")
    }
}

 interface IGreating{
     fun greatIsoBala()
}