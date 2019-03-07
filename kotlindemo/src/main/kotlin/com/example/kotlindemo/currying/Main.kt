package com.example.kotlindemo.currying

import java.io.OutputStream
import java.nio.charset.Charset

/**
 * create by mozemin on 2018/11/11
 * desc:
 */

//fun hello(x:String,y:Int,z:Double){
//    return true
//}
//fun curriedHello(x: String):(y:Int)->(z:Double)->Boolean{
//}

fun log(tag:String,target: OutputStream,message:Any?){
    target.write("[$tag] $message\n".toByteArray())
}
fun log(tag:String)
        =fun(target:OutputStream)
        =fun(message:Any?)
        =target.write("[$tag] $message\n".toByteArray())


fun main(args: Array<String>) {
    log("bennt",System.out,"hello world")
    log("mozm")(System.out)("hello wordl2")

    val consolLogWithTag=log("mozm")(System.out)
    consolLogWithTag("HelloAgain Again")
    val bytes="我是中国人".toByteArray(charset("GBK"))
    val stringFromGBK= makeStringFromGbkBytes(bytes)
}

val makeString=fun(byteArray:ByteArray,charset:Charset):String{
    return String(byteArray, charset)
}

val makeStringFromGbkBytes= makeString.partial2(charset("GBK"))
fun <P1,P2,P3> Function2<P1,P2,P3>.partial2(p2:P2)=fun(p1:P1)=this(p1,p2)
fun <P1,P2,P3> Function2<P1,P2,P3>.partial1(p1:P1)=fun(p2:P2)=this(p1,p2)