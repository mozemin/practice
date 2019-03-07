package com.example.kotlindemo.extend

import java.lang.StringBuilder

/**
 * create by mozemin on 2018/11/8
 * desc:
 */

fun main(args: Array<String>) {
    println("bcd".multiply(5))
    println("abc" * 10)
    println("cd".a)
    "ab".b = 6
    println("ab".b)
}
operator fun String.times(int:Int):String{
    val stringBuilder=StringBuilder()
    for(i in 0 until int){
        stringBuilder.append(this)
    }
    return stringBuilder.toString()
}

fun String.multiply(int:Int):String{
    val stringBuilder=StringBuilder()
    for(i in 0 until int){
        stringBuilder.append(this)
    }
    return stringBuilder.toString()
}

val String.a:String
    get() = "abvcde"

var String.b:Int
    set(value){
    }
    get()=5