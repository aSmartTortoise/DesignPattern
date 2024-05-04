package com.wyj.designpattern.chainresponsibility

abstract class Leader {
    var successor: Leader? = null

    fun handleRequest(money: Int) {
        if (money <= limit()) {
            handle(money)
        } else {
            successor?.let {
                println("${javaClass.simpleName}转交${it.javaClass.simpleName}处理")
                it.handleRequest(money)
            }
        }
    }

    abstract fun limit(): Int

    abstract fun handle(money: Int)
}