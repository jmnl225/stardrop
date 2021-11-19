package com.stardrop.mrpgstardrop.login

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.PersistableBundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.stardrop.mrpgstardrop.MainActivity

class SplashActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        init()
    }

    private fun init(){
        val intent = Intent(this, MainActivity::class.java)
        Log.d("aaaaaaaaaaa", "splash")

        Handler().postDelayed({
            intent.apply {
                intent.flags = Intent.FLAG_ACTIVITY_CLEAR_TASK or Intent.FLAG_ACTIVITY_NEW_TASK
            }
            startActivity(intent)
        }, 1000)

    }

}