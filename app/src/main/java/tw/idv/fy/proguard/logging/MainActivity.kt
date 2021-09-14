package tw.idv.fy.proguard.logging

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val tv = findViewById<View>(R.id.tv)
        tv.postDelayed(object: Runnable{
            var count = 0
            override fun run() {
                android.util.Log.i("Faty", "${++count}")
                tv.postDelayed(this, 500L)
            }
        }, 500L)
    }
}