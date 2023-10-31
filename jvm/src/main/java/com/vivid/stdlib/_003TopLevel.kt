@file:JvmName("MyTopLevel")

package com.vivid.stdlib

//top-level 接口
interface Animal {
    fun name(): String
    fun color(): String
}

//top-level 类
class Pig(var name: String, var color: String) : Animal {
    override fun name() = name

    override fun color() = color


}

//top-level 属性
val peppa = Pig("Peppa Pig", "red")

@JvmField
val george = Pig("george", "pink")

//top-level 函数
fun main() {
    println("name : ${peppa.name}, color : ${peppa.color}")
}
