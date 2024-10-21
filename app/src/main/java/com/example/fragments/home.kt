package com.example.fragments

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.NavController
import androidx.navigation.Navigation
import com.example.fragments.R.*


class Home : Fragment() {
    private lateinit var navController: NavController
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        navController=Navigation.findNavController(view)
    }
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        val view = inflater.inflate(layout.fragment_home, container, false)
        view.findViewById<Button>(R.id.login).setOnClickListener {
            navController.navigate(R.id.action_home3_to_loginScreen)
        }
        view.findViewById<Button>(R.id.register).setOnClickListener {
            navController.navigate(R.id.action_home3_to_registerScreen)
        }
        return view

    }
}



