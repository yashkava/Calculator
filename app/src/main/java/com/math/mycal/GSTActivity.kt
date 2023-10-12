package com.math.mycal

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import com.math.mycal.R
import com.math.mycal.databinding.ActivityGstBinding
import com.math.mycal.databinding.ActivityMainBinding

class GSTActivity : AppCompatActivity(), View.OnClickListener {
    lateinit var binding: ActivityGstBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityGstBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        if (supportActionBar != null) {
            supportActionBar!!.hide()
        }
        binding.imageBack.setOnClickListener {
            val i = Intent(this, HomeActivity::class.java)
            startActivity(i)
        }
        findViewById<Button>(R.id.five).setOnClickListener(this)
        findViewById<Button>(R.id.twelve).setOnClickListener(this)
        findViewById<Button>(R.id.eighteen).setOnClickListener(this)
        findViewById<Button>(R.id.twentyE).setOnClickListener(this)
        findViewById<Button>(R.id.resetnum).setOnClickListener(this)
    }

    private fun inputIsNotEmpty(): Boolean {
        var b = true
        if (binding.number1.text.toString().trim().isEmpty()) {
            binding.number1.error = "Required"
            binding.number1.requestFocus()
            b = false
        }

        return b
    }

    @SuppressLint("SetTextI18n")
    override fun onClick(v: View?) {
        if (inputIsNotEmpty()) {
            when (v?.id) {
                R.id.five -> {

                        val non = ((binding.number1.text.toString().toBigDecimal() * 5.toString().toBigDecimal())
                                / 100.toString().toBigDecimal()).toString()
                    binding.gst.text = non
                    binding.postgst.text =
                        (binding.number1.text.toString().toBigDecimal() + non.toBigDecimal()).toString()
                    binding.pregst.text =
                        (binding.number1.text.toString().toBigDecimal() - non.toBigDecimal()).toString()
                }
                R.id.twelve -> {

                    val non = ((binding.number1.text.toString().toBigDecimal() * 12.toString().toBigDecimal())
                            / 100.toString().toBigDecimal()).toString()
                    binding.gst.text = non
                    binding.postgst.text =
                        (binding.number1.text.toString().toBigDecimal() + non.toBigDecimal()).toString()
                    binding.pregst.text =
                        (binding.number1.text.toString().toBigDecimal() - non.toBigDecimal()).toString()
                }
                R.id.eighteen -> {

                    val non = ((binding.number1.text.toString().toBigDecimal() * 18.toString().toBigDecimal())
                            / 100.toString().toBigDecimal()).toString()
                    binding.gst.text = non
                    binding.postgst.text =
                        (binding.number1.text.toString().toBigDecimal() + non.toBigDecimal()).toString()
                    binding.pregst.text =
                        (binding.number1.text.toString().toBigDecimal() - non.toBigDecimal()).toString()
                }
                R.id.twentyE -> {

                    val non = ((binding.number1.text.toString().toBigDecimal() * 28.toString().toBigDecimal())
                            / 100.toString().toBigDecimal()).toString()
                    binding.gst.text = non
                    binding.postgst.text =
                        (binding.number1.text.toString().toBigDecimal() + non.toBigDecimal()).toString()
                    binding.pregst.text =
                        (binding.number1.text.toString().toBigDecimal() - non.toBigDecimal()).toString()
                }


                R.id.resetnum -> {
                    binding.number1.text.clear()
                    binding.gst.text = ""
                    binding.postgst.text = ""
                    binding.pregst.text = ""
                }
            }
        }
    }
}

