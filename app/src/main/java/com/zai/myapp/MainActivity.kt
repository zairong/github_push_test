package com.zai.myapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.renderscript.Sampler
import kotlinx.android.synthetic.main.activity_main.*
import java.lang.String.valueOf


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //val brands = findViewById<TextView>(R.id.brands)
        //val color = findViewById<Spinner>(R.id.color)
        //val beerType = color.selectedItem.toString()
        button.setOnClickListener {
            brands.text = valueOf(color.selectedItem)
        }
    }

}