package com.example.welcomealphalib

import android.util.Log

public class GreatingUtil {
    private val greating : IGreating = Greating()

    public fun greatIso(array: Array<Int>): Int{
        return greating.greatIsoBala(array)
    }

    companion object{
        public fun salamla(){

        }
    }
}