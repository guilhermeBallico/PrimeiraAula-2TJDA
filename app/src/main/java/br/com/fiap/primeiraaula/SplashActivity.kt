package br.com.fiap.primeiraaula

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.sax.StartElementListener

class SplashActivity : AppCompatActivity() {

    val Tempo_Splash = 3500L

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
    }

    fun Carregar () {
        Handler().postDelayed({
            startActivity(Intent(this, MainActivity::class.java))
            finish()
            }, Tempo_Splash)
    }
}
