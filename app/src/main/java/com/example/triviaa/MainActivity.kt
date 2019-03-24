package com.example.triviaa

import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toolbar
import androidx.databinding.DataBindingUtil
import androidx.drawerlayout.widget.DrawerLayout
import androidx.navigation.findNavController
import androidx.navigation.ui.NavigationUI
import com.example.triviaa.databinding.ActivityMainBinding
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() ,GameFragment.OnFragmentInteractionListener,AboutFragment.OnFragmentInteractionListener {


    private lateinit var layoutDrawer:DrawerLayout
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        @Suppress("UNUSED_VARIABLE")
        val binding= DataBindingUtil.setContentView<ActivityMainBinding>(this,R.layout.activity_main)
        layoutDrawer=binding.drawerLayout
        val navController=this.findNavController(R.id.myNavHostFragment)
        NavigationUI.setupActionBarWithNavController(this,navController,layoutDrawer)
        NavigationUI.setupWithNavController(binding.navView,navController)



    }
    override fun onFragmentInteraction(uri: Uri) {
        // save some data from the fragment...
        // other business logic...
    }

    override fun onSupportNavigateUp(): Boolean {
        val navController=this.findNavController(R.id.myNavHostFragment)
        return NavigationUI.navigateUp(drawerLayout,navController)
    }
}
