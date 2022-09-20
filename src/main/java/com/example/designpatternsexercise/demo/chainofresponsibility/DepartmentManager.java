package com.example.designpatternsexercise.demo.chainofresponsibility;

import java.util.Random;

public class DepartmentManager extends Interviewer {

    public DepartmentManager(String name) {
        super(name);
    }

    @Override
    public void handleInterview(Interviewee interviewee) {
        System.out.println("部门经理[" + this.name + "]面试[" + interviewee.getName() + "]同学");
        interviewee.setDepartmentManagerOpinion(new Random().nextBoolean());
        if (interviewee.setDepartmentManagerOpinion()) {
            System.out.println("[" + interviewee.getName() + "]同学部门经理轮面试通过");
            this.nextInterviewer.handleInterview(interviewee);
        } else {
            System.out.println("[" + interviewee.getName() + "]同学部门经理轮面试不通过");
        }
    }


}
