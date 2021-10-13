package tw.idv.fy.proguard.logging

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.util.Log.*
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//        val tv = findViewById<View>(R.id.tv)
//        tv.postDelayed(object: Runnable{
//            var count = 0
//            override fun run() {
//                android.util.Log.i("Faty", "${++count}")
//                tv.postDelayed(this, 500L)
//            }
//        }, 500L)
        val tv = findViewById<android.widget.TextView>(R.id.tv)
        tv.text = "BUILD_TYPE = ${BuildConfig.BUILD_TYPE}\nDebuggable = ${BuildConfig.DEBUG}\n" +
                "0 = ${isLoggable("Faty", 0)}\n" +
                "1 = ${isLoggable("Faty", 1)}\n" +
                "VERBOSE = ${isLoggable("Faty", VERBOSE)}\n" +
                "DEBUG = ${isLoggable("Faty", DEBUG)}\n" +
                "INFO = ${isLoggable("Faty", INFO)}\n" +
                "WARN = ${isLoggable("Faty", WARN)}\n" +
                "ERROR = ${isLoggable("Faty", ERROR)}\n" +
                "ASSERT = ${isLoggable("Faty", ASSERT)}"
    }
}