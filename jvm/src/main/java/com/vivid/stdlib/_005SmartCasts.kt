package com.vivid.stdlib

fun demo(x: Any) {
    if (x !is String) return
    print(x.length) // x is automatically cast to String
}

fun demo1(x: Any) {
    if (x is String) {
        print(x.length) // x is automatically cast to String
    }
}

// when 表达式
fun demo2(x: Any) {
    when (x) {
        is Int -> print(x + 1)
        is String -> print(x.length + 1)
        is IntArray -> print(x.sum())
    }
}

