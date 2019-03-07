package com.example.kotlindemo.dataclass

/**
 * create by mozemin on 2018/11/8
 * desc:
 */

data class Country(val id:Int,val name:String){

}

class ComponentX(){
    operator fun component1():String{
        return "nin hao ,chain"
    }
    operator fun component2():Int{
        return 1
    }
    operator fun component3():Int{
        return 1
    }
    operator fun component4():Int{
        return 0
    }
}

fun main(args: Array<String>) {

    val chain =Country(0,"中国")
    println(chain)
    println(chain.component1())
    println(chain.component2())

    val(id,name)=chain
    println(id)
    println(name)

//    for ((index,value) in args.withIndex()){
//
//    }

    val componentX=ComponentX()
    val (a,b,c,d)=componentX
    println("$a $b $c $d")
}