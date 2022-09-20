package com.example.designpatternsexercise.demo.chainofresponsibility;


public class Interviewee {
    private String name;
    private boolean teamLeaderOpinion;
    private boolean departmentManagerOpinion;
    private boolean hrOpinion;


    public Interviewee(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isTeamLeaderOpinion() {
        return teamLeaderOpinion;
    }

    public void setTeamLeaderOpinion(boolean teamLeaderOpinion) {
        this.teamLeaderOpinion = teamLeaderOpinion;
    }

    public boolean setDepartmentManagerOpinion() {
        return departmentManagerOpinion;
    }

    public void setDepartmentManagerOpinion(boolean departmentManagerOpinion) {
        this.departmentManagerOpinion = departmentManagerOpinion;
    }

    public boolean isHrOpinion() {
        return hrOpinion;
    }

    public void setHrOpinion(boolean hrOpinion) {
        this.hrOpinion = hrOpinion;
    }
}
