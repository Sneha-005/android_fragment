package com.example.fragments

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView


class LoginScreen : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_login_screen, container, false)
        view.findViewById<TextView>(R.id.new_account).setOnClickListener {
            val fragment = RegisterScreen()
            val transaction = parentFragmentManager.beginTransaction()
            parentFragmentManager.popBackStack()
            transaction.replace(R.id.main, fragment)
            transaction.addToBackStack(null)
            transaction.commit()
        }
        return view

    }
}