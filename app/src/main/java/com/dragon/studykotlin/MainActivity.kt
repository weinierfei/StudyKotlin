package com.dragon.studykotlin

import android.os.Bundle
import android.util.Log
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import java.util.*


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

        topLevelFunction()


        val strs: Array<String> = arrayOf("A", "B")
//        val anys: Array<Any> = strs // 不支持协变

        // 长度不可变
        val list: List<String> = listOf("a", "b")
        // 将不可变转换为可变
        list.toMutableList().add("c")

        // 长度可变
        val mutableList: MutableList<String> = mutableListOf("1", "2")
        mutableList.add("3")

        // 类似 Iterable
        var sequence = sequenceOf("a", "b")

//
//        testIntArray()
//        testFilter()
//        testRange()
//        testSequence()
//        testList()
//        testFor()
        test()
    }

    val intArray = intArrayOf(1, 2, 3)

    fun test(view: TextView?) {
        Log.i("MainActivity", "${view?.id}")
    }

    fun testIntArray() {

        intArray.forEach { i -> Log.i("-------------->", "$i") }
    }

    fun testFilter() {
        val newList: List<Int> = intArray.filter { i -> i != 1 }
        Log.i("-->", "$newList")
    }

    // rang 天生用来做遍历
    private fun testRange() {
        val range = 0..1000
//        for (i in range) {
//            Log.i("---->", "$i")
//        }

        for (i in 4 downTo 1) {
            Log.i("---->", "$i")
        }
    }

    private fun testSequence() {
        val sequence = sequenceOf(1, 2, 3, 4)
        val result = sequence
            .map { i ->
                Log.i("---->", "Map $i")
                i * 2
            }.filter { i ->
                Log.i("---->", "Filter $i")
                i % 3 == 0
            }

        // 具有惰性  出现满足条件的数子后 集合后面的不在执行
        Log.i("---->", "${result.first()}")

    }

    private fun testList() {
        val list = listOf<Int>(1, 2, 3, 4)
        val result = list
            .map { i ->
                Log.i("---->", "Map $i")
                i * 2
            }.filter { i ->
                Log.i("---->", "Filter $i")
                i % 3 == 0
            }
    }

    /**
     * for (int i = 0; i <= 10; i++) {
    // 遍历从 0 到 10
    }
     */
    private fun testFor() {
        for (i in 0..10) {
            Log.i("---->", "for $i")
        }

        for (x in 10 downTo 0) {
            Log.i("---->", "for $x")
        }
    }

    private fun test() {
        val list = listOf<Int>(21, 40, 11, 33, 78)

        list.filter { i ->
            i % 3 == 0
        }.forEach {
            Log.i("---->", "for $it")
        }
    }


    private fun fill(array: Array<in Objects>, objects: Objects) {

    }

}



