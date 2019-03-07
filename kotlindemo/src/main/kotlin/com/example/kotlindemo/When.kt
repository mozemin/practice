package com.example.kotlindemo

/**
 * create by mozemin on 2018/10/24
 * desc:
 */

fun main(args: Array<String>) {
    var x=5
    when(x){
        is Int-> println("hello $x")
        in 1..100-> println("$x is in 1..100")
        !in 1..100-> println("$x is not in 1..100")
    }
    when(x){
        0,1-> println("x==0 or x==1")
        else -> println("otherwise")
    }
}