package com.example.designpatternsexercise.demo.order.command;

import com.example.designpatternsexercise.demo.order.nocommand.Developer;
import com.example.designpatternsexercise.demo.order.nocommand.Requirement;

public class CommandTest {
    public static void main(String[] args) {
        Developer xiaoMing = new Developer("小明");
        Command developCommand = new DevelopCommand(xiaoMing);
        Command suspendCommand = new SuspendCommand(xiaoMing);
        Requirement requirement = new Requirement("新增黑名单");
        TechnicalManager2 technicalManager = new TechnicalManager2("大明");
        technicalManager.setCommand(developCommand);
        technicalManager.action(requirement);
        System.out.println("开发了 2 天，需求变故，需要暂停。。。");
        technicalManager.setCommand(suspendCommand);
        technicalManager.action(requirement);
    }
}
