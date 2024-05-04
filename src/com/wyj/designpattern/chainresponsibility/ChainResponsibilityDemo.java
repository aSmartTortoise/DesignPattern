package com.wyj.designpattern.chainresponsibility;

public class ChainResponsibilityDemo {
    public static void main(String[] args) {
        GroupLeader groupLeader = new GroupLeader();
        Director director = new Director();
        Manager manager = new Manager();
        Boss boss = new Boss();
        groupLeader.setSuccessor(director);
        director.setSuccessor(manager);
        manager.setSuccessor(boss);
        groupLeader.handleRequest(20_000);
    }
}
