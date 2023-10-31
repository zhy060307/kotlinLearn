package com.vivid.stdlib

fun main() {
    //anonymous functions
    val funA: (Int, Int) -> Int = fun(a: Int, b: Int) = a + b
    val funA1 = fun(a: Int, b: Int) = a + b

    //lambda expression
    val funB: (Int, Int) -> Int = { a: Int, b: Int -> a + b }
    val funB1: (Int, Int) -> Int = { a, b -> a + b }
    val funB2 = { a: Int, b: Int -> a + b }

    //return unit
    val funC: (Int) -> Unit = { println(it) }
    //return not unit
    val funD: (Int) -> String = {
        println(it)
        it.toString()
    }

    val sum: (Int, Int) -> Int = { a: Int, b: Int -> a + b }
    val sum1: (Int, Int) -> Int = { a, b -> a + b }
    val sum2 = { a: Int, b: Int -> a + b }

    val toInt: (String) -> Unit = { s -> println(s) }
    val toInt1: (String) -> Unit = { println(it) }
}


fun passLambda() {
    val strs = listOf(1, 2, 3)
    strs.last({ s -> s > 1 })
    strs.last() { s -> s > 1 }
    strs.last { s -> s > 1 }

    val sum = fun(a: Int, b: Int): Int {
        return a + b
    }
}

//Function literals with receiver
fun receiverFun() {
    //lambda expression
    val sum: Int.(Int) -> Int = { other -> this.plus(other) }
    sum(2, 5)
    2.sum(5)

    //anonymous function
    val sum1 = fun Int.(other: Int): Int = this + other
    sum1(2, 5)
    2.sum1(5)

    html {
        body()
    }
}

class HTML {
    fun body() {

    }
}

fun html(init: HTML.() -> Unit): HTML {
    val html = HTML()
    html.init()
    return html
}