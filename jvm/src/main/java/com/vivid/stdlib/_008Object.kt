package com.vivid.stdlib

interface Food {
    fun getName(): String
}


object DataSourceManager {

}

class ClassA {
    companion object Factory {
        fun create(): ClassA = ClassA()
    }
}

class ClassB {
    companion object {
        fun create(): ClassB = ClassB()
    }
}

class ClassC {
    companion object {

        @JvmField
        val myClass = ClassC()

        @JvmStatic
        fun create(): ClassC = ClassC()
    }
}

fun main() {
    val a = ClassA.create()
    val b = ClassB.create()
    val helloWorld = object {
        val hello = "Hello"
        val world = "World"

        //object expressions extend Any
        override fun toString() = "$hello $world"
    }
    println(helloWorld)

    //object expressions extend Food
    val noodle = object : Food {
        override fun getName() = "biangbiangmian"

    }
    println(noodle.getName())
}

