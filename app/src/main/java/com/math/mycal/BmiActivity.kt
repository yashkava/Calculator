package com.math.mycal

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import com.math.mycal.R
import com.math.mycal.databinding.ActivityBmiBinding
import com.math.mycal.databinding.ActivityGstBinding

class BmiActivity : AppCompatActivity(), View.OnClickListener {
    lateinit var binding: ActivityBmiBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityBmiBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        if (supportActionBar != null) {
            supportActionBar!!.hide()
        }
        binding.imageBack.setOnClickListener {
            val i = Intent(this, HomeActivity::class.java)
            startActivity(i)
        }
        findViewById<Button>(R.id.btnFtoC).setOnClickListener(this)
        findViewById<Button>(R.id.btnStoK).setOnClickListener(this)
        findViewById<Button>(R.id.btnKtoS).setOnClickListener(this)


    }


    private fun inputIsNotEmpty(): Boolean {
        var b = true
        if (binding.tvFeet.text.toString().trim().isEmpty()) {
            binding.tvFeet.error = "Required"
            binding.tvFeet.requestFocus()
            b = false
        }

        return b
    }

    @SuppressLint("SetTextI18n")
    override fun onClick(v: View?) {

        when (v?.id) {
            R.id.btnFtoC -> {

                if (binding.tvFeet.text.toString().trim().isEmpty()) {
                    binding.tvFeet.error = "Required"
                    binding.tvFeet.requestFocus()
                } else {
                    binding.tvCm.text =
                        ((binding.tvFeet.text.toString().toBigDecimal() * 30.48.toString()
                            .toBigDecimal()).toString())
                }
            }

            R.id.btnStoK -> {
                if (binding.etStone.text.toString().trim().isEmpty()) {

                    binding.etStone.error = "Required"
                    binding.etStone.requestFocus()
                } else {
                    binding.tvKg.text =
                        ((binding.etStone.text.toString().toBigDecimal() * 6.350.toString()
                            .toBigDecimal()).toString())
                }
            }

            R.id.btnKtoS -> {

                if (binding.etKg.text.toString().trim().isEmpty()) {
                    binding.etKg.error = "Required"
                    binding.etKg.requestFocus()

                } else {

                    binding.tvStone.text =
                        ((binding.etKg.text.toString().toBigDecimal() * 0.157.toString()
                            .toBigDecimal()).toString())
                }
            }

        }
    }
}
