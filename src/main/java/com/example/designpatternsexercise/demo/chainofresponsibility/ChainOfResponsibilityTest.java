package com.example.designpatternsexercise.demo.chainofresponsibility;

public class ChainOfResponsibilityTest {
    public static void main(String[] args) {
        Interviewee interviewee = new Interviewee("小明");
        TeamLeader teamLeader = new TeamLeader("老刚");
        DepartmentManager departMentManager = new DepartmentManager("老孙");
        HR hr = new HR("老刘");
        // 设置面试流程
        teamLeader.setNextInterviewer(departMentManager);
        departMentManager.setNextInterviewer(hr);
        // 开始面试
        teamLeader.handleInterview(interviewee);

    }
}
