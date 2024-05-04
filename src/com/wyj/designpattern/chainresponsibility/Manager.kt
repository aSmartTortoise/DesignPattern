package com.wyj.designpattern.chainresponsibility

class Manager : Leader() {
    override fun limit() = 10000

    override fun handle(money: Int) {
        print("经理批复报销${money}元。")
    }
}