package com.wyj.designpattern.chainresponsibility

class Director : Leader() {
    override fun limit() = 5000

    override fun handle(money: Int) {
        print("主管批复报销${money}元。")
    }
}