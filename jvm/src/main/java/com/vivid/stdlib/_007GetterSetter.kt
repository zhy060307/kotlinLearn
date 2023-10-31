package com.vivid.stdlib

class Person {
    var name: String = ""
        get() {
            println("call get()")
            return field
        }
        set(value) {
            println("call set()")
            field = value
        }
}

var counter = 0  // the initializer assigns the backing field directly
    set(value) {
        if (value >= 0)
            counter = value // ERROR StackOverflow: Using actual name 'counter' would make setter recursive
    }

fun main() {
    counter = 10
    println(counter)
}