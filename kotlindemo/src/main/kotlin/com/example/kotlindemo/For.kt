package com.example.kotlindemo

/**
 * create by mozemin on 2018/10/24
 * desc:
 */

fun main(args: Array<String>) {
    for(arg in args){
        println(arg)
    }
    for((index,value)in args.withIndex()){
        println("$index -> $value")
    }
    hello(1,2,3,string="test")
}
fun hello(vararg ints:Int,string:String){
    ints.forEach(::println)
    println(string)
}