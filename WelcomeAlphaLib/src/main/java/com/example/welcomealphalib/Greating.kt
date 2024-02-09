package com.example.welcomealphalib

import android.util.Log
import androidx.annotation.Keep

class Greating : IGreating{
    companion object{
         val TAG = "GREATING_TAG"
    }

    override fun greatIsoBala(array: Array<Int>):Int{
        if(!(array.size>0)){
            return 0
        }
        var max = array[0]
        for(i in array.indices){
            if(array[i]>max){
                max = array[i]
            }
        }

        return max
    }
}
