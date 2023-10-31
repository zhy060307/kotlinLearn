package com.vivid.stdlib

import com.vivid.stdlib._012FunctionlInterface.JavaInterface

fun interface KInterface {
    fun invoke()
    fun sayHello() = "Hello world K"
}

fun main() {
    javaSAM {

    }
    kotlinSAM {

    }

}

fun javaSAM(myInterface: JavaInterface) {
    println(myInterface.sayHello())
}

fun kotlinSAM(myInterface: KInterface) {
    println(myInterface.sayHello())
}


