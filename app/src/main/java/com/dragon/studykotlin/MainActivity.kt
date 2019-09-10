package com.dragon.studykotlin

import android.os.Bundle
import android.util.Log
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {


    /**
     * ?. :对变量做一次非空确认之后再调用方法
     * !! :肯定不为null断言
     * lateinit : 延迟初始化
     */
    // lateinit 延迟初始化
    lateinit var textView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        textView = findViewById(R.id.tvName)


        test(textView)


    }

    fun test(view: TextView?) {
        Log.i("MainActivity", "${view?.id}")
    }

}
