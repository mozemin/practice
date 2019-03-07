package com.example.kotlindemo.HigherorderFun

import java.lang.StringBuilder

/**
 * create by mozemin on 2018/11/9
 * desc:
 */

class Hello{
    fun world(){
        println("hello world")
    }
}


fun main(args: Array<String>) {
//   val hello=Hello::world
//    args.forEach { s -> s.isNotEmpty()}
//    args.filter(String::isNotEmpty)
    var ingter= arrayOf(1,2,3,4,5,6)
//    ingter.forEach { println(it) }
//    var newint= ingter.filter {i->i>2}
//    newint.forEach { println(it) }

//    val newList = ArrayList<Int>()
//    ingter.forEach{
//        val newEL=it*2+3
//        newList.add(newEL)
//    }
//    ingter.forEach { newList.add(it*2+3) }
//
//    newList.forEach(::println)

//    val newList2=ingter.map { it*2+2 }
////    newList2.forEach(::println)
////
////    var newList3=ingter.map(Int::toDouble)
////    newList3.forEach(::println)

//
//    var list = listOf(
//            1..10,
//            2..20
//    )
//    var intRange=1..4
//    intRange.forEach(::println)
//    list[0].forEach(::println)
//    var list2=list.flatMap { it }
//    list2.forEach(::println)
//
//    var list3= list.flatMap{intRange->intRange.map {
//        "NO:$it"
//        }
//    }
//    list3.forEach(::println)
//
//    println("sum="+list2.sum())
//
//    (0..6).map(::factoria).forEach(::println)
//
//    println((0..6).map(::factoria).sum())

//    println((0.rangeTo(5)).map(::factoria).fold(5){acc,i->acc+i})
//    println((0.rangeTo(5)).map(::factoria).fold(StringBuilder()){ acc, i->acc.append(i).append(",")})
//    println((0.rangeTo(5)).map(::factoria).foldRight(StringBuilder()){ i, acc->acc.append(i).append(",")})
//
//    println((0.rangeTo(6)).joinToString(","))

//    println((0..6).map(::factoria).filter { it%2==1 })
//    println((0..6).map(::factoria).filterIndexed{ index,i->index%2==1 })
//    println((0..6).map(::factoria).takeWhile { it%2==1 })
}



fun factoria(n:Int):Int{
    if(n==0){return 1}
    return (1..n).reduce{acc,i->acc*i}
}

