package com.vivid.stdlib

fun main() {
    var a: String = "hello" // Regular initialization means non-null by default
//    a = null  // compilation error

    var b: String? = "world"  // can be set to null
//    b = null  // ok
    val len = b?.length ?: 0
    val len1 = b!!.length
    val len2 = b?.length ?: return

    val c = "Kotlin"
    val d: String? = null
    println(c?.length) // Unnecessary safe call


    println(d?.length)
}

fun letCall() {
    val listWithNulls: List<String?> = listOf("Kotlin", null)
    for (item in listWithNulls) {
        item?.let { println(it) } // prints Kotlin and ignores null
    }
}