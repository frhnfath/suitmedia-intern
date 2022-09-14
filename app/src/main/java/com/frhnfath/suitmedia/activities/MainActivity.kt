package com.frhnfath.suitmedia.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.frhnfath.suitmedia.databinding.ActivityMainBinding
import kotlin.text.StringBuilder

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        supportActionBar?.hide()

        binding.btnNext.setOnClickListener {
            val dataNameIntent = Intent(this@MainActivity, SecondActivity::class.java)
            val name = binding.edtName.text.toString()
            dataNameIntent.putExtra(SecondActivity.EXTRA_NAME, name)
            Toast.makeText(this@MainActivity, "Welcome, $name", Toast.LENGTH_SHORT).show()
            startActivity(dataNameIntent)
        }

        binding.btnCheck.setOnClickListener {
            val text = binding.edtPalindrome.text.toString()
            val palindrome = palindromeCheck(text)
            if (palindrome) {
                Toast.makeText(this@MainActivity, "is Palindrome", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this@MainActivity, "is not Palindrome", Toast.LENGTH_SHORT).show()
            }
        }
    }

    private fun palindromeCheck(text: String): Boolean {
        val text2 = StringBuilder(text).reverse().toString()
        return text.equals(text2, ignoreCase = true)
    }
}