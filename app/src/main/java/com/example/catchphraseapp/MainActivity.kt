package com.example.catchphraseapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AlertDialog
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

        // 1) viewを取得
        val et:EditText = findViewById(R.id.ed)
        val btnStart:Button = findViewById(R.id.btnStart)

        // 2) 画面を渡す
        btnStart.setOnClickListener {
            if (et.text.toString() == ""){
                Toast.makeText(this,"なんか書いて",Toast.LENGTH_LONG).show()
            }else{
                val intent = Intent(this,ResultActivity::class.java)
                // 3) 値を渡す
                intent.putExtra("MY_ITEM",et.text.toString())
                startActivity(intent)
            }

        }

    }
}