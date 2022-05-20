package com.example.mavenlibclient2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.example.mavenlib2.MavenLibMainActivity

//import com.example.mavenlib2.MavenLibMainActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        findViewById<TextView>(R.id.tvTest).setOnClickListener{
            startActivity(
                Intent(
                    this@MainActivity, MavenLibMainActivity::class.java
                )
            )
        }
    }
}