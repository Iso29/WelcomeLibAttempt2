package com.example.welcomealphalib

import android.util.Log
import androidx.annotation.Keep

class GreatingUtil private constructor(){
    @Keep
    private val greating : IGreating = Greating()

    @Keep
    fun greatIso(array: Array<Int>): Int{
        return greating.greatIsoBala(array)
    }

    companion object{
        @Keep
        fun salamla(array: Array<Int>){
            var max = array[0]
            for(i in array.indices){
            }
            Log.e(TAG,"COMPAINON")
        }

        @Keep
        fun provideGreating():IGreating{
            return Greating()
        }

        @Keep
        private const val TAG = "GREATING_UTIL"
    }
}