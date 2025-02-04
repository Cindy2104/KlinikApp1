package com.bimbi.klinikapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class PageLogin : AppCompatActivity() {

    private lateinit var txtSignUp : TextView
    private lateinit var btnSignUp : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()


        setContentView(R.layout.activity_page_login)
        txtSignUp = findViewById(R.id.txtSignUp)
        btnSignUp = findViewById(R.id.btnSignUp)

        txtSignUp.setOnClickListener() {
            val intent = Intent(this, PageRegistar::class.java)
            startActivity(intent);
        }
        btnSignUp.setOnClickListener(){
            val intent = Intent(this, DoctorPageActivity::class.java)
            startActivity(intent);
        }

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}