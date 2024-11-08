package com.github.georgeh1998.appnameoverride

import android.app.Activity
import android.os.Bundle
import android.widget.TextView

class MainActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

        findViewById<TextView>(R.id.title1).text = getString(com.github.georgeh1998.mymodule.R.string.app_name)
        findViewById<TextView>(R.id.title2).text = getString(com.takusemba.spotlight.R.string.app_name)
    }
}