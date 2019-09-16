package com.dragon.studykotlin

/**
 * Description:单例
 *
 * @author guoyongping
 * @date   2019-09-13 10:18
 */
object SingleCase : InterfaceB {
    override fun interfaceMethod() {
        //
    }

    val number: Int = 1

    fun method() {
        println("SingleCase.method")
    }
}