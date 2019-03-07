package com.example.kotlindemo

import org.junit.Test
import org.junit.runner.RunWith
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.junit4.SpringRunner

@RunWith(SpringRunner::class)
@SpringBootTest
class KotlindemoApplicationTests {

    @Test
    fun contextLoads() {
        println(Int.MAX_VALUE)
        println(Int.MIN_VALUE)
        print("sum of 1 and 3 is ")
        println(sum(1,3))
        println("sum2 of 2 and 4 is ${sum2(2,4)}")
        sum3(12,9)
        var c:Int =2
        var d:Int=3
        println("c=$c,d=$d")

        var e=1
        var se="e is $e"
        e=4
        var se2="${se.replace("is","was")}, but now is $e"
        println(se2)

        var max = if(c>d)c else d
        println("max is ${max}")
        when(c){
            1-> println("c=1")
            2->println("c=2")
            else->{
                println("c is neither 1 or 2")
            }
        }
        printProduct("6","7")
        printProduct("A","7")

         var items = listOf("apple","banana","kiwi")
        for(item in items){
            println(item)
        }
        if(-1 !in 0..items.lastIndex){
            println("-1 is out of range")
        }
        if(items.size !in items.indices){
            println("list size is out of valid list indices range too")
        }
        if((items.size-2) in items.indices){
            println("list size is in list indices range too")
        }
        for(x in 1..10 step 2){
            print(" "+x)
        }
        println()
        for(y in 9 downTo 0 step 3){
            print(" "+y)
        }
        var items2 = listOf("baba","avoce","apple","kiwi")
        items2.filter{it.startsWith("a")}
                .sortedByDescending { it }
                .map { it.toUpperCase() }
                .forEach{println(it)}
    }
    fun sum(a: Int,b: Int):Int{
        return a+b
    }
    fun sum2(a:Int,b:Int)=a+b

    fun sum3(a:Int,b:Int){
        println("sum3 of $a and $b is ${a+b}")
    }
    fun parseInt(str:String):Int?{
        return str.toIntOrNull()
    }
    fun printProduct(arg1:String,arg2:String){
        var x=parseInt(arg1)
        var y=parseInt(arg2)

        if(x!=null&&y!=null){
            println("'$arg1'x'$arg2'="+(x*y))
        }else{
            println("either '$arg1' or '$arg2' is not a number")
        }
    }
}
