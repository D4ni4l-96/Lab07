package com.danial.lab07

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.danial.lab07.databinding.ActivityConfirmBinding
import com.danial.lab07.databinding.ActivityMainBinding

class ConfirmActivity : AppCompatActivity() {

    private lateinit var binding: ActivityConfirmBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityConfirmBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.nameEditText.text = intent.getStringExtra("name")
        binding.addressEditText.text = intent.getStringExtra("address")
        binding.cityEditText.text = intent.getStringExtra("city")
        binding.postcodeEditText.text = intent.getStringExtra("postcode")
        binding.stateEditText.text = intent.getStringExtra("state")
        binding.countryEditText.text = intent.getStringExtra("country")

        binding.confirmBtn.setOnClickListener {
            val intent = Intent(this,FinishActivity::class.java)
            startActivity(intent)
        }

        binding.cancelBtn.setOnClickListener {
            finish()
        }



        }
    }
