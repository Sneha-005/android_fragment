package com.example.fragments

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.navigation.NavController
import androidx.navigation.Navigation
import androidx.navigation.NavOptions
import com.example.fragments.R.*


class RegisterScreen : Fragment() {
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
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.register_screen, container, false)
        view.findViewById<TextView>(R.id.old_account).setOnClickListener {
            val navOptions = NavOptions.Builder()
                .setPopUpTo(R.id.registerScreen, true)
                .build()

            navController.navigate(R.id.action_registerScreen_to_loginScreen, null, navOptions)
        }
        return view
    }

}