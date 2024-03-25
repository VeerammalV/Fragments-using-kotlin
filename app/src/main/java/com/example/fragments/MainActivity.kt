package com.example.fragments

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import com.example.fragments.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var fragmentManager: FragmentManager
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btn1.setOnClickListener {
            goToFragment(Fragment1())
        }

        binding.btn2.setOnClickListener {
            goToFragment(Fragment2())
        }

        binding.btn3.setOnClickListener {
            goToFragment(Fragment3())
        }
    }

    private fun goToFragment(fragment: Fragment) {
        fragmentManager = supportFragmentManager
        fragmentManager.beginTransaction().replace(R.id.fragment_container, fragment).commit()
    }
















//    private fun switchFragment(intWhich: Int) {
//        var fragment: Fragment? = null;
//
//        when(intWhich) {
//            1 -> {
//                fragment = Fragment1();
//            }
//            2 -> {
//                fragment = Fragment2();
//            }
//        }
//        fragment = Fragment1();
//
//        val args = Bundle();
//        args.putString("data","Passed data")
//
//
//        fragment.arguments = args
//        val fragmentTransaction: FragmentTransaction = supportFragmentManager.beginTransaction();
//        fragmentTransaction.replace(R.id.frameLayout, fragment);
//        fragmentTransaction.addToBackStack(null)
//        fragmentTransaction.commit()
//    }
}