package com.example.kotlindemo.example

import java.io.File

/**
 * create by mozemin on 2018/11/11
 * desc:
 */

fun main(args: Array<String>) {

    var map = HashMap<Char, Int>()
//    File("build.gradle").readText().toCharArray().filterNot(Char::isWhitespace).forEach {
//        val char = map[it]
//        if (char == null) map[it] = 1
//        else map[it] = char + 1
//    }
    File("build.gradle").readText().toCharArray().filterNot(Char::isWhitespace)
            .groupBy { it }.map {
                it.key to it.value.size
            }.forEach(::println)
    //map.forEach(::println)


}