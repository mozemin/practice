package com.example.kotlindemo.SealedClass

import java.net.URL

/**
 * create by mozemin on 2018/11/9
 * desc:
 */
sealed class PlayerCmd{
    class play(val url: String,val postion:Long=0):PlayerCmd()
    class Seek(val postion:Long):PlayerCmd()
    object Pause:PlayerCmd()
    object Resume:PlayerCmd()
    object Stop:PlayerCmd()
}