package com.math.mycal

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import com.math.mycal.R
import com.math.mycal.databinding.ActivityPerBinding


class PerActivity : AppCompatActivity(), View.OnClickListener {
    lateinit var binding: ActivityPerBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPerBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        if (supportActionBar != null) {
            supportActionBar!!.hide()
        }
        binding.imageBack.setOnClickListener {
            val i = Intent(this, HomeActivity::class.java)
            startActivity(i)
        }
        findViewById<Button>(R.id.inc).setOnClickListener(this)
        findViewById<Button>(R.id.dec).setOnClickListener(this)
        findViewById<Button>(R.id.resetnum).setOnClickListener(this)
    }

    @SuppressLint("SetTextI18n")
    override fun onClick(v: View?) {
        if (inputIsNotEmpty()) {
            when (v?.id) {
                R.id.inc -> {
                    val ob =  ( binding.number1.text.toString().toBigDecimal() / 100.toString().toBigDecimal())

                    val og =  ( binding.number2.text.toString().toBigDecimal() * ob.toString().toBigDecimal())

                    binding.answer.text =
                        (binding.number1.text.toString().toBigDecimal() + og.toString().toBigDecimal()).toString()

                }
                R.id.dec -> {
                    val ob =  ( binding.number1.text.toString().toBigDecimal() / 100.toString().toBigDecimal())

                    val og =  ( binding.number2.text.toString().toBigDecimal() * ob.toString().toBigDecimal())

                    binding.answer.text =
                        (binding.number1.text.toString().toBigDecimal() - og.toString().toBigDecimal()).toString()

                }

                R.id.resetnum -> {
                    binding.number1.text.clear()
                    binding.number2.text.clear()
                    binding.answer.text = ""

                }
            }
        }
    }

    private fun inputIsNotEmpty(): Boolean {
        var b = true
        if (binding.number1.text.toString().trim().isEmpty()) {
            binding.number1.error = "Required"
            binding.number1.requestFocus()
            b = false
        }
        if (binding.number2.text.toString().trim().isEmpty()) {
            binding.number2.error = "Required"
            binding.number2.requestFocus()
            b = false
        }
        return b
    }
}