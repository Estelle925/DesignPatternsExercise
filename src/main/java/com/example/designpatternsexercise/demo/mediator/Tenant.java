package com.example.designpatternsexercise.demo.mediator;

public class Tenant {
    private String name;
    private XiaoQuFangLandlord xiaoQuFangLandlord2 = new XiaoQuFangLandlord();

    private NongMinFangLandlord nongMinFangLandlord2 = new NongMinFangLandlord();

    public Tenant(String name) {
        this.name = name;
    }

    public void lookAtHouse() {
        System.out.println(this.name + "想看农民房");
        nongMinFangLandlord2.supply();
        System.out.println(this.name + "想看小区房");
        xiaoQuFangLandlord2.supply();
    }
}
