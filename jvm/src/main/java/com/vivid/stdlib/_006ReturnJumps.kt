package com.vivid.stdlib

fun test1() {
    outLoop@ for (i in 1..10) {
        for (j in 1..10) {
            break@outLoop
        }
    }
}


fun foo() {
    listOf(1, 2, 3, 4, 5).forEach {
        if (it == 3) return // non-local return directly to the caller of foo()
        println(it)
    }
    println("this point is unreachable")
}


fun foo1() {
    listOf(1, 2, 3, 4, 5).forEach lit@{
        if (it == 3) return@lit //  local return to the caller of the lambda - the forEach loop
        println(it)
    }
    println(" done with explicit label")
}

fun foo2() {
    listOf(1, 2, 3, 4, 5).forEach {
        if (it == 3) return@forEach //  local return to the caller of the lambda - the forEach loop
        println(it)
    }
    println(" done with implicit label")
}

fun foo3() {
    run loop@{
        listOf(1, 2, 3, 4, 5).forEach {
            if (it == 3) return@loop //   non-local return from the lambda passed to run
            println(it)
        }
    }
    print(" done with nested loop")
}


fun main() {
    foo3()
}