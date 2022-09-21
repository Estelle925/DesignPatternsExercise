package com.example.designpatternsexercise.demo.order.nocommand;

public class NoCommandTest {
    public static void main(String[] args) {
        Developer xiaoMing = new Developer("小明");
        Requirement requirement = new Requirement("新增黑名单");
        TechnicalManager1 technicalManager2 = new TechnicalManager1("大明");
        technicalManager2.setDeveloper(xiaoMing);
        technicalManager2.action(requirement, "develop");
        System.out.println("开发了 2 天，需求变故，需要暂停。。。");
        technicalManager2.action(requirement, "suspend");

    }
}
