package com.wyj.designpattern.chainresponsibility

class GroupLeader : Leader() {
    override fun limit() = 1000

    override fun handle(money: Int) {
        println("组长批复报销${money}元。")
    }
}