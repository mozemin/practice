package com.example.kotlindemo.dsl

/**
 * create by mozemin on 2018/11/13
 * desc:
 */

fun main(args: Array<String>) {
//    Tag("Html").apply {
//        proerties["id"]="htmlid"
//        children.add(Tag("head"))
//    }.render().let(::println)
//    html{
//        head{
//
//        }
//        body{
//            id="body"
//            class="container"
//            style="width:90px;padding:5px"
//            "a"{
//                "class"("button")
//                width("90px")
//                "height"("90px")
//                +"hello world"
//            }
//            "div"{
//
//            }
//            "span"{
//
//            }
//        }
//    }.render().let(::println)

    val list: MutableList<String> = mutableListOf("A", "B", "C")
    val change: Any
//    change = list.let{
//        it.add("D")
//        it.add("E")
//        it.remove("A")
//        it.size
//    }
//    change = list.apply {
//        add("D")
//        add("E")
//        println(add("F"))
//        size
//    }
//    change = list.run {
//        add("D")
//        add("E")
//        println(add("F"))
//        size
//        //remove("A")
//    }

    change = with(list) {
        add("D")
        add("E")
        println(add("F"))
        size
    }

    println("list = $list")
    println("change = $change")

}