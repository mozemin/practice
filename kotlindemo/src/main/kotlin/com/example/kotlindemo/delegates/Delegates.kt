package com.example.kotlindemo.delegates

import kotlin.reflect.KProperty

/**
 * create by mozemin on 2018/11/8
 * desc:
 */

class Delegates{
    val hello by lazy { "hello world" }
    val hello2 by S()
    val hello3 by S()
}

class S{
    private var value:String?=null
    operator fun getValue(thisRef:Any?,property:KProperty<*>):String{
        return value?:""
    }
    operator fun setValue(thisRef:Any?,property:KProperty<*>,value: String){
        this.value=value
    }
}