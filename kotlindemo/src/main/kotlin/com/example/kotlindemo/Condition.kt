package com.example.kotlindemo

/**
 * create by mozemin on 2018/10/24
 * desc:
 */

private const val USERNAME="kotlin"
private const val USERPASS="kotlin"

fun main(args: Array<String>) {
    println("请输入用户名：")
    val userName= readLine()
    println("请输入密码：")
    val password= readLine()
    if(userName==USERNAME && password==USERPASS){
        println("success")
    }else{
        println("faile")
    }
}

