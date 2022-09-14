package com.frhnfath.suitmedia.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.frhnfath.suitmedia.databinding.ActivityThirdBinding

class ThirdActivity : AppCompatActivity() {

    private lateinit var binding : ActivityThirdBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityThirdBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}