package com.example.madpractical_2_20012011146

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {
    private var TAG="MainActivity"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        showMessage("onCreate function called")
    }

    private fun showMessage(msg:String){
        Log.i(TAG,msg)
        Toast.makeText(this,msg,Toast.LENGTH_SHORT).show()
        Snackbar.make(findViewById(R.id.main_constraint_layout),msg,Snackbar.LENGTH_SHORT).show()
    }

    override fun onResume(){
        showMessage("onResume Function called.")
        super.onResume()
    }



}