package com.dragon.studykotlin

/**
 * Description:
 *
 * @author guoyongping
 * @date   2019-09-14 16:25
 */
class Student constructor(var name: String) {

    private var sex = "男"
    private var age: Int = 20

    constructor(name: String, sex: String) : this(name) {
        this.sex = sex
    }

    constructor(name: String, sex: String, age: Int) : this(name) {
        this.sex = sex
        this.age = age
    }

    fun show() {
        println("$name,$sex,$age")
    }
}