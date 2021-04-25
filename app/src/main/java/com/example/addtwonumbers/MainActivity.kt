package com.example.addtwonumbers

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils
import android.view.TextureView
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

     private var firstNumber  : Long = 0;
     private var secondNumber : Long = 0;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        addButton.setOnClickListener {
            if(!TextUtils.isEmpty(numberOne.text) && !TextUtils.isEmpty(numberTwo.text)){
            firstNumber = numberOne.text.toString().toLong();
            secondNumber = numberTwo.text.toString().toLong();
            resultContainer.visibility = View.VISIBLE
            result.text = (firstNumber + secondNumber).toString();
            numberOne.text.clear()
            numberTwo.text.clear()
            }else{
                Toast.makeText(this@MainActivity,
                    "قم بإدخال رقم", Toast.LENGTH_LONG).show()
            }
        }
    }
}