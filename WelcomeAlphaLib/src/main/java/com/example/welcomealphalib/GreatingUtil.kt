package com.example.welcomealphalib

import android.util.Log
import androidx.annotation.Keep

class GreatingUtil private constructor(){
    private val greating : IGreating = Greating()

    fun greatIso(array: Array<Int>): Int{
        return greating.greatIsoBala(array)
    }

    companion object{
        fun salamla(array: Array<Int>){
            var max = array[0]
            for(i in array.indices){
            }
            Log.e(TAG,"COMPAINON")
        }

        fun provideGreating():IGreating{
            return Greating()
        }

        private const val TAG = "GREATING_UTIL"
    }
}