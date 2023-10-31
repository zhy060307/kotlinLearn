package com.vivid.stdlib


fun sayHello(): Unit {
    println("Hello world")
}

fun sayHello1() {
    println("Hello world")
}

var sayHello2: (() -> Unit)? = null

fun noThingToSay(): Nothing? {
    return null
}

fun fail(message: String): Nothing {
    throw IllegalStateException(message)
}

fun main() {
    println(sayHello())
    println(sayHello1())
    sayHello2 = { println("hello world") }
    println(sayHello2?.invoke())
}