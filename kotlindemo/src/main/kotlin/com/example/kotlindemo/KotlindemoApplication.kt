package com.example.kotlindemo

import com.sun.xml.internal.fastinfoset.util.StringArray
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class KotlindemoApplication

fun main(args: Array<String>) {
    //runApplication<KotlindemoApplication>(*args)
//     var range:IntRange=0..10
//     var rang2:IntRange=0..-1
//    println(range.endInclusive)
//    println(rang2.isEmpty())
//    println(400 in rang2)
//    println(400 in range)
//    for(i in range){
//        println(i)
//    }
//    var arrayInt:IntArray= intArrayOf(1,3,5,7,9)
//    var arratString:Array<String> = arrayOf("aa","bb","ccc","dd")
//    println(arrayInt.size)
//    for(i in arrayInt){
//        println(i)
//    }
//    println(arrayInt.joinToString(","))
//
//    println(arrayInt.slice(1..3))

    val FINAL_HEL ="hello word"
    var filett:String ="asdfasfasfd"
    if(args.size<1){
        println("请传入至少一个参数")
        System.exit(0)
    }else {
        args.forEach ForEach@{
            if(it=="q")return@ForEach
            println(it)
        }
    }
    println("The End")
    println(sum2(2,5))
    println(sum2.invoke(2,6))
    println(printHello is ()-> Unit)
    var p = person("","","")
    p.a = 10
    println(p.a)
    p.b="test111"
    println(p.b)
}

fun sum(a:Int,b:Int):Int{
    return a+b
}
fun sum1(a:Int,b:Int)=a+b

var c=fun(a:Int,b:Int):Int{return a+b}
var sum2={a:Int,b:Int->
    println("$a+$b =${a+b}")
    a+b
}

var printHello={
    println("hello")
}

