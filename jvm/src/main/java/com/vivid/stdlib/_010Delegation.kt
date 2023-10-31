package com.vivid.stdlib

import kotlin.properties.Delegates

interface Base {
    fun print()
}

class BaseImpl(val x: Int) : Base {
    override fun print() {
        println(x)
    }
}

class Derived(b: Base) : Base by b


val hello by lazy {
    "hello world"
}

class User {
    var name: String by Delegates.observable("<no name>") { prop, old, new -> println("$old -> $new") }
}

class UserX(val map: Map<String, Any?>) {
    val name: String by map
    val age: Int by map
}

fun main() {
    val user = User()
    user.name = "first"
    user.name = "second"

    val userX = UserX(mapOf("name" to "John Doe", "age" to 25))
    println(userX.name)
    println(userX.age)


//    val b = BaseImpl(10)
//    Derived(b).print()
//    println(hello)
}