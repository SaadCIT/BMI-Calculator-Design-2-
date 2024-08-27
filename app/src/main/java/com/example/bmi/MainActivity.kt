package com.example.bmi

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.bmi.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {


    lateinit var binding: ActivityMainBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)


        setContentView(binding.root)

        binding.button.setOnClickListener {

            val hight = binding.hightet.text.toString().toDouble()/100
            val weight = binding.weightet.text.toString().toDouble()
            val BMI = weight / (hight*hight)
            binding.BMItv.text = String.format("Your BMI is  :  %.2f",BMI)


           binding.resulttv.text = when(BMI){

                in 0.00..18.4 -> "Underweight"
                in 18.5..24.9 -> "Normal/Perfect"
                in 25.0..29.9 -> "Overweight"
                in 30.0..40.0 -> "Obesity"
                else -> "Invalid your BMI"

            }


        }


    }
}