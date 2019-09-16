package com.dragon.studykotlin

/**
 * Description:
 * @author: guoyongping
 * @date:  2019-09-10 11:44
 */


class Person : User(), InterfaceB {


    // user
    override fun method() {
        super.method()


        topLevelFunction()
    }

    // InterfaceB
    override fun interfaceMethod() {
        //实现
    }

    val xx: String
        get() {
            return "$name.$xx"
        }
}