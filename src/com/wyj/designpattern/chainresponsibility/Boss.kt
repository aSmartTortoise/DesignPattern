package com.wyj.designpattern.chainresponsibility

class Boss : Leader() {
    override fun limit() = Int.MAX_VALUE

    override fun handle(money: Int) {
        print("老板批复报销${money}元。")
    }
}