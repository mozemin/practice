package com.example.kotlindemo.dsl

import java.lang.StringBuilder

/**
 * create by mozemin on 2018/11/13
 * desc:
 */

open class Tag(val name:String):Node{
    var children=ArrayList<Node>()
    val proerties= HashMap<String,String>()
    override fun render():String {
        return StringBuilder()
                .append("<")
                .append(name)
                .let {
                    stringBuilder ->
                    if(!this.proerties.isEmpty()){
                        stringBuilder.append(" ")
                        this.proerties.forEach{
                            stringBuilder.append(it.key)
                            stringBuilder.append("=\"")
                            stringBuilder.append(it.value)
                            stringBuilder.append("\"")
                        }
                    }
                    stringBuilder
                }
                .append(">")
                .let {
                    stringBuilder -> children.map(Node::render ).map(stringBuilder::append)
                    stringBuilder
                }
                .append("</$name>")
                .toString()
    }

}