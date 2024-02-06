package com.example.welcomealphalib

import android.util.Log
import androidx.annotation.Keep

class GreatingUtil private constructor(){
    private val greating : IGreating = Greating()

    fun greatIso(array: Array<Int>): Int{
        return greating.greatIsoBala(array)
    }

    companion object{
        @Keep
        fun salamla(){
            Log.e(TAG,"COMPAINON")
        }

        private const val TAG = "GREATING_UTIL"
    }
}