package com.example.ejemplo_checkbox

import android.graphics.Color
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import android.widget.CheckBox
import android.widget.TextView
import android.widget.Toast
import com.google.android.material.snackbar.Snackbar
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        chbox1.setOnCheckedChangeListener { buttonView, isChecked ->
            if (isChecked) {
                root_layout.setBackgroundColor(Color.BLUE)
            } else {
                root_layout.setBackgroundColor(Color.WHITE)
            }
        }

        chbox2.setOnCheckedChangeListener { buttonView, isChecked ->
            if (isChecked) {

                root_layout.setBackgroundColor(Color.MAGENTA)

            } else {
                root_layout.setBackgroundColor(Color.WHITE)
            }
        }

    }
}