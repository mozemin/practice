package com.example.kotlindemo.innerclass

/**
 * create by mozemin on 2018/11/9
 * desc:
 */

class Outter{
    val a:Int=10
    inner class Inner{// 非静态内部类
        val a :Int=5
        fun hello(){
            println("outter a:${this@Outter.a}")
        }
    }
    class Inner2{
        fun hello(){
            println("hello world!")
        }
    }
}
interface OnClicklistener{
    fun onClick()
}
class View{
    var onClicklistener:OnClicklistener?=null

}

fun main(args: Array<String>) {
    var inner = Outter().Inner()
    inner.hello()
    var inner2= Outter.Inner2()
    inner2.hello()

    val view=View()
    view.onClicklistener=object :OnClicklistener{
        override fun onClick() {
            TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        }
    }

}