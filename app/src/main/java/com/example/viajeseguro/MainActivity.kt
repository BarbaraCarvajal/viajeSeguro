package com.example.viajeseguro

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.commit
import androidx.fragment.app.replace
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {

    lateinit var navegacion : BottomNavigationView
    private val mONavMenu = BottomNavigationView.OnNavigationItemSelectedListener{
        item ->
            when(item.itemId){
                R.id.itemFragment1 ->{
                    supportFragmentManager.commit {

                        replace<PrimerFragment>(R.id.frameConteiner)
                        setReorderingAllowed(true)
                        addToBackStack("replacement")

                    }
                    return@OnNavigationItemSelectedListener  true
                }
                R.id.itemFragment2 ->{
                    supportFragmentManager.commit {

                        replace<SegundoFragment>(R.id.frameConteiner)
                        setReorderingAllowed(true)
                        addToBackStack("replacement")

                    }
                    return@OnNavigationItemSelectedListener  true
                }
                R.id.itemFragment3 ->{
                    supportFragmentManager.commit {

                        replace<TercerFragment>(R.id.frameConteiner)
                        setReorderingAllowed(true)
                        addToBackStack("replacement")

                    }
                    return@OnNavigationItemSelectedListener  true
                }
            }





        false
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        navegacion = findViewById(R.id.navMenu)
        navegacion.setOnNavigationItemSelectedListener(mONavMenu)


        supportFragmentManager.commit {

            replace<PrimerFragment>(R.id.frameConteiner)
            setReorderingAllowed(true)
            addToBackStack("replacement")

        }

    }
}