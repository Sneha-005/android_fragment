package com.example.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val openlogin = findViewById<Button>(R.id.login)
        openlogin.setOnClickListener{
            val currentFragment = supportFragmentManager.findFragmentById(R.id.main)
            if (currentFragment !is LoginScreen) {
                val fragment = LoginScreen()
                val transaction = supportFragmentManager.beginTransaction()
                transaction.replace(R.id.main, fragment)
                transaction.addToBackStack(null)
                transaction.commit()
            }
        }

        val openregister = findViewById<Button>(R.id.register)
        openregister.setOnClickListener{
            val currentFragment = supportFragmentManager.findFragmentById(R.id.main)
            if (currentFragment !is RegisterScreen) {
                val fragment = RegisterScreen()
                val transaction = supportFragmentManager.beginTransaction()
                transaction.replace(R.id.main, fragment)
                transaction.addToBackStack(null)
                transaction.commit()
            }
        }
    }
}


