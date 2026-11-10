package com.destabuilds.myporto.ui

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.destabuilds.myporto.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnCheckConfig.setOnClickListener {
            binding.tvStatus.text = "ViewBinding Berhasil Dilakukan!"
            Toast.makeText(
                this,
                "Konfigurasi Project & ViewBinding Berhasil!",
                Toast.LENGTH_SHORT
            ).show()
        }

    }
}