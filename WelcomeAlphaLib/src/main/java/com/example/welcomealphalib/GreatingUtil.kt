package com.example.welcomealphalib

import android.util.Log

class GreatingUtil {
    private val greating : IGreating = Greating()

    fun greatIso(array: Array<Int>): Int{
        return greating.greatIsoBala(array)
    }

    companion object{
        fun salamla(){
            Log.e(TAG,"COMPAINON")
        }

        private const val TAG = "GREATING_UTIL"
    }
}