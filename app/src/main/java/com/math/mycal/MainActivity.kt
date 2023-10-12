package com.math.mycal

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import com.math.mycal.R
import com.math.mycal.databinding.ActivityMainBinding

@Suppress("UNREACHABLE_CODE")
class MainActivity : AppCompatActivity(), View.OnClickListener {
    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        if (supportActionBar != null) {
            supportActionBar!!.hide()
        }
        binding.imageBack.setOnClickListener {
            val i = Intent(this, HomeActivity::class.java)
            startActivity(i)
        }


        findViewById<Button>(R.id.add).setOnClickListener(this)
        findViewById<Button>(R.id.sub).setOnClickListener(this)
        findViewById<Button>(R.id.mul).setOnClickListener(this)
        findViewById<Button>(R.id.div).setOnClickListener(this)
        findViewById<Button>(R.id.per).setOnClickListener(this)
        findViewById<Button>(R.id.res).setOnClickListener(this)
    }

    private fun inputIsNotEmpty(): Boolean {
        var b = true
        if (binding.num1.text.toString().trim().isEmpty()) {
            binding.num1.error = "Required"
            binding.num1.requestFocus()
            b = false
        }
        if (binding.num2.text.toString().trim().isEmpty()) {
            binding.num2.error = "Required"
            binding.num2.requestFocus()
            b = false
        }
        return b
    }

    @SuppressLint("SetTextI18n")
    override fun onClick(v: View?) {
        if (inputIsNotEmpty()) {
            when (v?.id) {
                R.id.add -> {
                    binding.ans.text =
                        (binding.num1.text.toString().toBigDecimal() + binding.num2.text.toString()
                            .toBigDecimal()).toString()
                }
                R.id.sub -> {
                    binding.ans.text =
                        (binding.num1.text.toString().toBigDecimal() - binding.num2.text.toString()
                            .toBigDecimal()).toString()
                }
                R.id.mul -> {
                    binding.ans.text =
                        (binding.num1.text.toString().toBigDecimal() * binding.num2.text.toString()
                            .toBigDecimal()).toString()
                }
                R.id.div -> {
                    binding.ans.text =
                        (binding.num1.text.toString().toBigDecimal() / binding.num2.text.toString()
                            .toBigDecimal()).toString()
                }
                R.id.per -> {
                    binding.ans.text =
                        ((binding.num1.text.toString().toBigDecimal() / 100.toString().toBigDecimal()
                                * binding.num2.text.toString().toBigDecimal()).toString())
                    }



                R.id.res -> {
                    binding.num1.text.clear()
                    binding.num2.text.clear()
                    binding.ans.text = ""

                }
            }
        }
    }
}




