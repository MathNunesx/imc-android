package com.example.imc

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }

    fun abreHomepage(view: View) {
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
    }
    fun abreIMCpage(view: View) {
        val intent = Intent(this, ImcPage::class.java)
        startActivity(intent)
    }
    fun abreMediapage(view: View) {
        val intent = Intent(this, MediaPage::class.java)
        startActivity(intent)
    }
    fun abreSobrepage(view: View) {
        val intent = Intent(this, AboutPage::class.java)
        startActivity(intent)
    }
}