package com.example.designpatternsexercise.demo.chainofresponsibility;

import java.util.Random;

public class TeamLeader extends Interviewer {

    public TeamLeader(String name) {
        super(name);
    }

    @Override
    public void handleInterview(Interviewee interviewee) {
        System.out.println("组长[" + this.name + "]面试[" + interviewee.getName() + "]同学");
        interviewee.setTeamLeaderOpinion(new Random().nextBoolean());
        if (interviewee.isTeamLeaderOpinion()) {
            System.out.println("[" + interviewee.getName() + "]同学组 长轮面试通过");
            this.nextInterviewer.handleInterview(interviewee);
        } else {
            System.out.println("[" + interviewee.getName() + "]同学组 长轮面试不通过");
        }
    }
}
