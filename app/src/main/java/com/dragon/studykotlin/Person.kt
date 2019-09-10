package com.dragon.studykotlin

/**
 * Description:
 * @author: guoyongping
 * @date:  2019-09-10 11:44
 */
class Person : User() {
    var xx = "000"
        get() {
            return name + xx
        }
}