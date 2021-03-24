package com.example.modelaplication


/**
 *
 *
 *  *-------------------------------------------------------------------------------------------*
 *  \                                                                                           \
 *  \                                                                                           \
 *  \   This is a start activity, when starts, search this archive for open all the aplication  \
 *  \                                                                                           \
 *  \                                                                                           \
 *  *-------------------------------------------------------------------------------------------*
 *
**/


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}