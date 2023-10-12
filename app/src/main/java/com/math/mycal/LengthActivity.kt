package com.math.mycal

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import com.math.mycal.R
import com.math.mycal.R.id.btnCMtoMM
import com.math.mycal.databinding.ActivityBmiBinding
import com.math.mycal.databinding.ActivityLengthBinding

class LengthActivity : AppCompatActivity(), View.OnClickListener {
    lateinit var binding: ActivityLengthBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLengthBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        if (supportActionBar != null) {
            supportActionBar!!.hide()
        }
        binding.imageBack.setOnClickListener {
            val i = Intent(this, HomeActivity::class.java)
            startActivity(i)
        }
        findViewById<Button>(R.id.btnKtoF).setOnClickListener(this)
        findViewById<Button>(R.id.btnMtoCm).setOnClickListener(this)
        findViewById<Button>(btnCMtoMM).setOnClickListener(this)
        findViewById<Button>(R.id.btnInToFeet).setOnClickListener(this)
        findViewById<Button>(R.id.btnInchToCM).setOnClickListener(this)
        findViewById<Button>(R.id.btnMeterToFeet).setOnClickListener(this)


    }

    @SuppressLint("SetTextI18n")
    override fun onClick(v: View?) {

        when (v?.id) {

            R.id.btnKtoF -> {
                if (binding.etKm.text.toString().trim().isEmpty()) {
                    binding.etKm.error = "Required"
                    binding.etKm.requestFocus()
                } else {
                    binding.tvFeet.text =
                        ((binding.etKm.text.toString().toBigDecimal() * 3280.8400.toString()
                            .toBigDecimal()).toString())
                }

            }
            R.id.btnMtoCm -> {
                if (binding.etMtoCm.text.toString().trim().isEmpty()) {
                    binding.etMtoCm.error = "Required"
                    binding.etMtoCm.requestFocus()
                } else {
                    binding.tvCm.text =
                        ((binding.etMtoCm.text.toString().toBigDecimal() * 100.toString()
                            .toBigDecimal()).toString())
                }

            }
            btnCMtoMM -> {
                if (binding.etCMtoMM.text.toString().trim().isEmpty()) {
                    binding.etCMtoMM.error = "Required"
                    binding.etCMtoMM.requestFocus()
                } else {
                    binding.tvMM.text =
                        ((binding.etCMtoMM.text.toString().toBigDecimal() * 10.toString()
                            .toBigDecimal()).toString())
                }

            }
            R.id. btnInToFeet -> {
                if (binding.etFeet.text.toString().trim().isEmpty()) {
                    binding.etFeet.error = "Required"
                    binding.etFeet.requestFocus()
                } else {
                    binding.tvInches.text =
                        ((binding.etFeet.text.toString().toBigDecimal() * 12.toString()
                            .toBigDecimal()).toString())
                }

            }
            R.id. btnInchToCM -> {
                if (binding.etInch.text.toString().trim().isEmpty()) {
                    binding.etInch.error = "Required"
                    binding.etInch.requestFocus()
                } else {
                    binding.tvIntoCM.text =
                        ((binding.etInch.text.toString().toBigDecimal() * 2.54.toString()
                            .toBigDecimal()).toString())
                }

            }
            R.id. btnMeterToFeet -> {
                if (binding.etMeter.text.toString().trim().isEmpty()) {
                    binding.etMeter.error = "Required"
                    binding.etMeter.requestFocus()
                } else {
                    binding.tvMetertoFeet.text =
                        ((binding.etMeter.text.toString().toBigDecimal() * 3.28.toString()
                            .toBigDecimal()).toString())
                }

            }
        }
    }
}
