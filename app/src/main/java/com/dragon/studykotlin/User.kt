package com.dragon.studykotlin

/**
 * Description:
 * @author: guoyongping
 * @date:  2019-09-10 11:20
 */
open class User {

    // 初始代码块 先于构造方法执行
    init {
        Sample.anotherStrng

        SingleCase.method()


    }

    // 构造方法
    constructor() {

    }


    open fun method(){

    }

    /**
     * val 是只读变量，只读的意思就是说 val 声明的变量不能进行重新赋值，也就是说不能调用 setter 函数，因此，val 声明的变量是不能重写 setter 函数的
     *
     * val 所声明的只读变量，在取值(getter)的时候仍然可能被修改，这也是和 Java 里的 final 的不同之处。
     */
    var name = "Mike"
        get() {
            return "$field nb"
        }
        set(value) {
            field = "Cute $value"
        }
}