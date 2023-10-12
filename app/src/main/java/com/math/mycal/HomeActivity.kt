package com.math.mycal

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.math.mycal.databinding.ActivityHomeBinding
import com.math.mycal.databinding.ActivityMainBinding

class HomeActivity : AppCompatActivity() {
    lateinit var binding: ActivityHomeBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHomeBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        if (supportActionBar != null) {
            supportActionBar!!.hide()
        }

        binding.normal.setOnClickListener {
            var i = Intent(this, MainActivity::class.java)
            startActivity(i)
        }
        binding.percentage.setOnClickListener {
            var intent = Intent(this, PerActivity::class.java)
            startActivity(intent)
        }

        binding.gst.setOnClickListener {
            var intent = Intent(this, GSTActivity::class.java)
            startActivity(intent)
        }
        binding.bmi.setOnClickListener {
            var intent = Intent(this, BmiActivity::class.java)
            startActivity(intent)
        }
        binding.length.setOnClickListener {
            var intent = Intent(this, LengthActivity::class.java)
            startActivity(intent)
        }
        binding.weight.setOnClickListener {
            var intent = Intent(this, WeightActivity::class.java)
            startActivity(intent)
        }

    }
}