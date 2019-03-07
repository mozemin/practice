package com.example.kotlindemo

/**
 * create by mozemin on 2018/10/24
 * desc:
 */

class Complex(var real:Double,var imaginart:Double){
    operator fun plus(other:Complex):Complex{
        return Complex(real+other.real,imaginart+other.imaginart)
    }

    override fun toString(): String {
        return "$real+${imaginart}"
    }
}
class House

class ForbiddenCity{
    val houses = arrayOf(House(),House())

}

fun main(args: Array<String>) {
//    var c1= Complex(3.0,4.0)
//    var c2=Complex(2.5,4.6)
//    println(c1+c2)
    val fc = ForbiddenCity()

}