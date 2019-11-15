package com.example.wifianimation

import android.graphics.drawable.AnimationDrawable
import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

/**
 * Simple Kotlin application for Wifi animation
 * @author R.GOPALAKRISHNAN
 * @author www.rgopalakrishnanmca.simplesite.com
 **/

class MainActivity : AppCompatActivity() {

    companion object {
        lateinit var wifiAnimation: AnimationDrawable
    }

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var imageview=findViewById<ImageView>(R.id.image)
        imageview.setBackgroundResource(R.drawable.animation)
        wifiAnimation= imageview.background as AnimationDrawable
    }

    override fun onWindowFocusChanged(hasFocus: Boolean) {
        super.onWindowFocusChanged(hasFocus)
        wifiAnimation.start()
    }

}
