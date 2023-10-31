package com.vivid.stdlib

import kotlin.reflect.KCallable
import kotlin.reflect.KFunction

typealias MyFunc = Int.(String) -> String

// receiver type
lateinit var a: Int.(String) -> String

fun main1() {
//    listOf(1, 2, 5).fold(0) { acc, i ->
//        println("acc:$acc, item:$i")
//        i + acc
//    }

    a = { s -> plus(10).toString() + " $s" }
    val c = fun(p1: Int, p2: String): String { return p1.toString().plus(p1) + p2 }
    val b: MyFunc = a
    println(a)
    println(b)
    println(c)

    println(a(1, "hello world!"))
    println(b.invoke(2, "test"))
    println(2.b("test"))
    println(c(3, "test"))

    val d = IntTransformer()
    println(d(10))

    instantFunType()
    installFunRef()

}

fun main() {
    installFunRef()
//    installPropRef()
}

fun instantFunType() {
    var funA: (Int) -> String
    //lambda
    funA = { x: Int -> x.toString() }
    //anonymous function
    funA = fun(x: Int) = x.toString()
    println(funA)
}

fun installFunRef() {
    //top-level function reference,::isOdd is a value of function type (Int) -> Boolean
    val a: (Int) -> Boolean = ::isOdd
    //extension function
    val b: String.() -> Int = String::toInt
    //local function
    val c: (Any) -> Unit = ::println
    //member function
    val p = P()
    val d: (String) -> String = p::sayHello
    println(d is KFunction<*>)
}

fun installPropRef() {
    val strs = listOf("a", "b", "c")
    val len: (String) -> Int = String::length
    println(strs.map(len))
    val size: (List<Int>) -> Int = List<Int>::size
    println(strs is KCallable<*>)
}

fun constructorRef() {
    funConRef(::P)
}

fun funConRef(factory: () -> P) {
    val x: P = factory()
}

class P {
    fun sayHello(s: String) = "Hello $s"
}

fun isOdd(x: Int) = x % 2 != 0

class IntTransformer : (Int) -> Int {
    override fun invoke(p: Int): Int {
        return p + p
    }
}