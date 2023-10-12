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
import com.math.mycal.databinding.ActivityWeightBinding

class WeightActivity : AppCompatActivity(), View.OnClickListener {
    lateinit var binding: ActivityWeightBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityWeightBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        if (supportActionBar != null) {
            supportActionBar!!.hide()
        }
        binding.imageBack.setOnClickListener {
            val i = Intent(this, HomeActivity::class.java)
            startActivity(i)
        }
        findViewById<Button>(R.id.btnMilliToMicro).setOnClickListener(this)
        findViewById<Button>(R.id.btnGmToMilli).setOnClickListener(this)
        findViewById<Button>(R.id.btnKgToGram).setOnClickListener(this)
        findViewById<Button>(R.id.btnTonnetokg).setOnClickListener(this)
        findViewById<Button>(R.id.btnOunceToGm).setOnClickListener(this)
        findViewById<Button>(R.id.btnKgToPound).setOnClickListener(this)
        findViewById<Button>(R.id.btnKgToOunce).setOnClickListener(this)


    }

    @SuppressLint("SetTextI18n")
    override fun onClick(v: View?) {

        when (v?.id) {

            R.id.btnMilliToMicro-> {
                if (binding.etMillitoMicro.text.toString().trim().isEmpty()) {
                    binding.etMillitoMicro.error = "Required"
                    binding.etMillitoMicro.requestFocus()
                } else {
                    binding.tvMilliToMicro.text =
                        ((binding.etMillitoMicro.text.toString().toBigDecimal() * 1000.toString()
                            .toBigDecimal()).toString())
                }

            }
            R.id.btnGmToMilli -> {
                if (binding.etGmToMilli.text.toString().trim().isEmpty()) {
                    binding.etGmToMilli.error = "Required"
                    binding.etGmToMilli.requestFocus()
                } else {
                    binding.tvGmToMilli.text =
                        ((binding.etGmToMilli.text.toString().toBigDecimal() * 1000.toString()
                            .toBigDecimal()).toString())
                }

            }
            R.id.btnKgToGram -> {
                if (binding.etKgToGram.text.toString().trim().isEmpty()) {
                    binding.etKgToGram.error = "Required"
                    binding.etKgToGram.requestFocus()
                } else {
                    binding.tvKgToGram.text =
                        ((binding.etKgToGram.text.toString().toBigDecimal() * 1000.toString()
                            .toBigDecimal()).toString())
                }

            }
            R.id. btnTonnetokg -> {
                if (binding.etTonnetokg.text.toString().trim().isEmpty()) {
                    binding.etTonnetokg.error = "Required"
                    binding.etTonnetokg.requestFocus()
                } else {
                    binding.tvTonnetokg.text =
                        ((binding.etTonnetokg.text.toString().toBigDecimal() * 1000.toString()
                            .toBigDecimal()).toString())
                }

            }
            R.id. btnOunceToGm -> {
                if (binding.etOunceToGm.text.toString().trim().isEmpty()) {
                    binding.etOunceToGm.error = "Required"
                    binding.etOunceToGm.requestFocus()
                } else {
                    binding.tvOunceToGm.text =
                        ((binding.etOunceToGm.text.toString().toBigDecimal() * 28.349.toString()
                            .toBigDecimal()).toString())
                }

            }
            R.id. btnKgToPound -> {
                if (binding.etKgToPound.text.toString().trim().isEmpty()) {
                    binding.etKgToPound.error = "Required"
                    binding.etKgToPound.requestFocus()
                } else {
                    binding.tvKgToPound.text =
                        ((binding.etKgToPound.text.toString().toBigDecimal() * 2.204.toString()
                            .toBigDecimal()).toString())
                }

            }
            R.id. btnKgToOunce -> {
                if (binding.etKgToOunce.text.toString().trim().isEmpty()) {
                    binding.etKgToOunce.error = "Required"
                    binding.etKgToOunce.requestFocus()
                } else {
                    binding.tvKgToOunce.text =
                        ((binding.etKgToOunce.text.toString().toBigDecimal() * 35.274.toString()
                            .toBigDecimal()).toString())
                }

            }
        }
    }
}
